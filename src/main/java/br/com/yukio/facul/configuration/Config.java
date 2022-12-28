package br.com.yukio.facul.configuration;

import br.com.yukio.facul.enuns.Sexo;
import br.com.yukio.facul.model.Abacaxi;
import br.com.yukio.facul.model.Materia;
import br.com.yukio.facul.model.Professor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Configuration
public class Config {
    @Bean
    List<Professor> getProfessores() {
        List<Professor> professores = new ArrayList<>();
        professores.add(new Professor(UUID.randomUUID(), "Hellyson, O Brabo", Sexo.OLHA_O_SKATE, getMateria()));
        return professores;
    }

    @Bean
    List<Materia> getMateria() {
        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia(UUID.randomUUID(), "Introdução a StringBoot", "1 do Teams"));
        materias.add(new Materia(UUID.randomUUID(), "EFEITO QUEDA LENTA", "Pista de skate"));
        return materias;
    }

    @Bean
    List<Abacaxi> getAlunos() {
        List<Abacaxi> alunos = new ArrayList<>();
        alunos.add(new Abacaxi(UUID.randomUUID(), "jeniffer Araujo", 245, Sexo.LOLI, false, new Date(), getMateria()));
        alunos.add(new Abacaxi(UUID.randomUUID(), "Michael Carreteiro", 245, Sexo.MASCULINO, false, new Date(), getMateria()));
        alunos.add(new Abacaxi(UUID.randomUUID(), "Jhon travolta", 235, Sexo.HELICOPTERO_DE_COMBATE, false, new Date(), getMateria()));
        return alunos;
    }
}
