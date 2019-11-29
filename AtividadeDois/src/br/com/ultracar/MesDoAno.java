package br.com.ultracar;

import java.util.Scanner;

public class MesDoAno {

	public static void main(String[] args) {
		String mesDoAno = "";
		int numeroMes;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o numero referente ao mês: ");
		numeroMes = ler.nextInt();
		
		if (numeroMes == 1) {
			mesDoAno = "Janeiro";
		} else if(numeroMes == 2) {
			mesDoAno = "Fevereiro";
			
		} else if(numeroMes == 3) {
			mesDoAno = "Março";
			
		} else if(numeroMes == 4) {
			mesDoAno = "Abril";
			
		} else if(numeroMes == 5) {
			mesDoAno = "Maio";
			
		} else if(numeroMes == 6) {
			mesDoAno = "Junho";
			
		} else if(numeroMes == 7) {
			mesDoAno = "Julho";
			
		} else if(numeroMes == 8) {
			mesDoAno = "Agosto";
			
		} else if(numeroMes == 9) {
			mesDoAno = "Setembro";
			
		} else if(numeroMes == 10) {
			mesDoAno = "Outubro";
			
		} else if(numeroMes == 11) {
			mesDoAno = "Novembro";
			
		} else if(numeroMes == 12) {
			mesDoAno = "Dezembro";
			
		} else {
			mesDoAno = "Mes inexistente";
		}
		
		
		System.out.println("Mes referente: " + mesDoAno);
		
		
		
	}

}
