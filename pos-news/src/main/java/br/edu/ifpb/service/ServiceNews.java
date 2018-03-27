package br.edu.ifpb.service;

import br.edu.ifpb.domain.News;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/03/2018, 14:00:26
 */
@Stateless
public class ServiceNews {

    @PersistenceContext
    private EntityManager em;

    public void persist(News news) {
        em.persist(news);
    }

    public List<News> all() {
        return em.createQuery("FROM News n", News.class)
                .getResultList();
    }

}
