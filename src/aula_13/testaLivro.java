package aula_13;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Professor Silvio - Faculdade Senac Palhoça
 *
 * @author david.maria
 */
public class testaLivro {

    public static void main(String[] args) {

        LivroNegocio negocio = new LivroNegocio();
        List<Livro> livros = negocio.gerarListaLivros();

        mostrarLista(livros);

        int edicao = Integer.parseInt(JOptionPane.showInputDialog("Informe a edição a ser pesquisada: "));

        mostrarLista(negocio.pesquisarLivrosPorEdicao(livros, edicao));

        String pesquisarEditora = JOptionPane.showInputDialog("Qual editora quer pesquisar? ");
        mostrarLista(negocio.pesquisarLivrosPorEditora(livros, pesquisarEditora));

        String pesquisarAutor = JOptionPane.showInputDialog("Informe o autor a ser pesquisado: ");
        mostrarLista(negocio.pesquisaLivrosPorAutor(livros, pesquisarAutor));

    }

    public static void mostrarLista(List<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println(livro.getNome());
            System.out.println("Ano Edição: " + livro.getAnoEdicao());
            System.out.println("Autor:" + livro.getAutor());
            System.out.println(livro.getDescricao());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("========================================");
        }
    }
}
