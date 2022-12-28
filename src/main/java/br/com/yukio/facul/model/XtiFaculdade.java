package br.com.yukio.facul.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class XtiFaculdade implements IFaculdade {
    @Autowired
    private List<Abacaxi> Alunos;
    @Autowired
    private List<Materia> Materias;
    @Autowired
    private List<Professor> Professores;
}
