package aula_09;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class ListSorteio {

	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<>();
		
		int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja cadastrar? "));
		
		for (int i = 0; i < qtdAlunos; i++) {
			alunos.add(JOptionPane.showInputDialog((i+1) + " aluno: "));
		}
		
		System.out.println("Alunos Cadastrados:\n");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("\nSorteio:\n");
		
		Collections.shuffle(alunos);
		
		System.out.println("Aluno sorteado:" + alunos.get(0));
		System.out.println("\nOrdem do Sorteio:\n");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
				
	}

}
