package br.unifei.imc;

import br.unifei.imc.PessoaService.PessoaService;

public class Main {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService();
        pessoaService.gerarArquivo(OpcaoArquivo.CSV);
        pessoaService.gerarArquivo(OpcaoArquivo.JSON);
    }
}
