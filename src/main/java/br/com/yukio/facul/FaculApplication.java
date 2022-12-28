package br.com.yukio.facul;

import br.com.yukio.facul.enuns.Sexo;
import br.com.yukio.facul.model.Abacaxi;
import br.com.yukio.facul.model.XtiFaculdade;
import br.com.yukio.facul.service.FaculdadeService;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class FaculApplication {
    @Autowired
    FaculdadeService faculdadeService;

    @Autowired
    XtiFaculdade xtiFaculdade;

    @PreDestroy
    public void Destroy(){
        Abacaxi aluno = new Abacaxi(UUID.randomUUID(), "Michael Carreteiro", 245, Sexo.MASCULINO, false, new Date(), xtiFaculdade.getMaterias());
        faculdadeService.trancarFaculdade(aluno);
    }
    public static void main(String[] args) {
        SpringApplication.run(FaculApplication.class, args);
    }

}
