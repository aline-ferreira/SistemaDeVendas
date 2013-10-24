/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcess;

import DomainModel.Pessoa;
import DomainModel.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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


                PreparedStatement sql2 = getConexao().prepareStatement("select codProduto from Produto where nome= ? and preco=?");
                sql2.setString(1, obj.getNome());
                sql2.setDouble(2, obj.getPreco());

                ResultSet resultado = sql2.executeQuery();

                if (resultado.next()) {
                    obj.setCodigo(resultado.getInt("codProduto"));
                }

                return true;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        }else {
            try {
                Connection con = getConexao();
                PreparedStatement sql = con.prepareStatement("update Produto set nome=?, preco=? where codProduto=?");
                sql.setString(1, obj.getNome());
                sql.setDouble(3, obj.getPreco());
                sql.executeUpdate();
                return true;

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        }
        

    }//salvar

    public boolean Remover(Produto obj) {
        if (obj.getCodigo() >= 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("delete from produto where codProduto=?");
                sql.setInt(1, obj.getCodigo());
                //sql.setDate(2, new java.sql.Date( obj.getDataNascimento().getTime() ));
                sql.executeUpdate();
                return true;

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        }
        return true;
    }
    //Abrir

    public Produto Abrir(int id) {
        try {
            PreparedStatement sql = getConexao().prepareStatement("select * from produto where codProduto=?");
            sql.setInt(1, id);

            ResultSet resultado = sql.executeQuery();

            if (resultado.next()) {
                Produto obj = new Produto();

                obj.setCodigo(resultado.getInt("codProduto"));
                obj.setPreco(resultado.getDouble("preco"));
                obj.setNome(resultado.getString("nome"));


                return obj;
            } else {
                return null;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }
    // Listar 

    public List<Produto> ListarTodos() {
        try {
            PreparedStatement sql = getConexao().prepareStatement("select * from produto");

            ResultSet resultado = sql.executeQuery();

            List<Produto> lista = new ArrayList<Produto>();

            while (resultado.next()) {
                Produto obj = new Produto();

                obj.setCodigo(resultado.getInt("codProduto"));
                obj.setNome(resultado.getString("nome"));
                obj.setPreco(resultado.getDouble("preco"));

                lista.add(obj);
            }

            return lista;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }
}//fim classe
