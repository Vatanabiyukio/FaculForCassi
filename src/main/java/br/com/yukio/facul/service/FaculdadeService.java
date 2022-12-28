package br.com.yukio.facul.service;

import br.com.yukio.facul.model.Abacaxi;
import br.com.yukio.facul.model.XtiFaculdade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class FaculdadeService {
    @Autowired
    XtiFaculdade xtiFaculdade;

    public void trancarFaculdade(Abacaxi alunun) {
        for (var a : xtiFaculdade.getAlunos()) {
            if (a.getNome() == alunun.getNome()) {
                a.setTrancado(true);
                log.info(a.toString()+" VOCE CAIU COM SUCESSO!");
                break;
            }
        }
    }
}
