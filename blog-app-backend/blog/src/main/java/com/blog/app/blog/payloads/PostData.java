package com.blog.app.blog.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostData {
    
    @JsonProperty("id")
    private Long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("text")
    private String text;

    @JsonProperty("description")
    private String description;

    @JsonProperty("uploadedAt")
    private String uploadedAt;

    @JsonProperty("tags")
    private List<TagData> tags;

    @JsonProperty("userId")
    private Long userId;
}
