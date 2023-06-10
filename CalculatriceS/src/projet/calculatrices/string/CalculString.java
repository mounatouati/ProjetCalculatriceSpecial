package projet.calculatrices.string;

import java.util.Scanner;

import projet.calculatrices.integer.historiqueDesoperations;

public class CalculString {
	public static void calcul() {
		String S="";
		String res = "";
		
		//historiqueDesoperations<Operations> historique= new historiqueDesoperations<Operations>();
		historiqueDesoperations<String> historique= new historiqueDesoperations<String>();		
		CalculMenu();
		
			boolean continuer = true; 
				System.out.println("Saisie chaine de caractères ");
				Scanner ch = new Scanner(System.in);
				String chaine = ch.nextLine();
				//S=ch.nextLine();
		
		System.out.println("Quelle opération souhaitez-vous effectuer ? ");
		while (continuer) {
			Scanner sc = new Scanner(System.in);
			String choixDeOperation = sc.nextLine();
			
			
			
		switch(choixDeOperation.toUpperCase()) {
		
		case"M":{
			
			System.out.println("Vous voulez modifier  '"+chaine+"'");
			System.out.println("Saisie nouvelle Chaine");
			chaine=ch.nextLine();
			//res=S;
			System.out.println("Chaine enregister  : "+chaine);
			//historique.add(res+" = "+num1+" + "+num2);
			//historiqueDesoperations.add(new Operation(4,"2+2");
			break;
			
		}
		case"O":{
			System.out.println("Saisie caractère : ");
			S= sc.nextLine();
			int cp=0;
			for(int i=0; i<chaine.length();i++) {
				if(chaine.charAt(i) == S.charAt(0)) {
					//System.out.println(i);
					cp++;
				}
			}
			System.out.println("le nombre d'occurrence de "+S+" est : " + cp);
			break;
		}	
		case"R":{
			System.out.println("Vous voulez remplacer char 1 par char 2  ");
			System.out.println("Char1 : ");
			String char1 = sc.next();
			System.out.println("Char1 : ");
			String char2 = sc.next();
			String s1 = chaine.replace(char1, char2);
			chaine=s1;
			System.out.println("Nouvelle chaine  :"+chaine);
			System.out.println("Nouvelle chaine  :"+s1);
			break;
		}case"C":{
			System.out.println("Vous voulez couper la chaine en fonction d'un caractère :");
			System.out.println("Entrer caractère0 : ");
			String char1 = sc.next();
			String[] parties = chaine.split(char1); // diviser la chaîne en fonction du caractère "-"
			for (String partie : parties) {
			    System.out.println("Resultat :"+partie);
			}
			
			break;
		}case"Trim":{
			System.out.println("Vérifier si la chaine est trim si non la trim");
			
			if (!chaine.trim().equals(chaine)) {
	            chaine = chaine.trim();
	        }
	        System.out.println("Resultat trim:" +chaine);
			
			break;
		}case"V":{
			System.out.println("Vérifier Majuscule et point ");
			if (chaine.charAt(chaine.length()-1) != '.') {
				chaine=chaine+".";
			} 
			if (!Character.isUpperCase(chaine.charAt(0)))
			 {
			String output = chaine.substring(0, 1).toUpperCase() + chaine.substring(1);
			chaine=output;
			 }
			System.out.println(chaine);
			
			break;
		}
		case"Co":{
			System.out.println("Liste des occurences  ");
			
			String s ="";
			for (int j = 0; j < chaine.length(); j++)				
			{
				int cp= 0;
			for (int i = 0; i < chaine.length(); i++) {
			  if (chaine.charAt(i) == chaine.charAt(j)) {
			    cp++;
			  }
			}
			 System.out.print(chaine.charAt(j)+" : "+cp+ " fois ");
			}
			
			//System.out.println(s);		
			break;
		}
		
		
		
		
		default:		
			System.out.println("Selection invalide");
		//throw new IllegalArgumentException("Unexpected value: "+choixDeOperation);	
		break;
		// choixDeOperation = sc.nextLine();
		}
	    
		System.out.println("Voulez-vous faire un autre operation  ? (oui/non)");
	    String reponse = sc.next();
	    if (reponse.equals("non")) {
	        continuer = false;
	    } else {System.out.println("Quelle opération souhaitez-vous effectuer ? ");}
	    
	}
		 System.out.println("Historique : \n" + historique);
		 System.out.println("Merci d'avoir utilisé la calculatrice !");

		
	}
	public static void CalculMenu() {
		System.out.println("\033[47m\033[35;1m|                   Calculatrice des chaine de caractère                         |");
		System.out.println("+================================================================================+");	
		int options = 10;
		String menuItems1[]= {"|     M)  Mdifier ","      O) Occurence ","    R) Remplacer ","   C) Couper  ","  T)   Trim  |"};
		String menuItems2[]= {"|      V) Vérifier majuscule et point ","   Co) Compter toutes les occurences","       |"};
		
		System.out.println("|                                 M E N U 2                                      |");
		System.out.println("+================================================================================+");
		System.out.println("                            Selectionner l'Opération                             |");
		System.out.println("+================================================================================+");
		
		for (int i = 0 ; i< menuItems1.length;i++) {
			System.out.print(menuItems1[i] + "");
		}
		//System.out.println("\n|");
		System.out.println("");
		
		for (int i = 0 ; i< menuItems2.length;i++) {
			System.out.print(menuItems2[i] + "");
		}
		
		System.out.println("");
		System.out.println("+================================================================================+\033[0m");
		
	}

	
	
}
