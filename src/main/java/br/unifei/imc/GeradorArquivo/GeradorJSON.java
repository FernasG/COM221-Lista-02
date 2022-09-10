package br.unifei.imc.GeradorArquivo;

import br.unifei.imc.Pessoa;
import java.util.List;

public class GeradorJSON implements GeradorArquivo {
    private final String[] header = {"id", "name", "idade"};
    @Override
    public void gerarArquivo(List<Pessoa> pessoas) {
    }
}
