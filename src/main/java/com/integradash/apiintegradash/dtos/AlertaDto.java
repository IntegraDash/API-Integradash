package com.integradash.apiintegradash.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

public record AlertaDto(
        @NotBlank String nomealerta,
        @NotBlank String nivel_criticidade ,

        @NotBlank @DateTimeFormat(pattern="dd/MM/yyyy") Date data_alerta,

        @NotBlank String status_alerta,
        @NotBlank String descricao_alerta

//        @NotBlank @DateTimeFormat Date data_alerta, //datetime alterar
) {
}
