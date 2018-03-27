
package br.edu.ifpb.service;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewsSOAP", targetNamespace = "http://service.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewsSOAP {


    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.service.News>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "all", targetNamespace = "http://service.ifpb.edu.br/", className = "br.edu.ifpb.service.All")
    @ResponseWrapper(localName = "allResponse", targetNamespace = "http://service.ifpb.edu.br/", className = "br.edu.ifpb.service.AllResponse")
    @Action(input = "http://service.ifpb.edu.br/NewsSOAP/allRequest", output = "http://service.ifpb.edu.br/NewsSOAP/allResponse")
    public List<News> all();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "persist", targetNamespace = "http://service.ifpb.edu.br/", className = "br.edu.ifpb.service.Persist")
    @Action(input = "http://service.ifpb.edu.br/NewsSOAP/persist")
    public void persist(
        @WebParam(name = "arg0", targetNamespace = "")
        News arg0);

}