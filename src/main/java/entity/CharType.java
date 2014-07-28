
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for charType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="charType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rockets" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rocketsNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "charType", namespace = "http://www.example.com/aircraft", propOrder = {
    "seats",
    "rockets",
    "rocketsNum"
})
public class CharType {

    protected int seats;
    protected boolean rockets;
    protected int rocketsNum;

    /**
     * Gets the value of the seats property.
     * 
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     */
    public void setSeats(int value) {
        this.seats = value;
    }

    /**
     * Gets the value of the rockets property.
     * 
     */
    public boolean isRockets() {
        return rockets;
    }

    /**
     * Sets the value of the rockets property.
     * 
     */
    public void setRockets(boolean value) {
        this.rockets = value;
    }

    /**
     * Gets the value of the rocketsNum property.
     * 
     */
    public int getRocketsNum() {
        return rocketsNum;
    }

    /**
     * Sets the value of the rocketsNum property.
     * 
     */
    public void setRocketsNum(int value) {
        this.rocketsNum = value;
    }

}
