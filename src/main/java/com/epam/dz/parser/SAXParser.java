package com.epam.dz.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXParser extends DefaultHandler {
Aircrafts aircraft=null;
   String thisElement="";
    List<Aircrafts> aircraftsList=new ArrayList<>();

    public List<Aircrafts> getResult() {
        return aircraftsList;
    }


    @Override
    public void startDocument() throws SAXException {

        System.out.println("Start parse XML");
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        thisElement = qName;
        if (thisElement.equalsIgnoreCase("aircraft")) {
            //create a new Employee and put it in Map
            String id = attributes.getValue("id");
            //initialize Employee object and set id attribute
            aircraft = new Aircrafts();
            aircraft.setId(Integer.parseInt(id));


        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        thisElement =" ";
        if(!aircraftsList.contains(aircraft))
        aircraftsList.add(aircraft);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if(thisElement.equals("model"))
            aircraft.setModel(new String(ch,start,length));
        else if(thisElement.equals("individualNum"))
            aircraft.setIndividualNum(new String(ch,start,length));
        else if(thisElement.equals("origin"))
            aircraft.setOrigin(new String(ch,start,length));
        else if(thisElement.equals("type"))
            aircraft.setType(new String(ch,start,length));
        else if (thisElement.equals("seats"))
            aircraft.setSeats(new Integer(new String(ch, start, length)));
        else if (thisElement.equals("rockets"))
            aircraft.setRockets(new Boolean(new String(ch, start, length)));
        else if (thisElement.equals("rocketsNum"))
            aircraft.setRocketsNum(new Integer(new String(ch, start, length)));
        else if (thisElement.equals("price"))
            aircraft.setPrice(new Double(new String(ch, start, length)));
        }
    @Override
    public void endDocument() throws SAXException {

        System.out.println("XML file was parsed");
    }
}
