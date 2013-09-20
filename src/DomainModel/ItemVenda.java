/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Objects;

/**
 *
 * @author Aline
 */
public class ItemVenda {
     private Produto produto;
     private int quantidade;
     

    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto produto) {
        if(produto != null){
          this.produto = produto;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade>0){
          this.quantidade = quantidade;
        }
    
  }

    public double getValor() {
        double valorTotal;
        valorTotal= getQuantidade()*produto.getPreco();
        return valorTotal;
    }

  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.produto);
        hash = 53 * hash + this.quantidade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemVenda other = (ItemVenda) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return true;
    }

    
}
