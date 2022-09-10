package br.unifei.imc;

import br.unifei.imc.PessoaService.PessoaService;
import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
            PessoaService pessoaService = new PessoaService();
            pessoaService.gerarArquivo(OpcaoArquivo.CSV);
            pessoaService.gerarArquivo(OpcaoArquivo.JSON);
    }
}
