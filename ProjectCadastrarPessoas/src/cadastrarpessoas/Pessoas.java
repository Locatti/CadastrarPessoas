/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrarpessoas;

/**
 *
 * @author leandro
 */
public class Pessoas {
    
    public String nome;
    public String email;

    /*
     DECLARAÇÃO DO MÉTODO CONSTRUTOR:
     TEM QUE TER O MESMO NOME DA CLASSE;
     NÃO POSSUI NENHUM TIPO DE RETORNO, INCLUSIVE VOID
     */
    public Pessoas(String individuo) {

        this.nome = individuo;

    }

    /*
     DECLARAÇÃO DE MÉTODOS:
     */
    public String mostrarNome() {

        return this.nome;

    }

    public void inserirNome(String name) {

        //this.email = endereco;
        this.nome = name;

    }

    public void inserirEmail(String individuo) {

        //this.email = endereco;
        this.nome = individuo;

    }

}