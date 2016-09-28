package xmlparcer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.boopathi.baseclass.Dict;
import com.boopathi.baseclass.MstCard;
public class XMLParcer {
    public static List<Dict> parceXML() {

        try {

            File fXmlFile = new File("xml/MstCards_151021.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getDocumentElement().getChildNodes();


            System.out.println("Dict : " + nList.item(1).getNodeName());
            Node rootdict = nList.item(1);
            Node rootkey = rootdict.getChildNodes().item(1);
            System.out.println("Key " + rootkey.getNodeName());
            Node rootarray = rootdict.getChildNodes().item(3);
            System.out.println("Array " + rootarray.getNodeName());

            List<Dict> mstDictList = new ArrayList<>();
            for (int dict = 1; dict < rootarray.getChildNodes().getLength(); dict+=2) {
                Dict dicts = new Dict();
                List<MstCard> cards = new ArrayList<>();
                Node nNode = rootarray.getChildNodes().item(dict);

                for (int child = 1; child < nNode.getChildNodes().getLength();child+=4)
                {
                    MstCard card = new MstCard();
                    Node node = nNode.getChildNodes().item(child);
                    if(node.getNodeName().equals("key"))
                    {
                        System.out.println("Key " + node.getTextContent());
                        card.setKey(node.getTextContent());
                        Node nxtNode = node.getNextSibling().getNextSibling();
                        if(nxtNode.getNodeName().equals("string"))
                        {
                            System.out.println("String : " + nxtNode.getTextContent());
                            card.setValue(nxtNode.getTextContent());
                        }
                        else if (nxtNode.getNodeName().equals("array"))
                        {
                            List<String> occList = new ArrayList<String>();
                            for (int occ = 1; occ < nxtNode.getChildNodes().getLength();occ+=2)
                            {
                                Node occNode = nxtNode.getChildNodes().item(occ);
                                if(occNode.getNodeName().equals("string"))
                                {
                                    String val = occNode.getTextContent();
                                    occList.add(val);
                                }
                            }
                            card.setOccurance(occList);
                        }
                    }

                    cards.add(card);
                }
                dicts.setCards(cards);
                mstDictList.add(dicts);
            }
            System.out.println(mstDictList);
            return mstDictList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
