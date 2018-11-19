package usuario.admin;

public interface repositorioUsuarioAdminListaInterface {
    void novoAdmin(usuarioAdmin admin);

    usuarioAdmin procura(String CPF);

    void deleta(String CPF);

    void atualizaNome(String CPF, String nome);

    void atualizaIdade(String CPF, int idade);

    void atualizaTelefone(String CPF, String telefone);

    void atualizaCEP(String CPF, String CEP);

    void atualizaCodigoFuncionario(String CPF, String codigoFuncionario);
}
