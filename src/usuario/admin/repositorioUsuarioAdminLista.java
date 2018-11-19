package usuario.admin;

public class repositorioUsuarioAdminLista implements repositorioUsuarioAdminListaInterface{
    usuarioAdmin admin;
    repositorioUsuarioAdminLista prox;

    repositorioUsuarioAdminLista() {
    }

    public void novoAdmin(usuarioAdmin admin) {
        if (this.admin == null) {
            this.admin = admin;
            this.prox = new repositorioUsuarioAdminLista();
        } else if (this.admin.getCPF() == admin.getCPF()) {
            System.out.println("Deu ruim, já existe um admin com este CPF");
        } else {
            this.prox.novoAdmin(admin);
        }
    }

    public usuarioAdmin procura(String CPF) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                return this.admin;
            } else {
                return this.prox.procura(CPF);
            }
        } else {
            System.out.println("Deu ruim, não há tal admin no sistema!");
            return null;
        }
    }

    public void deleta(String CPF) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin = this.prox.admin;
                this.prox = this.prox.prox;
            } else {
                this.prox.deleta(CPF);
            }
        } else {
            System.out.println("Deu ruim, não da pra deletar o que não existe!");
        }
    }

    public void atualizaNome(String CPF, String nome) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setNome(nome);
            } else {
                this.prox.atualizaNome(CPF, nome);
            }
        }else {
            System.out.println("Deu ruim, não da pra atualizar o que não existe!");
        }
    }

    public void atualizaIdade(String CPF, int idade) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setIdade(idade);
            } else {
                this.prox.atualizaIdade(CPF, idade);
            }
        }else {
            System.out.println("Deu ruim, não da pra atualizar o que não existe!");
        }
    }

    public void atualizaTelefone(String CPF, String telefone) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setTelefone(telefone);
            } else {
                this.prox.atualizaTelefone(CPF, telefone);
            }
        }else {
            System.out.println("Deu ruim, não da pra atualizar o que não existe!");
        }
    }

    public void atualizaCEP(String CPF, String CEP) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setCEP(CEP);
            } else {
                this.prox.atualizaCEP(CPF, CEP);
            }
        }else {
            System.out.println("Deu ruim, não da pra atualizar o que não existe!");
        }
    }

    public void atualizaCodigoFuncionario(String CPF, String codigoFuncionario) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setCodigoFuncionario(codigoFuncionario);
            } else {
                this.prox.atualizaCodigoFuncionario(CPF, codigoFuncionario);
            }
        }else {
            System.out.println("Deu ruim, não da pra atualizar o que não existe!");
        }
    }
}
