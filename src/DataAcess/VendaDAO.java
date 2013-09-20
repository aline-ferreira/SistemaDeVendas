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

/**
 *
 * @author Aline
 */
public class VendaDAO extends DAO{

    public VendaDAO() {
    }

    public boolean SalvarVenda(Venda obj) {
        if (obj.getCodigo() == 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("insert into Venda(codPessoa,valor,data) values(?,?,?)");
                sql.setInt(1, obj.getPessoa().getCodigo());
                sql.setDouble(2, obj.getValorTotal());
                sql.setDate(2, new java.sql.Date(obj.getData().getTime()));
                sql.executeUpdate();
                return true;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        } else {
            try {
                Connection con = getConexao();
                PreparedStatement sql = con.prepareStatement("update Pessoa set codPessoa=?, DataNascimento=? where codPessoa=?");
                sql.setInt(1, obj.getPessoa().getCodigo());
                sql.setDouble(2, obj.getValorTotal());
                sql.setDate(2, new java.sql.Date(obj.getData().getTime()));
                sql.executeUpdate();
                return true;

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        }
       
    }//salvar
}
