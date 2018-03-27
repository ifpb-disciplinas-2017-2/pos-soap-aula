
package br.edu.ifpb.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Persist_QNAME = new QName("http://service.ifpb.edu.br/", "persist");
    private final static QName _AllResponse_QNAME = new QName("http://service.ifpb.edu.br/", "allResponse");
    private final static QName _All_QNAME = new QName("http://service.ifpb.edu.br/", "all");
    private final static QName _News_QNAME = new QName("http://service.ifpb.edu.br/", "news");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link All }
     * 
     */
    public All createAll() {
        return new All();
    }

    /**
     * Create an instance of {@link News }
     * 
     */
    public News createNews() {
        return new News();
    }

    /**
     * Create an instance of {@link AllResponse }
     * 
     */
    public AllResponse createAllResponse() {
        return new AllResponse();
    }

    /**
     * Create an instance of {@link Persist }
     * 
     */
    public Persist createPersist() {
        return new Persist();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ifpb.edu.br/", name = "persist")
    public JAXBElement<Persist> createPersist(Persist value) {
        return new JAXBElement<Persist>(_Persist_QNAME, Persist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ifpb.edu.br/", name = "allResponse")
    public JAXBElement<AllResponse> createAllResponse(AllResponse value) {
        return new JAXBElement<AllResponse>(_AllResponse_QNAME, AllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link All }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ifpb.edu.br/", name = "all")
    public JAXBElement<All> createAll(All value) {
        return new JAXBElement<All>(_All_QNAME, All.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link News }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ifpb.edu.br/", name = "news")
    public JAXBElement<News> createNews(News value) {
        return new JAXBElement<News>(_News_QNAME, News.class, null, value);
    }

}
