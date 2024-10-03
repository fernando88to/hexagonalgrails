import com.fernando.services.implementations.MeuServicoImplA
import com.fernando.services.implementations.MeuServicoImplB

// Place your Spring DSL code here
beans = {
    String tipoServico = grailsApplication.config.getProperty('meuServico.tipo', String)

    if (tipoServico == 'A') {
        meuServico(MeuServicoImplA)
    } else {
        meuServico(MeuServicoImplB)
    }
}
