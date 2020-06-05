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
public class ControleEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Estoque et;
     et = new Estoque(20);
     et.add(new Equipamento(1, "peça", 5, 0.5));
     et.add(new Equipamento(2, "teclado", 5, 0.3));
     et.add(new Equipamento(5, "mouse", 5, 0.3));
     et.adicionarUnidades(5, 15);
     et.retirarUnidades(2, 4);
     et.reposicao(21);
     et.pesoEmEstoque();
     
    }

}