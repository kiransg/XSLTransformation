import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


public class Transform {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            StreamSource source = new StreamSource("input.xml");
            StreamSource stylesource = new StreamSource("transformer.xsl");

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(stylesource);

            StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
