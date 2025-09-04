package com.fernando.services.implementations

import com.fernando.NomeService
import com.fernando.services.MeuServico
import grails.compiler.GrailsCompileStatic
import groovy.util.logging.Slf4j

@GrailsCompileStatic
@Slf4j
class MeuServicoImplA implements MeuServico {

//    @Autowired
//    NomeService nomeService
//      usei pelo construtor
    NomeService nomeService

    MeuServicoImplA(NomeService nomeService) {
        this.nomeService = nomeService
    }

    @Override
    String executar() {
        log.error('pau')
        return 'implementação a ' + nomeService.nome()
    }
}
