/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author khushpreetkaurgulati
 */

@XmlRootElement
public class CalculateDetailXML {

    /**
     * @return the resultAdd
     */
    @XmlElement
    public int getResultAdd() {
        return resultAdd;
    }

    /**
     * @param resultAdd the resultAdd to set
     */
    public void setResultAdd(int resultAdd) {
        this.resultAdd = resultAdd;
    }

    /**
     * @return the resultSub
     */
     @XmlElement
    public int getResultSub() {
        return resultSub;
    }

    /**
     * @param resultSub the resultSub to set
     */
    public void setResultSub(int resultSub) {
        this.resultSub = resultSub;
    }

    /**
     * @return the result
     */
     
    
private String name;
private int firstValue;
private int secondValue;
private int resultAdd;
private int resultSub;

    /**
     * @return the name
     */
@XmlElement
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the firstValue
     */
    @XmlElement
    public int getFirstValue() {
        return firstValue;
    }

    /**
     * @param firstValue the firstValue to set
     */
    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    /**
     * @return the secondValue
     */
    @XmlElement
    public int getSecondValue() {
        return secondValue;
    }

    /**
     * @param secondValue the secondValue to set
     */
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
    
    
    
}
