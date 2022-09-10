package br.unifei.imc.PessoaService;

import br.unifei.imc.GeradorArquivo.GeradorJSON;
import br.unifei.imc.GeradorArquivo.GeradorCSV;
import br.unifei.imc.OpcaoErradaException;
import br.unifei.imc.OpcaoArquivo;
import br.unifei.imc.Pessoa;
import lombok.SneakyThrows;

import java.util.ArrayList;

public class PessoaService {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public PessoaService() {
        this.gerarMapaPessoas();
    }
    private void gerarMapaPessoas() {
        pessoas.add(new Pessoa(1, "Guts", 39));
        pessoas.add(new Pessoa(2, "Casca", 30));
        pessoas.add(new Pessoa(3, "Andreas", 60));
    }

    public void gerarArquivo(OpcaoArquivo opcao) throws OpcaoErradaException {
        if (opcao == null) throw new OpcaoErradaException("Opção inválida");

        if (opcao.toString().equals("CSV")) {
            new GeradorCSV().gerarArquivo(this.pessoas);
        } else if (opcao.toString().equals("JSON")) {
            new GeradorJSON().gerarArquivo(this.pessoas);
        }
    }
}
