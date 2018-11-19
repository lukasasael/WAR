package usuario.admin;

import usuario.usuario;

public class usuarioAdmin extends usuario {
    public usuarioAdmin(String nome, int idade, String CPF, String telefone, String CEP, String codigoFuncionario) {
        super(nome, idade, CPF, telefone, CEP);
        this.admin = true;
        this.codigoFuncionario = codigoFuncionario;
    }

    private String codigoFuncionario;

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
}
