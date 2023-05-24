package hospital.services;

import hospital.builders.EnderecoBuilder;
import hospital.models.Endereco;

public class EnderecoService {

    public Endereco getEndereco() {
        return new EnderecoBuilder()
                .rua("Rua Exemplo")
                .numero("123")
                .complemento("Complemento Exemplo")
                .bairro("Bairro Exemplo")
                .cidade("Cidade Exemplo")
                .estado("Estado Exemplo")
                .cep("CEP Exemplo")
                .pais("Pais Exemplo")
                .build();
    }
}
