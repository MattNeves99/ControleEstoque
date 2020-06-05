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
public class Estoque  {
    private Equipamento lista[];
    private int contador;
   
    
    public Estoque(int capMax){
        lista = new Equipamento[capMax];
        contador = 0;
    }
    //index recebe o metodo buscarCodigo para fazer uma comparação com o codigo de eq
    //se o index for maior que 0 ele retorna false
    public boolean add(Equipamento eq){
        if(contador >= lista.length) return false;
        int index= buscarCodigo(eq.getCodigo());
        if(index >= 0)return false;
        lista[contador] = eq;
        contador ++;
        return true;
    }
    
    //i serve para fazer uma busca no array lista, usando o metodo get
    //ele busca na classe Equipamento
    public int buscarCodigo(int codigo){
        for(int i =0; i< contador;i++){
            if(lista[i].getCodigo() == codigo)
                return i;
            
        }
        return -1;
    }
    
    
    public void reposicao(int qtdMin){
        
        System.out.println("\n" + "Relatorio de reposição de estoque" + "\n");
        for(int i=0; i< contador; i++){
            if(lista[i].getQtd() < qtdMin)
                lista[i].print();
        }
    }
    
    //o metodo buscarCodigo já faz a busca do codigo
    //então não é nessario fazer outro for
    public boolean adicionarUnidades(int cod, int qtd){
        
            int index= buscarCodigo(cod);
            if(index < 0) return false;
            int qtdAtual=lista[index].getQtd();
            lista[index].setQtd(qtdAtual+qtd);
            return true;
        }
    
    
    public boolean retirarUnidades(int cod,int qtd){
            
            int index= buscarCodigo(cod);
            if(index < 0) return false;
            int qtdAtual=lista[index].getQtd();
            if(qtd> qtdAtual)return false;
            lista[index].setQtd(qtdAtual-qtd);
            return true;
    }
    
    public void pesoEmEstoque(){
            double total = 0;
         for(int i=0; i < contador;i++){
            double pesoItem;
            pesoItem = lista[i].getPeso() * lista[i].getQtd();
            
            System.out.println("Item: " + lista[i].getDescricao() + "\t "+ 
                    "Quantidade: " + lista[i].getQtd() + "\t" + 
                   "Peso dos Itens em Estoque: " + pesoItem);
            
            total += pesoItem;
            
          }
         System.out.println("Peso Total em Estoque: " + total);
    }
}
