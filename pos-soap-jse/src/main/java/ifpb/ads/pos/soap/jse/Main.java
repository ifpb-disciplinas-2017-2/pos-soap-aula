package ifpb.ads.pos.soap.jse;

import br.edu.ifpb.service.News;
import br.edu.ifpb.service.NewsSOAP;
import br.edu.ifpb.service.NewsSOAPService;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/03/2018, 14:11:58
 */
public class Main {
    public static void main(String[] args) {
        NewsSOAPService service = new NewsSOAPService();
        NewsSOAP newsSOAPPort = service.getNewsSOAPPort();
        
        News news = new News();
        
        news.setTitle("POS is great!");
        news.setBody("SOAP isn't great :p");
        news.setAuth("Job");
        
        newsSOAPPort.persist(news);
        
        newsSOAPPort.all().stream()
                .forEach(n->System.out.println(n.getTitle()));
    }
}
