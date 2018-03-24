
package ifpb.ads.pos.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifpb.ads.pos.soap package. 
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

    private final static QName _SomarSOAP_QNAME = new QName("http://soap.pos.ads.ifpb/", "somarSOAP");
    private final static QName _Subtrair_QNAME = new QName("http://soap.pos.ads.ifpb/", "subtrair");
    private final static QName _SubtrairResponse_QNAME = new QName("http://soap.pos.ads.ifpb/", "subtrairResponse");
    private final static QName _SomarSOAPResponse_QNAME = new QName("http://soap.pos.ads.ifpb/", "somarSOAPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifpb.ads.pos.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomarSOAP }
     * 
     */
    public SomarSOAP createSomarSOAP() {
        return new SomarSOAP();
    }

    /**
     * Create an instance of {@link SomarSOAPResponse }
     * 
     */
    public SomarSOAPResponse createSomarSOAPResponse() {
        return new SomarSOAPResponse();
    }

    /**
     * Create an instance of {@link Subtrair }
     * 
     */
    public Subtrair createSubtrair() {
        return new Subtrair();
    }

    /**
     * Create an instance of {@link SubtrairResponse }
     * 
     */
    public SubtrairResponse createSubtrairResponse() {
        return new SubtrairResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarSOAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.pos.ads.ifpb/", name = "somarSOAP")
    public JAXBElement<SomarSOAP> createSomarSOAP(SomarSOAP value) {
        return new JAXBElement<SomarSOAP>(_SomarSOAP_QNAME, SomarSOAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtrair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.pos.ads.ifpb/", name = "subtrair")
    public JAXBElement<Subtrair> createSubtrair(Subtrair value) {
        return new JAXBElement<Subtrair>(_Subtrair_QNAME, Subtrair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtrairResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.pos.ads.ifpb/", name = "subtrairResponse")
    public JAXBElement<SubtrairResponse> createSubtrairResponse(SubtrairResponse value) {
        return new JAXBElement<SubtrairResponse>(_SubtrairResponse_QNAME, SubtrairResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarSOAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.pos.ads.ifpb/", name = "somarSOAPResponse")
    public JAXBElement<SomarSOAPResponse> createSomarSOAPResponse(SomarSOAPResponse value) {
        return new JAXBElement<SomarSOAPResponse>(_SomarSOAPResponse_QNAME, SomarSOAPResponse.class, null, value);
    }

}
