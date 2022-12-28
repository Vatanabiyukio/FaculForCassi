package br.com.yukio.facul.model;

import java.util.List;

public interface IFaculdade {
    List<Abacaxi> getAlunos();
    List<Materia> getMaterias();
    List<Professor> getProfessores();
}
