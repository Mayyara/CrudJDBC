package br.com.senai.modelo.negocio;

import br.com.senai.modelo.negocio.Modelo;

/**
 *
 * @author mayara_freita
 */
public class Automovel {
    
   private int id;
   private int anoFabricacao;
   private int anoModelo;
   private double preco;
   private int quilometragem;
   private Modelo modelo;
   
   public Automovel(){
       
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
   
   
   
    
    
}
