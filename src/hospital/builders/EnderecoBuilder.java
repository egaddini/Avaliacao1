package hospital.builders;

import hospital.models.Endereco;

public class EnderecoBuilder {
    private Endereco endereco;

    public EnderecoBuilder() {
        endereco = new Endereco();
    }

    public EnderecoBuilder rua(String rua) {
        endereco.setRua(rua);
        return this;
    }

    public EnderecoBuilder numero(String numero) {
        endereco.setNumero(numero);
        return this;
    }

    public EnderecoBuilder complemento(String complemento) {
        endereco.setComplemento(complemento);
        return this;
    }

    public EnderecoBuilder bairro(String bairro) {
        endereco.setBairro(bairro);
        return this;
    }

    public EnderecoBuilder cidade(String cidade) {
        endereco.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder estado(String estado) {
        endereco.setEstado(estado);
        return this;
    }

    public EnderecoBuilder cep(String cep) {
        endereco.setCep(cep);
        return this;
    }

    public EnderecoBuilder pais(String pais) {
        endereco.setPais(pais);
        return this;
    }

    public Endereco build() {
        return endereco;
    }

}

