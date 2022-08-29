package com.texoit.filmesapi.services;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.texoit.filmesapi.models.Filme;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

@Component
public class CarregarDadosFilmesBanco {
    private final String FILE_NAME = "movielist.csv";

    public void lerDadosCSV() {
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(getClass().getClassLoader().getResource(FILE_NAME).toURI()));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            String[] rowData = null;
            while ((rowData = csvReader.readNext()) != null) {
                String[] valoresSeparados = rowData[0].split(";");
//                Filme filme = new Filme(null, Integer.parseInt(valoresSeparados[0]), valoresSeparados[1], valoresSeparados[2], valoresSeparados[3], valoresSeparados[4] != null && valoresSeparados[4] == "yes");
//                System.out.println(filme.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void lerDadosMemoria() {
        Filme filme;
        for (long i = 1; i <= 10; i++) {
            filme = new Filme(i, Integer.parseInt((1900 + i) + ""), "teste" + i, "Studio" + i + ", Studio" + (i + 1), new ArrayList<>(), false);
        }
    }
}
