/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author khushpreetkaurgulati
 */
public class CalculateDetail {

private String name;
private int firstValue;
private int secondValue;

    /**
     * @return the name
     */
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
    public int getSecondValue() {
        return secondValue;
    }

    /**
     * @param secondValue the secondValue to set
     */
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

public int Add(int firstValue , int secondValue)
{
return firstValue + secondValue;
} 
public int Sub(int firstValue , int secondValue)
{
return firstValue - secondValue;
}    
}
