package ifpb.ads.pos.soap;

import ifpb.ads.pos.CalculadoraSimples;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/03/2018, 13:34:56
 */
@WebService
@Stateless
public class CalculadoraSOAP {

    @Inject
    private CalculadoraSimples calculadora;

    @WebMethod(operationName = "somarSOAP")
    public int somar(@WebParam(name = "a") int a,
            @WebParam(name = "b") int b) {
        return calculadora.somar(a, b);
    }
    @WebMethod(operationName = "subtrair")
    public int subtrair(@WebParam(name = "a") int a,
            @WebParam(name = "b") int b) {
        return calculadora.subtrair(a, b);
    }
}


// /Users/job/Documents/dev/testes/20172/pos-soap-jse/src/main/java
// wsimport -Xnocompile -keep -verbose http://localhost:8080/CalculadoraSOAPService/CalculadoraSOAP?wsdl