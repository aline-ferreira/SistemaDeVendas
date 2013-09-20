/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aline
 */
public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo >= 0) {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Pattern patternNome = Pattern.compile("[a-z A-Z\\w\\s]{3,250}");
        Matcher comparar = patternNome.matcher(nome);

        if (comparar.matches()) {
            this.nome = nome;
        }
    }

    public double getPreco() {

        return preco;

    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }

    }
    
}