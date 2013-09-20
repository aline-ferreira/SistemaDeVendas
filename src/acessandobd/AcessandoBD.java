/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acessandobd;

import DataAcess.PessoaDAO;
import DataAcess.ProdutoDAO;
import DataAcess.VendaDAO;
import DomainModel.Email;
import DomainModel.Endereco;
import DomainModel.Pessoa;
import DomainModel.Telefone;
import DomainModel.Produto;
import DomainModel.Venda;
import java.util.Date;

/**
 *
 * @author Aline
 */
public class AcessandoBD {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception 
    {
        // TODO code application logic here
        Pessoa pessoa = new Pessoa();
        Produto produto= new Produto();
        Venda venda= new Venda();
        VendaDAO dao= new VendaDAO();
        Telefone tel= new Telefone();
        Telefone tel2= new Telefone();
        
        Email email = new Email();
        Email email2 = new Email();
        
     
        
        Endereco end2 = new Endereco();
        Endereco end = new Endereco();
        
        email.setEmail("fghjkg@hotmail.com");
        email2.setEmail("fghgnb@gmail.com");
        tel.setTelefone(9113244);
        tel2.setTelefone(36212528);
        
        
       
        
        end2.setNumero(100);
        end2.setRua("Rua w");
        end2.setBairro("castro");
        end2.setCidade("Paraiso");
        end2.setCep("00000-000");
        
        end.setNumero(221);
        end.setRua("Rua 1");
        end.setBairro("Jussara");
        end.setCidade("Januaria");
        end.setCep("39000-000");
        
        
        pessoa.setNome("bruno");
        
        pessoa.setDataNascimento(new Date());
        
        pessoa.addEmail(email);
        pessoa.addEmail(email2);
        pessoa.addEndereco(end);
        pessoa.addEndereco(end2);
        pessoa.addTelefone(tel);
        pessoa.addTelefone(tel2);
        
        venda.setPessoa(pessoa);
        venda.setValorTotal(100);
        venda.setData(new Date());
        
        dao.SalvarVenda(venda);
    
       
   
        
    }
}
