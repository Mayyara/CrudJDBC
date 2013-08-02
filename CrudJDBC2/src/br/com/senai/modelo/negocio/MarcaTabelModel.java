/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.modelo.negocio;


import br.com.senai.modelo.negocio.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mayara_freita
 */
public class MarcaTabelModel extends AbstractTableModel {
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private List<Marca> linhas;
    private String[] colunas = {"Id", "Nome"};
    
    
    public MarcaTabelModel(){
        linhas = new ArrayList<Marca>();
    }
    
    public MarcaTabelModel(List<Marca> marcas){
        linhas = new ArrayList<Marca>(marcas);
        
    }
    
    public int getRowCount() {
        return linhas.size();
      
    }
    
    /*
     * Retorna a quantidade de colunas
     */

    
    public int getColumnCount() {
        return colunas.length;
    }

   
    
    /*
     * Retorna o nome da coluna
     */
    public String getColumnName (int columnIndex){
        return colunas [columnIndex];
    }
    /*
     * Retorna a classe de cada coluna
     */
    public Class getColumnClass (int columnIndex){
        if (columnIndex == COL_ID){
            return Integer.class;
        }else if (columnIndex == COL_NOME){
            return String.class;
        }
        return null;
    }
     /*
     * Retorna os dados do objeto da linha
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pegar o conteúdo da linha
        Marca m = linhas.get(rowIndex);
        
        if(columnIndex == COL_ID){
            return m.getId();
        }else if(columnIndex == COL_NOME){
        return m.getNome();
    }
        return " ";
        
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        Marca m = linhas.get(rowIndex);
        if(columnIndex == COL_ID){
            m.setId((Integer)aValue);
        }else if(columnIndex == COL_NOME){
            m.setNome(aValue.toString());
        }
    }
    //Indica se a célula é editavel.
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    /*
     * Retorna a marca referente a linha espacificada.
     */
    public Marca getMarca (int indicaLinha){
        return linhas.get(indicaLinha);
    }
    /*
     * Adiciona a marca especificada ao modelo
     */
    public void addMarca(Marca marca){
        //Adiciona o registro
        linhas.add(marca);
        
        //Pega a aquantidade de registros (os registros começam com zero)
        int ultimoIndice = getRowCount() -1;
        
        //Notifica a mudança
        fireTableRowsInserted(ultimoIndice , ultimoIndice);
        
    }
    /*
     * Atualiza uma linha
     */
    
    public void updateMarcaint(int indiceLinha, Marca marca){
        linhas.set(indiceLinha, marca);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
       
    }
    /*
     * Remove uma li8nha
     */
    
    public void removeMarca (int indiceLinha){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    /*
     * Remove todos os registros
     */
    public void limpar(){
        linhas.clear();
    }
}
