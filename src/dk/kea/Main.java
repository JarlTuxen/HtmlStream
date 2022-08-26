package dk.kea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    //læsning af HTML-side vha. InputStreamReader
    public static void main(String[] args) throws Exception{
        //åbn connection til web-server
        URL connection = new URL("https://dr.dk/");
        //sæt buffered reader på inputstream
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.openStream()));

        String input = "";
        //iterer så længe der læses linier fra reader
        while (input != null){
            //udskriv hvad er læst - første gang en tom linie
            System.out.println(input);
            //læs næste linie
            input = reader.readLine();
        }
        //luk reader pænt ned
        reader.close();
    }
}
