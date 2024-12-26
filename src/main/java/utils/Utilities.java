package utils;


import Framework.FrameWorkException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.*;

public class Utilities {

    public static void main(String[] arg) throws ParserConfigurationException, IOException, SAXException {


        String pageName = "MyLiveScorePage";
        String xpathForWebElement = "btn_popUp_not_now";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("src/test/resources/xpath.xml");
        //extract root node from xml doc
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        //to iterate over parent node - pages name
        for (int i = 1; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            NodeList childNodes = nodeList.item(i).getChildNodes();

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node.getChildNodes();

                String tagName = element.getTagName();
                // if condition using xpath tag name == link_Live_Scores
                if (tagName.equals(pageName)) {

                    //to iterate over child node under pages
                    for (int j = 1; i < childNodes.getLength(); j++) {
                        Node node2 = childNodes.item(j);

                        if (node2.getNodeType() == Node.ELEMENT_NODE) {
                            Element element2 = (Element) node2.getChildNodes();

                            String tagName2 = element2.getTagName();
                            // if condition using xpath tag name == link_Live_Scores
                            if (tagName2.equals(xpathForWebElement)) {
                                String textContent = element2.getTextContent();
                                System.out.println(textContent);
                                break;
                            }
                        }

                    }
                }

                //return document.getTextContent();

            }
        }

    }

    private static Document xmlDocumentReader(String filePath) {
        Document document = null;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(filePath);
            //extract root node from xml doc
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;

    }


    public static String getWebElementXpath(String pageName, String xpathForWebElement ) {
        String textContent = "";

        try {
            Element root = xmlDocumentReader("src/test/resources/xpath.xml").getDocumentElement();
            NodeList nodeList = root.getChildNodes();

            //to iterate over parent node - pages name
            for (int i = 1; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                NodeList childNodes = nodeList.item(i).getChildNodes();

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node.getChildNodes();

                    String tagName = element.getTagName();
                    // if condition using xpath tag name == link_Live_Scores
                    if (tagName.equals(pageName)) {

                        //to iterate over child node under pages
                        for (int j = 1; i < childNodes.getLength(); j++) {
                            Node node2 = childNodes.item(j);

                            if (node2.getNodeType() == Node.ELEMENT_NODE) {
                                Element element2 = (Element) node2.getChildNodes();

                                String tagName2 = element2.getTagName();
                                // if condition using xpath tag name == link_Live_Scores
                                if (tagName2.equals(xpathForWebElement)) {
                                    textContent = element2.getTextContent();
                                    System.out.println(textContent);
                                    break;
                                }
                            }

                        }
                    }


                }
            }
        } catch (DOMException e) {
            e.printStackTrace();
        }


        return textContent;
    }

}


