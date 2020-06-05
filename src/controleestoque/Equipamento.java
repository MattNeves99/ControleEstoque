/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

/**
 *
 * @author Matheus
 */
public  class Equipamento {
    private int codigo;
    private String descricao;
    private int qtd;
    private double peso;

    public Equipamento(int codigo, String descricao, int qtd, double peso) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtd = qtd;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    

    public String getDescricao() {
        return descricao;
    }

   
    public int getQtd() {
        return qtd;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
       
        this.peso = peso;
    }
    public void setCodigo(int codigo) {
        
        this.codigo = codigo;
    }
    
    
    public void setDescricao(String descricao) {
        if(!descricao.isEmpty())
        this.descricao = descricao;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    @Override
    public String toString(){
        return "codigo: " + codigo + "\n" +
               "descricao: " + descricao + "\n" +
               "quantidade: " + qtd + "\n" +
               "peso: " + peso + "\n";
    }
    
    public void print(){
        System.out.println(toString());
    }
    
}
