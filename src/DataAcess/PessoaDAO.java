/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAcess;

import DomainModel.Email;
import DomainModel.Endereco;
import DomainModel.Pessoa;
import DomainModel.Telefone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aline
 */
public class PessoaDAO extends DAO {

    public PessoaDAO() {
        super();
    }
    //Salvar

    public boolean Salvar(Pessoa obj) {
        if (obj.getCodigo() == 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("insert into pessoa(Nome,DataNascimento) values(?,?)");
                sql.setString(1, obj.getNome());
                sql.setDate(2, new java.sql.Date(obj.getDataNascimento().getTime()));

                sql.executeUpdate();

                PreparedStatement sql2 = getConexao().prepareStatement("select codPessoa from pessoa where nome = ? and DataNascimento = ?");
                sql2.setString(1, obj.getNome());
                sql2.setDate(2, new java.sql.Date(obj.getDataNascimento().getTime()));
                ResultSet resultado = sql2.executeQuery();
                if (resultado.next()) {
                    obj.setCodigo(resultado.getInt("codPessoa"));
                }

                // Salva o email
                for (Email e : obj.getEmails()) {
                    SalvarEmail(obj, e);
                }
                //Salva o Endereco 
                for (Endereco e : obj.getEnderecos()) {
                    SalvarEndereco(obj, e);
                }
                // Salva o Telefone 
                for (Telefone e : obj.getTelefones()) {
                    SalvarTelefone(obj, e);
                }
                return true;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        } else {
            try {
                Connection con = getConexao();
                PreparedStatement sql = con.prepareStatement("update Pessoa set Nome=?, DataNascimento=? where codPessoa=?");
                sql.setString(1, obj.getNome());
                sql.setDate(2, new java.sql.Date(obj.getDataNascimento().getTime()));
                sql.setInt(3, obj.getCodigo());
                sql.executeUpdate();
                return true;

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                return false;
            }
        }
    }
    // Método Remover 

    public boolean Remover(Pessoa obj) {
        if (obj.getCodigo() >= 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("delete from pessoa where codPessoa=?");
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

    public Pessoa Abrir(int id) {
        try {
            PreparedStatement sql = getConexao().prepareStatement("select * from Pessoa where codPessoa=?");
            sql.setInt(1, id);

            ResultSet resultado = sql.executeQuery();

            if (resultado.next()) {
                Pessoa obj = new Pessoa();

                obj.setCodigo(resultado.getInt("codPessoa"));
                obj.setNome(resultado.getString("Nome"));
                obj.setDataNascimento(resultado.getDate("DataNascimento"));

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

    public List<Pessoa> ListarTodos() {
        try {
            PreparedStatement sql = getConexao().prepareStatement("select * from Pessoa");

            ResultSet resultado = sql.executeQuery();

            List<Pessoa> lista = new ArrayList<Pessoa>();

            while (resultado.next()) {
                Pessoa obj = new Pessoa();

                obj.setCodigo(resultado.getInt("codPessoa"));
                obj.setNome(resultado.getString("Nome"));
                obj.setDataNascimento(resultado.getDate("DataNascimento"));

                lista.add(obj);
            }

            return lista;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    // Salvar Email 
    private void SalvarEmail(Pessoa pessoa, Email obj) {
        if (obj.getCodigo() == 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("insert into emails(codPessoa,email) values(?,?)");
                sql.setInt(1, pessoa.getCodigo());
                sql.setString(2, obj.getEmail());
                sql.executeUpdate();

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            try {
                PreparedStatement sql = getConexao().prepareStatement("update emails set codPessoa = ?, email = ? where codEmail= ?");
                sql.setInt(1, pessoa.getCodigo());
                sql.setString(2, obj.getEmail());
                sql.setInt(3, obj.getCodigo());
                sql.executeQuery();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    //Salvar Endereco 

    private void SalvarEndereco(Pessoa pessoa, Endereco obj) {
        if (obj.getCodigo() == 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("insert into enderecos(codPessoa,numero,rua,bairro,cidade,cep) values(?,?,?,?,?,?)");
                sql.setInt(1, pessoa.getCodigo());
                sql.setInt(2, obj.getNumero());
                sql.setString(3, obj.getRua());
                sql.setString(4, obj.getBairro());
                sql.setString(5, obj.getCidade());
                sql.setString(6, obj.getCep());
                sql.executeUpdate();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            try {
                PreparedStatement sql = getConexao().prepareStatement("update enderecos set codPessoa=?, numero=?, rua=?, bairro=?,cidade=? where codEndereco = ?");
                sql.setInt(1, pessoa.getCodigo());
                sql.setInt(2, obj.getNumero());
                sql.setString(3, obj.getRua());
                sql.setString(4, obj.getBairro());
                sql.setString(5, obj.getCidade());
                sql.setInt(6, obj.getCodigo());
                sql.executeQuery();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
    //Salvar Telefones 

    private void SalvarTelefone(Pessoa pessoa, Telefone obj) {
        if (obj.getCodigo() == 0) {
            try {
                PreparedStatement sql = getConexao().prepareStatement("insert into telefones(codPessoa,telefone) values(?,?)");
                sql.setInt(1, pessoa.getCodigo());
                sql.setInt(2, obj.getTelefone());
                sql.executeUpdate();

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            try {
                PreparedStatement sql = getConexao().prepareStatement("update telefones set codPessoa = ?, telefone = ? where codTelefone=?");
                sql.setInt(1, pessoa.getCodigo());
                sql.setInt(2, obj.getTelefone());
                sql.setInt(3, obj.getCodigo());
                sql.executeQuery();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
