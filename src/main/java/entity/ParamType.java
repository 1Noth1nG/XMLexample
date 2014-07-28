
package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fuelcapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxspeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramType", namespace = "http://www.example.com/aircraft", propOrder = {
    "fuelcapacity",
    "maxspeed"
})
public class ParamType {

    protected int fuelcapacity;
    protected int maxspeed;

    /**
     * Gets the value of the fuelcapacity property.
     * 
     */
    public int getFuelcapacity() {
        return fuelcapacity;
    }

    /**
     * Sets the value of the fuelcapacity property.
     * 
     */
    public void setFuelcapacity(int value) {
        this.fuelcapacity = value;
    }

    /**
     * Gets the value of the maxspeed property.
     * 
     */
    public int getMaxspeed() {
        return maxspeed;
    }

    /**
     * Sets the value of the maxspeed property.
     * 
     */
    public void setMaxspeed(int value) {
        this.maxspeed = value;
    }

}
