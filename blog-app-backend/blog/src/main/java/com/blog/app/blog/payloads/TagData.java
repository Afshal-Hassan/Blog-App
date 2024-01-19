package com.blog.app.blog.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagData {
    
    @JsonProperty("id")
    private Long id;
    
    @JsonProperty("name")
    private String name;
}
