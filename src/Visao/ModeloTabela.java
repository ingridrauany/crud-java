/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visao;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author usuario
 */
public class ModeloTabela extends AbstractTableModel{
private ArrayList linhas = null;
private String[] colunas = null;

    public ModeloTabela(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    @Override
    public String getColumnName(int numLinhas){
        return colunas[numLinhas];
    }
    @Override
    public int getRowCount() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return colunas.length;
    }

    @Override
    public Object getValueAt(int numLinhas, int numCol) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Object[] linha = (Object[])getLinhas().get(numLinhas);
    return linha[numCol];
    }
    
}
