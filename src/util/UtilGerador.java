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

    public static String gerarNome(int qtd) {
        String nomeGerado = "";
        String[] minuscula = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
            "u", "v", "w", "x", "y", "z",};
        String[] maiuscula = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"};

        int indice1;
        int indice2 = (int) (Math.random() * maiuscula.length);

        for (int i = 0; i < (qtd - 1); i++) {
            indice1 = (int) (Math.random() * minuscula.length);
            nomeGerado += minuscula[indice1];
        }
        nomeGerado = maiuscula[indice2] + nomeGerado;
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

    public static String gerarEmail(int qtd, String dominio) {
        String emailGerado = gerarNome(qtd) + "@" + dominio + ".com.br";
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
