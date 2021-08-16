package ex4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Em que turno você trabalha? M-manhã, T-tarde ou N-noite");
		char turno = sc.nextLine().charAt(0);
	
		if(turno == 'M') {
			System.out.println("Bom dia!");
		}else if(turno == 'T') {
			System.out.println("Boa tarde!");
		}else if(turno == 'N') {
			System.out.println("Boa noite");
		}else{
			System.out.println("Valor Inválido");
		}
		
	}
}
