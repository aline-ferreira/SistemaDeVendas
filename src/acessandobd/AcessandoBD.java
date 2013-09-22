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
import DomainModel.ItemVenda;
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
    public static void main(String[] args) throws Exception {

        //TESTE

        Pessoa pessoa = new Pessoa();
        Produto produto = new Produto();
        Venda venda = new Venda();
        ItemVenda item = new ItemVenda();



        VendaDAO dao = new VendaDAO();
        Telefone tel = new Telefone();
        Telefone tel2 = new Telefone();
        PessoaDAO dao2 = new PessoaDAO();
        ProdutoDAO dao3 = new ProdutoDAO();
        Email email = new Email();
        Email email2 = new Email();


        // Salvar Pessoa
        Endereco end2 = new Endereco();
        Endereco end = new Endereco();
        email.setEmail("alineferreira@hotmail.com");
        email2.setEmail("ferreiraaline@gmail.com");
        tel.setTelefone(99999999);
        tel2.setTelefone(36210000);
        end2.setNumero(100);
        end2.setRua("Rua d");
        end2.setBairro("saojoao");
        end2.setCidade("Januaria");
        end2.setCep("00000-000");
        end.setNumero(375);
        end.setRua("Rua 1");
        end.setBairro("Jussara");
        end.setCidade("Januaria");
        end.setCep("39000-000");
        pessoa.setNome("Maisa");
        pessoa.setDataNascimento(new Date());
        pessoa.addEmail(email);
        pessoa.addEmail(email2);
        pessoa.addEndereco(end);
        pessoa.addEndereco(end2);
        pessoa.addTelefone(tel);
        pessoa.addTelefone(tel2);
        dao2.Salvar(pessoa);

        //Salvar Produto
        produto.setNome("netbook");
        produto.setPreco(550);
        dao3.SalvarProduto(produto);

        //Salvar Venda
        item.setProduto(produto);
        item.setQuantidade(2);
        venda.addItemVenda(item);
        venda.setPessoa(pessoa);
        venda.setValorTotal(item.getValor());
        venda.setData(new Date());
        dao.SalvarVenda(venda);









    }
}
