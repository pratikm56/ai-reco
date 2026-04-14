package com.aireco.repository;

import com.aireco.model.ToolTag;
import com.aireco.model.ToolTagId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToolTagRepository extends JpaRepository<ToolTag, ToolTagId> {
    List<ToolTag> findByIdTagIdIn(List<Integer> tagIds);
}