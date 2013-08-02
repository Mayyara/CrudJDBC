
package br.com.modelo.persistencia;

import br.com.senai.modelo.negocio.Marca;
import java.util.List;

/**
 *
 * @author mayara_freita
 */
public interface MarcaDAO {
    
    void inserir(Marca m);
    void atualizar(Marca m);
    void excluir (int id);
    List<Marca> getMarcas();
    List<Marca> getMarcaByNome(String nome);
    Marca getMarcaById(int id);
    
}
