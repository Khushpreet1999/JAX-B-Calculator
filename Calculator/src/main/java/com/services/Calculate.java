/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.services;

import com.model.CalculateDetail;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author khushpreetkaurgulati
 */
@WebService
public class Calculate {


@WebMethod
public int Addition(@WebParam(name="FirstValue") int a, @WebParam(name="SecondValue")int b)
{
  CalculateDetail cd = new CalculateDetail();
  cd.setFirstValue(a);
  cd.setSecondValue(b);
  cd.setName("Scientific Calculator");
  return cd.Add(a,b);
    
}
public int Subtraction(@WebParam(name="FirstValue") int a, @WebParam(name="SecondValue")int b)
{
   CalculateDetail cd = new CalculateDetail();
  cd.setFirstValue(a);
  cd.setSecondValue(b);
  cd.setName("Scientific Calculator");
  return cd.Sub(a,b);
 
    
}
}
