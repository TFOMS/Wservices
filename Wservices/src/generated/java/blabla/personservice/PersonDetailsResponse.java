
package blabla.personservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonDetailMethod" type="{http://blabla/personservice}Person"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personDetailMethod"
})
@XmlRootElement(name = "PersonDetailsResponse")
public class PersonDetailsResponse {

    @XmlElement(name = "PersonDetailMethod", required = true)
    protected Person personDetailMethod;

    /**
     * Gets the value of the personDetailMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonDetailMethod() {
        return personDetailMethod;
    }

    /**
     * Sets the value of the personDetailMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonDetailMethod(Person value) {
        this.personDetailMethod = value;
    }

}
