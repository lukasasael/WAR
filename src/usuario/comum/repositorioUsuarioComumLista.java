package usuario.comum;

public class repositorioUsuarioComumLista implements repositorioUsuarioComumListaInterface {
    usuarioComum user;
    repositorioUsuarioComumLista prox;

    repositorioUsuarioComumLista() {
    }

    @Override
    public void novoUsuario(usuarioComum user) {
        if (this.user == null) {
            this.user = user;
            this.prox = new repositorioUsuarioComumLista();
        } else if (this.user.getCPF() == user.getCPF()) {
            System.out.println("Deu ruim, já existe um usuario com este CPF");
        } else {
            this.prox.novoUsuario(user);
        }
    }

    @Override
    public usuarioComum procura(String CPF) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                return this.user;
            } else {
                return this.prox.procura(CPF);
            }
        } else {
            System.out.println("Deu ruim, não há tal usuario no sistema!");
            return null;
        }
    }

    @Override
    public void deleta(String CPF) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user = this.prox.user;
                this.prox = this.prox.prox;
            } else {
                this.prox.deleta(CPF);
            }
        } else {
            System.out.println("Deu ruim, não da pra deletar o que não existe!");
        }
    }

    @Override
    public void atualizaNome(String CPF, String nome) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setNome(nome);
            } else {
                this.prox.atualizaNome(CPF, nome);
            }
        }
    }

    @Override
    public void atualizaIdade(String CPF, int idade) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setIdade(idade);
            } else {
                this.prox.atualizaIdade(CPF, idade);
            }
        }
    }

    @Override
    public void atualizaTelefone(String CPF, String telefone) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setTelefone(telefone);
            } else {
                this.prox.atualizaTelefone(CPF, telefone);
            }
        }
    }

    @Override
    public void atualizaCEP(String CPF, String CEP) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setCEP(CEP);
            } else {
                this.prox.atualizaCEP(CPF, CEP);
            }
        }
    }

    @Override
    public void atualizaNumeroCartao(String CPF, String numeroCartao) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setNumeroCartao(numeroCartao);
            } else {
                this.prox.atualizaNumeroCartao(CPF, numeroCartao);
            }
        }
    }
}
