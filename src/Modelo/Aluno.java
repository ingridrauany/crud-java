/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author usuario
 */
public class Aluno {
    private String cpf;
    private String nome;
    private String endereco;
    private String data_nasc;

    public Aluno(String cpf, String nome, String endereco, String data_nasc){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.data_nasc = data_nasc;
    }
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    
    
    
}
