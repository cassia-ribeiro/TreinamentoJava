package br.com.ultracar;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		boolean diaUtil = true;
		char nome = 'c';
		byte bytes = 99;
		short meses = 12;
		int cep = 34000123;
		long cpf = 1234567890;
		float salario = 30.5f;
		double lucro = 13400.45;
		
		
		//Não é um tipo primitivo
		String estado = "Minas Gerais";
		
		//System.in = refere-se ao sistema operacional onde in= entrada e out = saida
		Scanner scan = new Scanner(System.in);
		int mes = scan.nextInt();
		

	}

}
