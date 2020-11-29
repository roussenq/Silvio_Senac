/*
 *  criar uma classe livro conforme descrição: (nome, anoEdição, autor, descrição, editora) ok
 *  - criar uma classe LivroNegocio ok
    - criar metodo que gere a lista de livros. ok
    - criar um metodo que receba a lista de livros como parametro e pesquise livros por edições. ok
    - criar um metodo que receba a lista de livros e o nome da editora e pesquisa o livro da editora. ok
    - criar um metodo que receba a lista de livros e o nome do autor e informe qtd de livros do autor. ok
    - criar uma classe de teste onde caregue a lista de livros e carregue seus metodos para que possa ser executado os testes.ok
 * 
 */
package aula_13;

import java.util.ArrayList;
import java.util.List;
import util.UtilGerador;

/**
 * Professor Silvio - Faculda Senac Palhoça
 * @author david.maria
 */
public class LivroNegocio {

    public List<Livro> gerarListaLivros() {
        List<Livro> livros = new ArrayList<>();
        Livro livro;
        int qtdLivro = UtilGerador.criarNumeroAleatorioEntre2Valores(05, 10);
        for (int i = 0; i < qtdLivro; i++) {
            livro = new Livro(
                    "Nome: " + UtilGerador.gerarNome(),
                    "201" + UtilGerador.gerarNumInteiro("1"),
                    UtilGerador.sortearEditora(),
                    UtilGerador.gerarNome(),
                    "Descrição: " + UtilGerador.gerarDescricao()
            );
            livros.add(livro);
        }
        return livros;
    }

    public List<Livro> pesquisarLivrosPorEdicao(List<Livro> livros, int edicao) {
        List<Livro> edicoes = new ArrayList<>();
        int contador = 0;
        for (Livro livro : livros) {
            if ((Integer.parseInt(livro.getAnoEdicao())) == edicao) {
                edicoes.add(livro);
                contador++;
            }
        }
        System.out.println("\n========================================");
        System.out.println("\nQuantidade de livros com edição " + edicao + ": " + contador);
        System.out.println("\n========================================");
        return edicoes;
    }

    public List<Livro> pesquisarLivrosPorEditora(List<Livro> livros, String editora) {
        List<Livro> editoras = new ArrayList<>();
        int contador = 0;
        for (Livro livro : livros) {
            if (livro.getEditora().equalsIgnoreCase(editora)) {
                editoras.add(livro);
                contador++;
            }
        }
        System.out.println("\n========================================");
        System.out.println("\nQuantidade de livros com editora " + editora + ": " + contador);
        System.out.println("\n========================================");
        return editoras;
    }
    
    public List<Livro> pesquisaLivrosPorAutor(List<Livro> livros, String autor){
        List<Livro> autores = new ArrayList<>();
        int contador = 0;
        for (Livro livro : livros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                autores.add(livro);
                contador++;
            }
        }
        System.out.println("\n========================================");
        System.out.println("\nQuantidade de livros com autor " + autor + ": " + contador);
        System.out.println("\n========================================");
        return autores;
    }

}
