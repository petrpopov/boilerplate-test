import de.l3s.boilerpipe.BoilerpipeProcessingException;
import de.l3s.boilerpipe.extractors.ArticleExtractor;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


/**
 * User: petrpopov
 * Date: 14.12.13
 * Time: 12:28
 */
public class App {

    public static void main(String[] args) throws MalformedURLException, BoilerpipeProcessingException {

        URL url = new URL("http://ria.ru/economy/20131214/984044091.html");
        String text = ArticleExtractor.INSTANCE.getText(url);

        System.out.println(text);

        List<String> tokenize = Tokenizer.tokenize(text);
    }
}
