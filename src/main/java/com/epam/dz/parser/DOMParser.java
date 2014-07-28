package com.epam.dz.parser;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMParser {
    public static void main() {
        try {
            File XMLF = new File("src/main/resources/aircraft.xml");
            DocumentBuilderFactory dbuilderFac = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbuilderFac.newDocumentBuilder();
            Document document = documentBuilder.parse(XMLF);
            document.getDocumentElement().normalize();
            NodeList nodes = document.getElementsByTagName("aircraft");
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                System.out.println("\nCurrent Element :" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    Node charac = element.getElementsByTagName("chars").item(0);
                    Element characters = (Element) charac;
                    Node param = element.getElementsByTagName("parametres").item(0);
                    Element parametres = (Element) param;
                    System.out.println("Aircraft ID:" + element.getAttribute("id"));
                    System.out.println("Aircraft Model:" + element.getElementsByTagName("model").item(0).getTextContent());
                    System.out.println("Aircraft IndividualNum:" + element.getElementsByTagName("individualNum").item(0).getTextContent());
                    System.out.println("Aircraft Origin:" + element.getElementsByTagName("origin").item(0).getTextContent());
                    System.out.println("Aircraft Type:" + element.getElementsByTagName("type").item(0).getTextContent());
                    System.out.println("               Aircraft characters");
                    System.out.println("Aircraft seats:" + characters.getElementsByTagName("seats").item(0).getTextContent());
                    System.out.println("Aircraft rockets:" + characters.getElementsByTagName("rockets").item(0).getTextContent());
                    System.out.println("Aircraft rockets number:" + characters.getElementsByTagName("rocketsNum").item(0).getTextContent());
                    System.out.println("               Aircraft parametres");
                    System.out.println("Aircraft fuel capacity:" + parametres.getElementsByTagName("fuelcapacity").item(0).getTextContent());
                    System.out.println("Aircraft max speed:" + parametres.getElementsByTagName("maxspeed").item(0).getTextContent());
                    System.out.println("Aircraft price:" + element.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("-------------------------------------------------------------------------------");
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
