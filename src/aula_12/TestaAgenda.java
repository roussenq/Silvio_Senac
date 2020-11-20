package aula_12;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author david.maria
 */
public class TestaAgenda {

    public static void main(String[] args) {

        AgendaNegocio agenda = new AgendaNegocio(); //criado abjeto agenda
        
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a qtd de contatos: "));
        List<Contato> contatos = agenda.gerarListaContatos(qtd);
        System.out.println("Agenda Criada:\n");
        mostrarAgenda(contatos);
        System.out.println("-----------------------\n");
        
        String nomePesquisa = JOptionPane.showInputDialog("Informe um nome para quesquisa: ");
        List<Contato> pesquisa = agenda.pesquisarNome(contatos, nomePesquisa);
        System.out.println("\nLista de pesquisa:\n");
        mostrarAgenda(pesquisa);
        System.out.println("--------------------------\n");

        System.out.println("\nTotal de contatos:\n"+agenda.calculaQtdContatos(contatos));
        
        System.out.println("\n=========================\n");
        System.out.println("\n--Pesquisa por telefone---\n");
        String telefonePesquisa=JOptionPane.showInputDialog("Informe um n° de telefone p/ pesquisar: ");
        List<Contato> pesquisaTelefone = agenda.acharContatoPorTelefone(contatos, telefonePesquisa);
        System.out.println("\n==============================\n");
        mostrarAgenda(pesquisaTelefone);
        
      
    }
    
    
    //criado metodo auxiliar
    private static void mostrarAgenda(List<Contato> contatos) {

        for (Contato contato : contatos) {
            System.out.println(contato.getNome());
            System.out.println(contato.getTelefone());
            System.out.println(contato.getEmail());
            System.out.println(contato.getCidade());

        }
    }

}
