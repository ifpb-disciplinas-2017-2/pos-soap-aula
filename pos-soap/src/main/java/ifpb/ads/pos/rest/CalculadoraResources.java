package ifpb.ads.pos.rest;

import ifpb.ads.pos.CalculadoraSimples;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/03/2018, 13:27:01
 */
@Path("calc")
@Stateless
public class CalculadoraResources {

    @Inject
    private CalculadoraSimples calculadora;

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response somar(@FormParam("a") int a,
            @FormParam("b") int b) {
        int retorno = calculadora.somar(a, b);

        JsonObject build = Json.createObjectBuilder()
                .add("resposta", retorno).build();

        return Response.ok()
                .entity(build)
                .build();
    }
}
