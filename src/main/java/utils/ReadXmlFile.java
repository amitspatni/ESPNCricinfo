package utils;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ReadXmlFile {

    public static void main(String[] arg) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("src/main/java/resources/xpath.xml");


        //extract root node from xml doc
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        for (int i = 1; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String tagName = element.getTagName();
                String textContent = element.getTextContent();

                System.out.println(textContent);
            }
        }
        //return document.getTextContent();

    }

    public static String getXpathFromXml(String pageName, String WebElementXpath) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("src/main/java/resources/xpath.xml");


        //extract root node from xml doc
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        for (int i = 1; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String tagName = element.getTagName();
                String textContent = element.getTextContent();

                System.out.println(textContent);
            }
        }
        return document.getTextContent();

    }

}
