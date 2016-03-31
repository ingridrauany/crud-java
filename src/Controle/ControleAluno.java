package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import Modelo.Aluno;

public class ControleAluno {

    String INSERT_ALUNO = "INSERT INTO aluno (cpf, nome, endereco, data_nasc) values (?, ?, ?, ?);";
    String UPDATE_ALUNO = "UPDATE aluno set nome = ?, endereco = ?, data_nasc = ? where cpf = ?;";
    String DELETE_ALUNO = "DELETE FROM aluno where cpf = ?;";
    String PESQUISA_ALUNO = "SELECT * FROM aluno;";
    Conexao conecta = new Conexao();
    boolean retorno;
    public ResultSet result;

    public boolean InserirAluno(Aluno aluno) throws SQLException {
        try {
            conecta.conectar();
            PreparedStatement insercao = conecta.con.prepareStatement(INSERT_ALUNO);
            insercao.setString(1, aluno.getCpf());
            insercao.setString(2, aluno.getNome());
            insercao.setString(3, aluno.getEndereco());
            insercao.setString(4, aluno.getData_nasc());
            retorno = insercao.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public boolean UpdateAluno(Aluno aluno) throws SQLException {
        try {
            conecta.conectar();
            PreparedStatement atualizacao = conecta.con.prepareStatement(UPDATE_ALUNO);
            atualizacao.setString(1, aluno.getNome());
            atualizacao.setString(2, aluno.getEndereco());
            atualizacao.setString(3, aluno.getData_nasc());
            atualizacao.setString(4, aluno.getCpf());

            retorno = atualizacao.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public void DeletaAluno(Aluno aluno) throws SQLException {
        try {
            conecta.conectar();
            PreparedStatement deletar = conecta.con.prepareStatement(DELETE_ALUNO);
            deletar.setString(1, aluno.getCpf());
            deletar.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet Pesquisar() {
        try {
            conecta.conectar();
            Statement sentenca = conecta.con.createStatement(result.TYPE_SCROLL_INSENSITIVE, result.CONCUR_READ_ONLY);
            result = sentenca.executeQuery(PESQUISA_ALUNO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
