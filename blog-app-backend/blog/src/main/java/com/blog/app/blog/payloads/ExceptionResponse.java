package com.blog.app.blog.payloads;

import java.util.Date;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExceptionResponse {

    private Date timestamp;
    private String message;
    private String details;
}
