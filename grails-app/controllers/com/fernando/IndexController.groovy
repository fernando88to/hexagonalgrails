package com.fernando

import com.fernando.services.MeuServico
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class IndexController {

    MeuServico meuServico


    def index() {
        render(meuServico.executar())
    }
}
