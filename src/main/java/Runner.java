import com.epam.dz.parser.DOMParser;
import com.epam.dz.parser.XMLParserSAX;

public class Runner {
    public static void main(String[] args) {
        DOMParser db=new DOMParser();
       // db.main();
        XMLParserSAX sax=new XMLParserSAX();
        sax.main();

    }
}
