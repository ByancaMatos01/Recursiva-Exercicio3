package view;

import java.util.Scanner;

import Controller.ControllerFat;

public class Principal {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		ControllerFat controller= new ControllerFat();
	int n;
	System.out.println("Digite um núemro: ");
	n=leia.nextInt();
	if(n>12) {
		System.out.println("Numero acima do limite");
	}else {
	 int resultado = ControllerFat.fatorial(n);
	 System.out.println(resultado);
}
}
}