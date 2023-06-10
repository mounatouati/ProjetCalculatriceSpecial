package projet.calculatrices.main;
import java.util.Scanner;

import projet.calculatrices.integer.CalculEntiers;

	public class Main {
		

	public static void main(String[] args) {
		double num1,num2,res;
		MenuPrincipal();
		
	}
	private static void MenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans la calculatrice Spécial");
		System.out.println("Tapez 1 pour accéder à la calculatrice des entiers, ou tapez 2 pour accéder à la calculatrice ");

		String choixDeCalculatrice = sc.nextLine();
		switch(choixDeCalculatrice) {
		case"1":{
			MenuEntiers();
			break;
		}
		case"2":{
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: "+choixDeCalculatrice);
		}
	}
	private static void  MenuEntiers() {
		
		CalculEntiers ce = new CalculEntiers();
		}
	}



