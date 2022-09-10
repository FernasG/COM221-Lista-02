package br.unifei.imc.GeradorArquivo;

import br.unifei.imc.Pessoa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileWriter;
import java.util.List;

public class GeradorCSV implements GeradorArquivo {
    @Override
    public void gerarArquivo(List<Pessoa> pessoas) {
        try {
            var fileWriter = new FileWriter("src/main/resources/pessoas.csv");
            var writer = new CSVWriter(fileWriter);
            new StatefulBeanToCsvBuilder<Pessoa>(writer).withApplyQuotesToAll(false).build().write(pessoas);
            writer.close();
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
