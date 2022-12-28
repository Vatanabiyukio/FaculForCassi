package br.com.yukio.facul.model;

import br.com.yukio.facul.enuns.Sexo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Abacaxi {
    private UUID matricula;
    private String nome;
    private int idade;
    private Sexo sexo;
    private Boolean trancado;
    private Date dataMatricula;
    private List<Materia> materiaSet;
}
