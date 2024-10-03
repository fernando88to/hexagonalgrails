@artifact.package@
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class NomeServiceSpec extends Specification implements ServiceUnitTest<NomeService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
