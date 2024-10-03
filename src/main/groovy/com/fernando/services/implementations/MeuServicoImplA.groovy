package com.fernando.services.implementations

import com.fernando.NomeService
import com.fernando.services.MeuServico
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired



@Slf4j
class MeuServicoImplA implements MeuServico {

    @Autowired
    NomeService nomeService

    @Override
    String executar() {
        log.error('pau')
        return 'implementação a ' + nomeService.nome()
    }
}
