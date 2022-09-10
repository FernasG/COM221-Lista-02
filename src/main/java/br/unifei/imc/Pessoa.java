package br.unifei.imc;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Pessoa {
    private Integer id;
    private String nome;
    private Integer idade;
}
