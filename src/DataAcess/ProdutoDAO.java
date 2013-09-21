/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcess;

import DomainModel.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aline
 */
public class ProdutoDAO extends DAO {
    
    public ProdutoDAO() {
        super();
    }

    //Salvar Produto
    public boolean SalvarProduto(Produto obj) {
        if (obj.getCodigo() == 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("insert into produto(nome,preco) values(?,?)");
                sql.setString(1, obj.getNome());                
                sql.setDouble(2, obj.getPreco());
                sql.executeUpdate();
                return true;
            } catch (Exception ex) {
                System.err.print(ex.getMessage());            
            }
        }else{
             try {
                Connection con = getConexao();
                PreparedStatement sql = con.prepareStatement("update produto set nome=?,Preco=? where codProduto=?");
                sql.setString(1, obj.getNome());
                sql.setDouble(2, obj.getPreco());
                sql.setInt(3, obj.getCodigo());
                sql.executeUpdate();
                return true;

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
            
        }
        return false;
        
    }//salvar
    
  
}//fim classe
