/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_13;

/**
 *
 * @author david.maria
 */
public class Livro {

    private String nome;
    private int anoEdicao;
    private String editora;
    private String autor;
    private String descricao;

    public Livro() {
    }

    public Livro(String nome, int anoEdicao, String editora, String autor, String descricao) {
        this.nome = nome;
        this.anoEdicao = anoEdicao;
        this.editora = editora;
        this.autor = autor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
