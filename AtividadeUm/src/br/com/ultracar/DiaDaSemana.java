package br.com.ultracar;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		String diaDaSemana = "";
		int dia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um número para mostrar o dia da semana: ");
		dia = ler.nextInt();
		
		if (dia == 1) {
			diaDaSemana = "Domingo";
		} else if (dia == 2) {
			diaDaSemana = "Segunda-feira";
		} else if (dia == 3) {
			diaDaSemana = "Terça-feira";
		} else if (dia == 4) {
			diaDaSemana = "Quarta-feira";
		} else if (dia == 5) {
			diaDaSemana = "Quinta-feira";
		} else if (dia == 6) {
			diaDaSemana = "Sexta-feira";
		} else if (dia == 7) {
			diaDaSemana = "Sabado";
		} else {
			diaDaSemana = "Dia da semana inexistente";
		}
		

		System.out.println("Dia digitado refere-se a " + diaDaSemana);
	}

}
