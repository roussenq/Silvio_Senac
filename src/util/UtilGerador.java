/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author david.maria
 */
public class UtilGerador {

    public static String gerarNome() {
        String nomeGerado = "";
        String[] sobrenomes = {"Silva", "Souza", "Lucas", "Hoffman", "Maria", "Conceição", "da Silva", "da Luz", "Joaquim", "Luiz Inácio",
            "Kronnus", "Cassol", "da Lagoa", "Farias", "Torrone", "Pé de Feijão", "Querubin", "Pobre", "Destri", "Carrito",
            "do Pomar", "Tapera", "dos Anjos", "Silva Sauro", "Orson", "Campos"};
        String[] nomes = {"Alice", "Bianca", "Cyntia", "Daiana", "Ester", "Fernanda", "Gabriela", "Hanna", "Inácia", "Juliani",
            "Karen", "Leticia", "Marianne", "Nicole", "Olivia", "Pricila", "Quenia", "Raquel", "Sabrina", "Tuane",
            "Uvalina", "Vanessa", "Wacari", "Xuxa", "Yanne", "Zinna", "André", "Adilson", "Carlos", "David", "Eduardo", "Fernando", "Gustavo", "Henrique", "Inácio", "João",
            "Kevin", "Lucas", "Marcos", "Nicholas", "Otavio", "Paulo", "Querubin", "Rico", "Saulo", "Thiago",
            "Ulisses", "Victor", "Wagner", "Xico", "York", "Zucatto"};

        int indice1 = (int) (Math.random() * sobrenomes.length);
        int indice2 = (int) (Math.random() * nomes.length);
        nomeGerado += nomes[indice2] + " " + sobrenomes[indice1];

        return nomeGerado;
    }

    public static int gerarNumInteiro(int qtd) {
        int numero;
        String numeroGerado = "";
        for (int i = 0; i < qtd; i++) {
            numero = (int) (Math.random() * 10);
            numeroGerado += numero;
        }
        numero = Integer.parseInt(numeroGerado);
        return numero;
    }

    public static String gerarEmail(String dominio) {
        String emailGerado = gerarNome() + "@" + dominio + ".com.br";
        return emailGerado;
    }

    public static String gerarTelefone() {
        String telefone = "(48)3" + gerarNumInteiro(3) + "-" + gerarNumInteiro(4);

        return telefone;
    }

    public static int criarNumeroAleatorioEntre2Valores(int menor, int maior) {
        int numero = (int) (Math.random() * (maior - menor));
        if (numero == 0) {
            numero++;
        }
        numero += menor;
        return numero;
    }

    public static void main(String[] args) {
        System.out.println(criarNumeroAleatorioEntre2Valores(50, 100));
    }
}
