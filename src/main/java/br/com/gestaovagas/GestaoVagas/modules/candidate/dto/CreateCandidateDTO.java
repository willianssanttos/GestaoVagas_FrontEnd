package br.com.gestaovagas.GestaoVagas.modules.candidate.dto;

import lombok.Data;

@Data
public class CreateCandidateDTO {

    private String username;
    private String password;
    private String name;
    private String email;
    private String description;
}
