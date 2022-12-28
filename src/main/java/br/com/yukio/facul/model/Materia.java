package br.com.yukio.facul.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Materia {
    private UUID id;
    private String nome;
    private String sala;
}
