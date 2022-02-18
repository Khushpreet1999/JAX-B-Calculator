/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorclientproject;

import com.model.CalculateDetailXML;
import com.services.Calculate;
import com.services.CalculateService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author khushpreetkaurgulati
 */
public class CalculatorClientProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
        CalculateService service = new CalculateService();
        Calculate port = service.getCalculatePort();
        int resultAdd = port.addition(4, 4);
        
        System.out.println("Result of Addition is :  " + resultAdd);
        
        int resultSub = port.subtraction(3, 3);
        System.out.println("Result of Subtraction is :  " + resultSub);
        
        
       
        
        try {
            //JAXB Marshalling - XML FILE
            
            CalculateDetailXML cdXML = new CalculateDetailXML();
            cdXML.setResultAdd(resultAdd);
            
            cdXML.setResultSub(resultSub);
            
            //Creating the JAXB  Context
            JAXBContext context = JAXBContext.newInstance(CalculateDetailXML.class);
            //Creating the marshaller object
            Marshaller marshallObj = context.createMarshaller();
            
            //calling the marshall method
            
            marshallObj.marshal(cdXML, new FileOutputStream("CalculateResultXML.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(CalculatorClientProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CalculatorClientProject.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        File file = new File("CalculateResultXML.xml");
        try {
             JAXBContext unmarshallContext = JAXBContext.newInstance(CalculateDetailXML.class);
             Unmarshaller unmarshall = unmarshallContext.createUnmarshaller();
             CalculateDetailXML calculateunmarshalledobj = (CalculateDetailXML) unmarshall.unmarshal(file);
             System.out.println("Name is " + calculateunmarshalledobj.getName());
             
        } catch (JAXBException ex) {
            Logger.getLogger(CalculatorClientProject.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
}
