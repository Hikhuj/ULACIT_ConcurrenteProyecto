
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _MainLogin_QNAME = new QName("http://ws/", "mainLogin");
    private final static QName _MainLoginResponse_QNAME = new QName("http://ws/", "mainLoginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MainLogin }
     * 
     */
    public MainLogin createMainLogin() {
        return new MainLogin();
    }

    /**
     * Create an instance of {@link MainLoginResponse }
     * 
     */
    public MainLoginResponse createMainLoginResponse() {
        return new MainLoginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MainLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mainLogin")
    public JAXBElement<MainLogin> createMainLogin(MainLogin value) {
        return new JAXBElement<MainLogin>(_MainLogin_QNAME, MainLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MainLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mainLoginResponse")
    public JAXBElement<MainLoginResponse> createMainLoginResponse(MainLoginResponse value) {
        return new JAXBElement<MainLoginResponse>(_MainLoginResponse_QNAME, MainLoginResponse.class, null, value);
    }

}
