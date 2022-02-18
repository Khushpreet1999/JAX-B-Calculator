/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidSem;

import javax.ejb.Remote;

/**
 *
 * @author khushpreetkaurgulati
 */
@Remote
public interface CalculationRemote {
      
    public int add(int a , int b);
    public int subtract(int a , int b);
    public int multiply(int a , int b);
    
    
    
}
