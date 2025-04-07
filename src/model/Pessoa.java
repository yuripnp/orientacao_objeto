package model;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String  cpf;
    private LocalDate dataNascimento;
    private String email;

    public void exibirMensagem() {
        System.out.println("ola mundo");
    }
    public boolean maiorDeIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNascimento.getYear();
        if (dataAtual.getDayOfYear() < dataNascimento.getDayOfYear()) {
            idade--;
        }
        return idade >= 18;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
