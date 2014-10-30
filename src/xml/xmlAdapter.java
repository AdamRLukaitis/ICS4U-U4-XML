/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.IOException;
import java.util.List;
  
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.util.IteratorIterable;
  

/**
 *
 * @author student1
 */
public class xmlAdapter {
    
    String xmlFileName = "xmltest1.xml";
    String xmlValidFile = "xmlvalid1.xml";
    
    public void xmlData(){}
    
    public void readXML(String fileNameAndPath){
    }
    
    public void writeXML(String fileNameAndPath){
        try{
            Element xmlElementRoot = new Element("WhackAMole");
            Document xmlDocument = new Document(xmlElementRoot);
            
            // First Sub-Element is Player
            Element xmlPlayer = new Element("Player");
            
        } catch (IOException ioe){
        }
    }
    
    
    
    
}
