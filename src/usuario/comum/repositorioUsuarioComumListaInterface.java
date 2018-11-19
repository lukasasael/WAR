package usuario.comum;

public interface repositorioUsuarioComumListaInterface {
    void novoUsuario(usuarioComum user);

    usuarioComum procura(String CPF);

    void deleta(String CPF);

    void atualizaNome(String CPF, String nome);

    void atualizaIdade(String CPF, int idade);

    void atualizaTelefone(String CPF, String telefone);

    void atualizaCEP(String CPF, String CEP);

    void atualizaNumeroCartao(String CPF, String numeroCartao);
}
