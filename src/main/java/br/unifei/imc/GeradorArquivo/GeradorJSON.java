package br.unifei.imc.GeradorArquivo;

import com.google.gson.Gson;
import br.unifei.imc.Pessoa;
import java.io.FileWriter;
import java.util.List;

public class GeradorJSON implements GeradorArquivo {
    @Override
    public void gerarArquivo(List<Pessoa> pessoas) {
        try {
            var writer = new FileWriter("src/main/resources/pessoas.json");
            new Gson().toJson(pessoas, writer);
            writer.close();
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
