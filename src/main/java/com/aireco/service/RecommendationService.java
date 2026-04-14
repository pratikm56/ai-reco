package com.aireco.service;

import com.aireco.model.*;
import com.aireco.repository.*;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    private final TagRepository tagRepo;
    private final ToolTagRepository toolTagRepo;
    private final AiToolRepository toolRepo;

    public RecommendationService(TagRepository tagRepo,
                                 ToolTagRepository toolTagRepo,
                                 AiToolRepository toolRepo) {
        this.tagRepo = tagRepo;
        this.toolTagRepo = toolTagRepo;
        this.toolRepo = toolRepo;
    }

    public List<AiTool> recommendTools(String input) {

        List<String> words = Arrays.stream(input.toLowerCase().split(" "))
                .toList();

        List<Tag> matchedTags = tagRepo.findByNameIn(words);
        List<Integer> tagIds = matchedTags.stream().map(Tag::getId).toList();

        List<ToolTag> mappings = toolTagRepo.findByIdTagIdIn(tagIds);

        // 🔥 Count matches per tool
        Map<Integer, Integer> toolScore = new HashMap<>();

        for (ToolTag m : mappings) {
            Integer toolId = m.getId().getToolId();
            toolScore.put(toolId, toolScore.getOrDefault(toolId, 0) + 1);
        }

        // 🔥 Sort by score DESC
        List<Integer> sortedToolIds = toolScore.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .map(Map.Entry::getKey)
                .toList();

        return toolRepo.findAllById(sortedToolIds);
    }
}