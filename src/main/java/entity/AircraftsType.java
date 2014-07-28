
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aircraftsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aircraftsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="individualNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chars" type="{http://www.example.com/aircraft}charType"/>
 *         &lt;element name="parametres" type="{http://www.example.com/aircraft}paramType"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aircraftsType", namespace = "http://www.example.com/aircraft", propOrder = {
    "model",
    "individualNum",
    "origin",
    "type",
    "chars",
    "parametres",
    "price"
})
public class AircraftsType {

    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected String individualNum;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected CharType chars;
    @XmlElement(required = true)
    protected ParamType parametres;
    protected int price;
    @XmlAttribute(name = "id", required = true)
    protected int id;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the individualNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualNum() {
        return individualNum;
    }

    /**
     * Sets the value of the individualNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualNum(String value) {
        this.individualNum = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the chars property.
     * 
     * @return
     *     possible object is
     *     {@link CharType }
     *     
     */
    public CharType getChars() {
        return chars;
    }

    /**
     * Sets the value of the chars property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharType }
     *     
     */
    public void setChars(CharType value) {
        this.chars = value;
    }

    /**
     * Gets the value of the parametres property.
     * 
     * @return
     *     possible object is
     *     {@link ParamType }
     *     
     */
    public ParamType getParametres() {
        return parametres;
    }

    /**
     * Sets the value of the parametres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamType }
     *     
     */
    public void setParametres(ParamType value) {
        this.parametres = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
