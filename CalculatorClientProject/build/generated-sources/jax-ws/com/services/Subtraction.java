
package com.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subtraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subtraction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SecondValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subtraction", propOrder = {
    "firstValue",
    "secondValue"
})
public class Subtraction {

    @XmlElement(name = "FirstValue")
    protected int firstValue;
    @XmlElement(name = "SecondValue")
    protected int secondValue;

    /**
     * Gets the value of the firstValue property.
     * 
     */
    public int getFirstValue() {
        return firstValue;
    }

    /**
     * Sets the value of the firstValue property.
     * 
     */
    public void setFirstValue(int value) {
        this.firstValue = value;
    }

    /**
     * Gets the value of the secondValue property.
     * 
     */
    public int getSecondValue() {
        return secondValue;
    }

    /**
     * Sets the value of the secondValue property.
     * 
     */
    public void setSecondValue(int value) {
        this.secondValue = value;
    }

}
