
package br.com.senai.modelo.negocio;

/**
 *
 * @author mayara_freita
 */
public class Modelo {
    int id;
    String descricao;
    int potencia;
    Marca marca;
    
    public Modelo(){
        
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
      
}
