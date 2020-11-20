/*
 *  Criar um sistema de Agenda com uma classe contato (nome, e-mail, cidade, telefone)ok
 *   - criar uma classe AgendaNegocio ok
 *   - criar um metodo que receba uma lista de contatos e retorne o total de contatos cadastrados. ok
 *   - criar um metodo que receba uma lista de contatos e um nome para pesquisar e retorne a lista que contenha o nome pesquisado
 *   - criar um metodo que receba uma lista de contatos e um numero de telefone para ser pesquisado. retorne o contato ue tenha o numero que foi pesquisado.
 *   - criar a classe de teste onde carregue a lista de contato e depois mostrar os resultados quando os metodos forem executados.
 */
package aula_12;

import java.util.ArrayList;
import java.util.List;
import util.UtilGerador;

/**
 *
 * @author david.maria
 */
public class AgendaNegocio {
    
    public List<Contato> gerarListaContatos(int qtd) {
        List<Contato> contatos = new ArrayList<>();
        Contato contato;
        for (int i = 0; i < qtd; i++) {
            contato = new Contato(
                    "Nome: " + UtilGerador.gerarNome(),
                    "E-mail: " + UtilGerador.gerarEmail("senac"),
                    "Cidade: " + UtilGerador.gerarNome(),
                    "Telefone: " + UtilGerador.gerarTelefone()
            );
            contatos.add(contato);
        }
        return contatos;
    }

    public int calculaQtdContatos(List<Contato> contatos){
        int qtdContato = 0;
        for (Contato contato : contatos) {
            qtdContato = contatos.size();
        }
        return qtdContato;
    }
    
    // retorne a lista que contenha o nome pesquisado
    public List<Contato> pesquisarNome(List<Contato> contatos, String nome){
        List<Contato> pesquisaNome = new ArrayList<>();
        int contador = 0;
        for (Contato contato : contatos) {
            if (contato.getNome().contains(nome)){
                pesquisaNome.add(contato);
                contador++;
            }
        }
        System.out.println("Você pesquisou: "+nome+"\n Foram encontrados: "+contador+" contatos\n");
        return pesquisaNome;
    }
}
