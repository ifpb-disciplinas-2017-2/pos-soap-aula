package ifpb.ads.pos;

import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/03/2018, 13:25:59
 */
@Stateless
public class CalculadoraSimples {

    public int somar(int a, int b) {
        return a + b;
    }
    public int subtrair(int a, int b) {
        return a - b;
    }
}
