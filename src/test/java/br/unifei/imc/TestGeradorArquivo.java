package br.unifei.imc;

import br.unifei.imc.PessoaService.PessoaService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGeradorArquivo {
    private PessoaService service;

    @Before
    public void setUp() {
        this.service = new PessoaService();
    }

    @Test
    public void testCriarCSV(){
        Assert.assertTrue(Files.exists(Path.of("src/main/resources/pessoas.csv")));
    }

    @Test
    public void testeValidaCSV(){
        try {
            String arquivo = Files.readString(Path.of("src/main/resources/pessoas.csv"));
            Assert.assertEquals(ConstFileInfo.CSV, arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(expected = OpcaoErradaException.class)
    public void testeOpcaoErrada() throws OpcaoErradaException {
        this.service.gerarArquivo(null);
    }

    @Test
    public void testeValidaJSON(){
        try {
            String arquivo = Files.readString(Path.of("src/main/resources/pessoas.json"));
            Assert.assertEquals(ConstFileInfo.JSON, arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCriarJSON(){
        Assert.assertTrue(Files.exists(Path.of("src/main/resources/pessoas.json")));
    }
}
