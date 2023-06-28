package com.senac.starwars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Conexao {
    public static void main(String[ ] args) throws Exception {
        URL url = new URL("https://swapi.dev/api/people/2/?format=json");

        URLConnection uc = url.openConnection();

        uc.addRequestProperty("User-Agent",
                "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");

        BufferedReader reader = new BufferedReader(new
                InputStreamReader(uc.getInputStream( )));

        String linha = null;

        while((linha = reader.readLine( )) !=null) {


            BufferedWriter writer = new BufferedWriter(new FileWriter("ResultadoDaConexao2.json"));
            writer.write(linha);

            writer.close();
        }

    }
}
