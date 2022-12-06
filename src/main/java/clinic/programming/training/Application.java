package clinic.programming.training;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
        app.test();
        System.out.println("Numero di parole nella frase inserita:" + app.countWords("SARO CON TEEEE MA TU NON DEVI MOLLARE ABBIAMO UN SOGNO NEL CUORE NAPOLI TORNA CAMPIONE"));
    }
        
    public Application() {
        System.out.println ("Inside Application");
    }

    public void test() {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("SIUM");
        lista.add("MUIS");
        lista.add("SIUS");
        lista.add("IUMS");
        lista.add("UMSI");
        lista.add("MSIU");

        for (String string : lista) {
            System.out.println("PAPAPAPAPAPAPA: "+string);
        }
    }

    public int countWords(String words){
        String [] separateWords = StringUtils.split(words, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    }
}