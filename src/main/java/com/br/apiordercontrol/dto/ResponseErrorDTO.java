package com.br.apiordercontrol.dto;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ResponseErrorDTO {

    private HttpStatusCode code;
    private String message;
}
