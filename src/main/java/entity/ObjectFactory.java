
package entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the entity package. 
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

    private final static QName _Aircrafts_QNAME = new QName("http://www.example.com/aircraft", "aircrafts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StListType }
     * 
     */
    public StListType createStListType() {
        return new StListType();
    }

    /**
     * Create an instance of {@link CharType }
     * 
     */
    public CharType createCharType() {
        return new CharType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link AircraftsType }
     * 
     */
    public AircraftsType createAircraftsType() {
        return new AircraftsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/aircraft", name = "aircrafts")
    public JAXBElement<StListType> createAircrafts(StListType value) {
        return new JAXBElement<StListType>(_Aircrafts_QNAME, StListType.class, null, value);
    }

}
