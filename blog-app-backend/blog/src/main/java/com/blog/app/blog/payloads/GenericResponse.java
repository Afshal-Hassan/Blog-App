package com.blog.app.blog.payloads;

import java.io.Serializable;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse implements Serializable {
 
    private String message; 
    private Object data;
}
