package com.fernando

import com.fernando.services.MeuServico

class IndexController {


    MeuServico meuServico


    def index() {
        render(meuServico.executar())
    }
}
