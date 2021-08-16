package ex1;

import java.util.Scanner;

public class Exercicio1 {
	
public static void main(String[] args) {
	int cont = 0;
	Scanner sc = new Scanner(System.in);
	int i1 = 0;
	int i2 = 0;
	int i3 = 0;
	int i4 = 0;
	int i5 = 0;
	
	while(cont<10){
		System.out.println("Digite a idade de 10 pessoas:");
		int idade = sc.nextInt();
		
		if(idade<=14) {
			i1 = i1 + 1;
		}else if(idade>14 && idade<30) {
			i2 = i2 + 1;
		}else if(idade>29 && idade<45) {
			i3 = i3 + 1;
		}else if(idade>45 && idade<60) {
			i4 = i4 + 1;
		}else if(idade>=60) {
			i5 = i5 + 1;
		}
		
		cont = cont +1;
	}
	
	float total = i1 + i2 + i3 +i4 +i5;
	
	System.out.println("Existem:"+ i1 +"pessoa(s) com idades até 14 anos");
	System.out.println("Existem:"+ i2 +"pessoa(s) com idades de 15 até 29 anos");
	System.out.println("Existem:"+ i3 +"pessoa(s) com idades de 30 até 44 anos");
	System.out.println("Existem:"+ i4 +"pessoa(s) com idades de 45 até 59 anos");
	System.out.println("Existem:"+ i5 +"pessoa(s) com idades acima de 60 anos");
	System.out.println();
	System.out.println("A porcentagem de pessoas de até 14 anos é: " + i1/total*100 + "%");
	System.out.println("A porcentagem de pessoas com mais de 60 anos é: " + i5/total*100 + "%");
	
}
	
}
