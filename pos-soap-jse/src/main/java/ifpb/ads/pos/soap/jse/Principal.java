package ifpb.ads.pos.soap.jse;

import ifpb.ads.pos.soap.CalculadoraSOAP;
import ifpb.ads.pos.soap.CalculadoraSOAPService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/03/2018, 14:05:21
 */
public class Principal {
    public static void main(String[] args) {
        CalculadoraSOAPService service = new CalculadoraSOAPService();
        CalculadoraSOAP calc = service.getCalculadoraSOAPPort();
        int somarSOAP = calc.somarSOAP(12, 14);
        System.out.println("somarSOAP = " + somarSOAP);
        int subtrairSOAP = calc.subtrair(12, 14);
        System.out.println("subtrairSOAP = " + somarSOAP);
    }
}
