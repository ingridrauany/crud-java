package Controle;

import Modelo.Estagiario;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ControleEstagiario {

    String INSERT_ESTAGIARIO = "INSERT INTO estagiario (matricula, nome, curso, periodo) values (?, ?, ?, ?);";
    String UPDATE_ESTAGIARIO = "UPDATE estagiario set nome = ?, curso = ?, periodo = ? where matricula = ?;";
    String DELETE_ESTAGIARIO = "DELETE FROM estagiario where matricula = ?;";
    String PESQUISA_ESTAGIARIO = "SELECT * FROM estagiario;";
    Conexao conecta = new Conexao();

    boolean retorno;
    public ResultSet result;

    public boolean InserirEstagiario(Estagiario estagiario) throws SQLException {
        try {
            conecta.conectar();
            PreparedStatement insercao = conecta.con.prepareStatement(INSERT_ESTAGIARIO);
            insercao.setString(1, estagiario.getMatricula());
            insercao.setString(2, estagiario.getNome());
            insercao.setString(3, estagiario.getCurso());
            insercao.setString(4, estagiario.getPeriodo());
            retorno = insercao.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public boolean UpdateEstagiario(Estagiario estagiario) throws SQLException {
        try {
            conecta.conectar();
            PreparedStatement atualizacao = conecta.con.prepareStatement(UPDATE_ESTAGIARIO);
            atualizacao.setString(1, estagiario.getNome());
            atualizacao.setString(2, estagiario.getCurso());
            atualizacao.setString(3, estagiario.getPeriodo());
            atualizacao.setString(4, estagiario.getMatricula());

            retorno = atualizacao.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public void DeletaEstagiario(Estagiario estagiario) throws SQLException {
        try {
            conecta.conectar();
            PreparedStatement deletar = conecta.con.prepareStatement(DELETE_ESTAGIARIO);
            deletar.setString(1, estagiario.getMatricula());
            deletar.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet Pesquisar() {
        try {
            conecta.conectar();
            Statement sentenca = conecta.con.createStatement(result.TYPE_SCROLL_INSENSITIVE, result.CONCUR_READ_ONLY);
            result = sentenca.executeQuery(PESQUISA_ESTAGIARIO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
