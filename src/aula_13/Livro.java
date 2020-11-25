package aula_13;

public class Livro {

    private String nome;
    private String anoEdicao;
    private String editora;
    private String autor;
    private String descricao;

    public Livro() {
    }

    public Livro(String nome, String anoEdicao, String editora, String autor, String descricao) {
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

    public String getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(String anoEdicao) {
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
