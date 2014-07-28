package com.epam.dz.parser;

import java.io.File;
import java.io.IOException;
import java.util.List;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;



public class XMLParserSAX {

    public static void main() {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            com.epam.dz.parser.SAXParser parser = new com.epam.dz.parser.SAXParser();
            saxParser.parse(new File("src/main/resources/aircraft.xml"), parser);
            List<Aircrafts> aircraftsList=parser.getResult();
            for (Aircrafts aircrafts : aircraftsList) {
                System.out.println(aircrafts);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

}