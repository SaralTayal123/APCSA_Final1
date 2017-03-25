import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;


public class wiki {

    public String Wiki (String name, int para) throws IOException {

        String url = name.replaceAll(" ", "_");
        url = "http://en.wikipedia.org/wiki/" + url;
        Document doc = Jsoup.connect(url).get();
        Elements paragraphs = doc.select(".mw-content-ltr p, .mw-content-ltr li");

        Element firstParagraph = paragraphs.first();
        Element p;
        p = firstParagraph;
        String returnText = "";
        for(int i = 0; i<para; i++) {
            p = paragraphs.get(i);
            returnText = returnText + p.text();
        }
        return returnText;
    }
}


