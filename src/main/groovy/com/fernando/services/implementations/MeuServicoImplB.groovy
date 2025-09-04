package com.fernando.services.implementations

import com.fernando.services.MeuServico
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class MeuServicoImplB implements MeuServico {
    @Override
    String executar() {
        return 'implementação b'
    }
}
