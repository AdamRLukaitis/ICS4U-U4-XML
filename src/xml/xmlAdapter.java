/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.jdom2.util.IteratorIterable;

/**
 *
 * @author student1
 */
public class xmlAdapter {

    String xmlFileName = "xmltest1.xml";
    String xmlValidFile = "xmlvalid1.xml";
    dataGame data;

    public void xmlData() {
    }

    public void readXML(String fileNameAndPath) {
    }

    public void writeXML(String fileNameAndPath) {

        Element xmlElementRoot = new Element("WhackAMole");
        Document xmlDocument = new Document(xmlElementRoot);

        // First Sub-Element is Player
        Element xmlPlayer = new Element("Player");
        xmlPlayer.setAttribute(new Attribute("id", "1"));
        xmlPlayer.addContent(new Element("Name").setText(data.player.getName()));
        Element xmlHighScores = new Element("HighScores");
        xmlHighScores.addContent(new Element("1").setText(String.valueOf(data.player.getHighScore(1))));
        xmlHighScores.addContent(new Element("2").setText(String.valueOf(data.player.getHighScore(2))));
        xmlHighScores.addContent(new Element("3").setText(String.valueOf(data.player.getHighScore(3))));
        xmlHighScores.addContent(new Element("4").setText(String.valueOf(data.player.getHighScore(4))));
        xmlHighScores.addContent(new Element("5").setText(String.valueOf(data.player.getHighScore(5))));
        xmlHighScores.addContent(new Element("6").setText(String.valueOf(data.player.getHighScore(6))));
        xmlHighScores.addContent(new Element("7").setText(String.valueOf(data.player.getHighScore(7))));
        xmlHighScores.addContent(new Element("8").setText(String.valueOf(data.player.getHighScore(8))));
        xmlHighScores.addContent(new Element("9").setText(String.valueOf(data.player.getHighScore(9))));
        xmlHighScores.addContent(new Element("10").setText(String.valueOf(data.player.getHighScore(10))));
        xmlPlayer.addContent(xmlHighScores);
        xmlDocument.getRootElement().addContent(xmlPlayer);

        XMLOutputter xmlOutput = new XMLOutputter();
        

    }
}
