package br.unifei.imc.PessoaService;

import br.unifei.imc.OpcaoArquivo;
import br.unifei.imc.Pessoa;
import java.util.ArrayList;

public class PessoaService {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    private void gerarMapaPessoas() {
        pessoas.add(new Pessoa(1, "Guts", 39));
        pessoas.add(new Pessoa(2, "Casca", 30));
        pessoas.add(new Pessoa(3, "Andreas", 60));
    }

    public void gerarArquivo(OpcaoArquivo opcao) {

    }
}
