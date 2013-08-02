
package br.com.modelo.controller;

import br.com.modelo.persistencia.MarcaDAO;
import br.com.modelo.persistencia.MarcaDAOJDBC;
import br.com.senai.modelo.negocio.Marca;
import java.util.List;

/**
 *
 * @author mayara_freita
 */
public class MarcaController {
    
    public void inserir (Marca m){
        MarcaDAO md = new MarcaDAOJDBC();
        md.atualizar(m);
    }
    
    public void excluir (int id){
        MarcaDAO md = new MarcaDAOJDBC();
        md.excluir(id);
    }
    
    public List<Marca> getMarca(){
        MarcaDAO md =  new MarcaDAOJDBC();
        return md.getMarcas();
    }
    public List<Marca> getMarcaByNome(String nome){
        MarcaDAO md =  new MarcaDAOJDBC();
        return md.getMarcaByNome(nome);
    }
    public Marca getMarcaById(int id){
        MarcaDAO md =  new MarcaDAOJDBC();
        return md.getMarcaById(id);
    }
    
    
}
