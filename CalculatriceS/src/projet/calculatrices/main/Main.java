package projet.calculatrices.main;
import java.util.Scanner;

import projet.calculatrices.integer.CalculEntiers;
import projet.calculatrices.string.CalculString;

	public class Main {
		
		public static void main(String [] args ) {
				MenuPrincipal();
		// TODO Auto-generated method stub
	}
	
	private static void MenuPrincipal() {
		Menu1();
		Scanner sc = new Scanner(System.in);
		String choixDeCalculatrice = sc.nextLine();
		switch(choixDeCalculatrice) {
		case"1":{
			MenuEntiers();
			break;
		}
		case"2":{
			MenuString() ;
			break;
		}		
		default:
			throw new IllegalArgumentException("Unexpected value: "+choixDeCalculatrice);
		}
	}
	
	private static void MenuEntiers() {	
		 CalculEntiers ce = new CalculEntiers();
		 ce.calcul();
		}
	private static void MenuString() {	
		 CalculString cs = new CalculString();
		 cs.calcul();
		}
	public static void Menu1() {
		System.out.println("\033[43m\033[30;1m+================================================================================+");
		System.out.println("|                  Bienvenue dans la calculatrice Spécial                        |");
		System.out.println("|                                  M E N U 1                                     |");
		System.out.println("+================================================================================+");
		System.out.println("|                          Selectionner l'Opération                              |");
		System.out.println("|                                                                                |");
		System.out.println("|   1) Calculatrice des entiers       2)  Calculatrice des chaine de caractères  |");
		System.out.println("+================================================================================+\033[0m");	
	
	}
}