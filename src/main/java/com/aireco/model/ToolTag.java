package com.aireco.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tool_tags")
public class ToolTag {

    @EmbeddedId
    private ToolTagId id;
}