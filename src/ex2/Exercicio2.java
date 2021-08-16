package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		System.out.println("Digite seu salario: ");
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double aumento = 0;
		double porcentagem = 0;
		double novoSalario = 0;
		
		if(salario<=1600.00) {
			aumento = salario * 0.25;
			novoSalario = salario + aumento;
			porcentagem = 25;
		}else if(salario>1600.00 && salario<=3000.00) {
			aumento = salario * 0.2;
			novoSalario = salario + aumento;
			porcentagem = 20;
		}else if(salario>3000.00 && salario<=5000.00) {
			aumento = salario * 0.15;
			novoSalario = salario + aumento;
			porcentagem = 15;
		}else if(salario>5000.00) {
			aumento = salario * 0.1;
			novoSalario = salario + aumento;
			porcentagem = 10;
		}
		
		System.out.println("Salario antes do reajuste: " + salario + " reais");
		System.out.println("Percentual de aumento aplicado: " + porcentagem +"%");
		System.out.println("Valor do aumento: " + aumento + " reais");
		System.out.println("Novo salario: " + novoSalario + " reais");
	}
	
}
