package br.com.yukio.facul.model;

import br.com.yukio.facul.enuns.Sexo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Professor {
    private UUID matricula;
    private String nome;
    private Sexo sexo;
    private List<Materia> materiaSet;
}
