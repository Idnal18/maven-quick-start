package clinic.programming.training;

import java.util.ArrayList;

public class Application {

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
        app.test();
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
}