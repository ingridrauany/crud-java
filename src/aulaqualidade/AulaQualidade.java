package aulaqualidade;

import Modelo.Aluno;
import Modelo.Estagiario;
import Controle.ControleAluno;
import Controle.ControleEstagiario;
import java.sql.SQLException;
import javax.swing.*;
import Visao.Janela;
import Visao.MenuAluno;
import Visao.CadastroAluno;
import Visao.CadastroEstagiario;
import java.util.ArrayList;


public class AulaQualidade {
    public static JFrame janela;
    public static JPanel MenuAluno;
    public static JPanel CadastroAluno;
    public static JPanel CadastroEstagiario;
    public static ArrayList<Aluno> listadeAlunos;
    public static ArrayList<Estagiario> listadeEstagiarios;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        janela = new Janela();
        MenuAluno = new MenuAluno();
        CadastroAluno = new CadastroAluno();
        CadastroEstagiario = new CadastroEstagiario();
        listadeAlunos = new ArrayList<Aluno>();
        listadeEstagiarios = new ArrayList<Estagiario>();
        janela.setVisible(true);
        janela.setContentPane(MenuAluno);
    }
    
}
