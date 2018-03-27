package br.edu.ifpb.service;

import br.edu.ifpb.domain.News;
import javax.inject.Inject;
import javax.jws.Oneway;
import javax.jws.WebService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/03/2018, 14:02:51
 */
@WebService
public class NewsSOAP {

    @Inject
    private ServiceNews service;

    @Oneway
    public void persist(News news) {
        this.service.persist(news);
    }

    public News[] all() {
        return this.service.all()
                .toArray(new News[]{});
    }

}
