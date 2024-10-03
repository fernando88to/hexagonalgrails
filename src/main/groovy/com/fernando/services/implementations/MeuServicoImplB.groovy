package com.fernando.services.implementations

import com.fernando.services.MeuServico

class MeuServicoImplB implements MeuServico {
    @Override
    String executar() {
        return 'implementação b'
    }
}
