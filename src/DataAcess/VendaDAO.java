/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcess;

import DomainModel.Pessoa;
import java.sql.PreparedStatement;
import DomainModel.Venda;
import java.sql.Connection;
import DataAcess.PessoaDAO;
import java.sql.ResultSet;

/**
 *
 * @author Aline
 */
public class VendaDAO extends PessoaDAO{

    public VendaDAO() {
        super();
    }

    public boolean SalvarVenda(Venda obj) {
        Pessoa pessoa= new Pessoa();
        
        if (obj.getCodigo() == 0) {
            try {
                Salvar(obj.getPessoa());
                PreparedStatement sql = getConexao().prepareStatement("insert into venda(codPessoa,valor,data) values(?,?,?)");
                pessoa=obj.getPessoa();
                sql.setInt(1, pessoa.getCodigo());
                sql.setDouble(2, obj.getValorTotal());
                sql.setDate(3, new java.sql.Date(obj.getData().getTime()));
                sql.executeUpdate();
                
                
                 PreparedStatement sql2 = getConexao().prepareStatement("select codVenda from venda where valor= ? and data= ?");
                sql2.setInt(1, obj.getPessoa().getCodigo());              
                sql2.setDate(2, new java.sql.Date(obj.getData().getTime()));
                ResultSet resultado = sql2.executeQuery();
                if(resultado.next()){
                    obj.setCodigo(resultado.getInt("codVenda"));
                }
                Salvar(obj.getPessoa());
                return true;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        } else {
            try {
                Salvar(obj.getPessoa());
                Connection con = getConexao();
                PreparedStatement sql = con.prepareStatement("update venda set codPessoa=?, data=? , valor=? where codVenda=?");
                sql.setInt(1, obj.getPessoa().getCodigo());
                sql.setDouble(3, obj.getValorTotal());
                sql.setDate(2, new java.sql.Date(obj.getData().getTime()));
                sql.setDouble(4, obj.getCodigo());
                
               
                sql.executeUpdate();
                return true;

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        }
       
    }//salvar
}
