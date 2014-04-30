
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class XML {

    public static void main(String[] args)
    {
        try
        {
            TransformerFactory tFactory = TransformerFactory.newInstance();

            Source xslDoc = new StreamSource("L:/JAVA/WorkSpace/CARDS_Headstrong/Sample/sample_template.xsl");
            Source xmlDoc = new StreamSource("L:/JAVA/WorkSpace/CARDS_Headstrong/Sample/sample_xml.xml");

            
            String outputFileName = "L:/JAVA/WorkSpace/CARDS_Headstrong/Sample/testOutput.doc";
            OutputStream htmlFile = new FileOutputStream(outputFileName);

            Transformer transformer = tFactory.newTransformer(xslDoc);
            transformer.transform(xmlDoc, new StreamResult(htmlFile));
            System.out.println("Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}