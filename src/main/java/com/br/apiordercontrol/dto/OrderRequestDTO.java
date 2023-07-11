package com.br.apiordercontrol.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequestDTO {

    @NotNull @Min(1)
    private Long clientId;

    @NotNull @Min(1)
    private Integer quantity;

    @NotEmpty
    private String status;

    @NotNull
    private Long phone;

    @Email
    private String email;
}
