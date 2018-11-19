package usuario.comum;

import usuario.usuario;

public class usuarioComum extends usuario {

    protected String numeroCartao;

    public usuarioComum(String nome, int idade, String CPF, String telefone, String CEP, String numeroCartao) {
        super(nome, idade, CPF, telefone, CEP);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}