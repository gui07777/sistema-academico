package br.com.fabioclaret.sistemaacademico;

import android.content.Context;
public class Pessoa {
    private String cpf;
    private String nome;
    private String dataNasc;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void marcarPresenca(){
        System.out.println("=======================");
        System.out.println("PESSOA PRESENÇA COMPROVADA");
        System.out.println("=======================");
    }
}
