package br.com.gestaovagas.GestaoVagas.modules.candidate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileUserDTO {

    private String email;
    private UUID id;
    private String description;
    private String username;
    private String name;
}
