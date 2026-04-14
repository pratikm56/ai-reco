package com.aireco.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;

@Data
@Embeddable
public class ToolTagId implements Serializable {
    private Integer toolId;
    private Integer tagId;
}