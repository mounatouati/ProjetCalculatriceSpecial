package projet.calculatrices.integer;

//import java.util.ArrayList;
import java.util.Scanner;

//import javaexercice.main.Tableau;
public class CalculEntiers {

	//somme multiplication factoriel
	//2+2 = 4 => historiqueDesoperation.add(new Operation(4,"2+2")

public static void calcul() {
	double num1 =0;
	double num2=0;
	double num3=0;
	double res = 0;
	
	//historiqueDesoperations<Operations> historique= new historiqueDesoperations<Operations>();
	historiqueDesoperations<String> historique= new historiqueDesoperations<String>();
	
	CalculMenu();
	
	try {
	boolean continuer = true;
	System.out.println("Quelle opération souhaitez-vous effectuer ? ");
	 while (continuer) {
		 
		 Scanner sc = new Scanner(System.in);
			String choixDeOperation = sc.nextLine();
		          
	switch(choixDeOperation.toUpperCase()) {
	case"A":{
		try {
		System.out.println("Entrer 1 er nombre ");
		 
		//if (sc.hasNextDouble()) {
			num1=sc.nextDouble();
			System.out.println("Entrer 2 eme nombre ");
			num2=sc.nextDouble();
			res=num1+num2;
		//} 
		//else {
			System.out.println("Entrer incorrecte "); 
		//	}
		
		
	
		System.out.println("Resultat :"+res);
		historique.add(res+" = "+num1+" + "+num2);
	}
		 catch (Exception e) {
	            System.out.println("Exception thrown: Erreur saisie " + e);
	        }
		break;
		
	}
	case"S":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();
		res=num1-num2;
		System.out.println("Resultat :"+res);
		historique.add(res+" = "+num1+" - "+num2);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}	
	case"M":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();
		res=num1*num2;
		System.out.println("Resultat :"+res);
		historique.add(res+" = "+num1+" * "+num2);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		
		break;
	}
	case"D":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();
		if (num2 != 0) {
			
		res=num1/num2;
		System.out.println("Resultat :"+res);
		} else {         
			 System.out.println("Erreur : division par zéro.");
		}
		historique.add(res+" = "+num1+" / "+num2);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}case"MO":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();
		res=num1%num2;
		System.out.println("Resultat :"+res);
		historique.add(res+" = "+num1+" % "+num2);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}case"P":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();
		res =1; 
		for (int i=1;i<=num2 ;i++)
		{
			res*=num1;
		}
		System.out.println("Resultat :"+res);
		historique.add(res+" = "+num1+" ** "+num2);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}case"F":{
		try {
		System.out.println("Saisie nombre ");
		num1=sc.nextDouble();
		
		res =1; 
		for (int i=1;i<=num1 ;i++)
		{
			res=res*i;
		}
		System.out.println("Resultat :  "+res);
		historique.add(res+" = "+num1+" ! ");
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}
	case"R":{
		try {
		System.out.println("Saisie nombre ");
		num1=sc.nextDouble();
		System.out.println("Resultat : "+Math.sqrt(num1));
		historique.add(res+" = √"+num1);
	}
	catch (Exception e) {
        System.out.println("Exception thrown: Erreur saisie " + e);
    }
		break;
	}case"Pr":{
		try {
		System.out.println("Saisie nombre ");
		num1=sc.nextDouble();
		for(int i=2;i<=num1/2;i++) {
			if(num1%i == 0)
				System.out.println("Non Premier ");
		}
		System.out.println("Premier");
		historique.add(+num1+" : est premier ");
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}	case"Va":{
		try {
		System.out.println("Saisie nombre ");
		num1=sc.nextDouble();
		System.out.println("Resultat :"+Math.abs(num1));
		historique.add(Math.abs(num1)+" est le valeur absolue de "+num1);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}	case"Max2":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();	
		System.out.println("Resultat :"+Math.max(num1,num2));	
		historique.add(Math.max(num1,num2)+" est le max entre  "+num1+" et "+num2);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}case"Min2":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();	
		System.out.println("Resultat :"+Math.min(num1,num2));	
		historique.add(Math.min(num1,num2)+" est le min entre  "+num1+" et "+num2);
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}case"Min3":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();	
		System.out.println("Entrer 3 eme nombre ");
		num3=sc.nextDouble();	
		if (num1 <num2 && num1<num3)
			{
			System.out.println("Resultat :"+num1);	
			historique.add(num1+" est le min entre  "+num1+" et "+num2+" et "+num3);
			
			}			
		else if (num2 <num1 && num2<num3)
			{
			System.out.println("Resultat :"+num2);	
			historique.add(num2+" est le min entre  "+num1+" et "+num2+" et "+num3);		
			}		
		else {
		System.out.println("Resultat :"+num3);	
		historique.add(num3+" est le min entre  "+num1+" et "+num2+" et "+num3);
		}
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}
	case"Max3":{
		try {
		System.out.println("Entrer 1 er nombre ");
		num1=sc.nextDouble();
		System.out.println("Entrer 2 eme nombre ");
		num2=sc.nextDouble();	
		System.out.println("Entrer 3 eme nombre ");
		num3=sc.nextDouble();	
		if (num1 >num2 && num1>num3)
			{System.out.println("Resultat :"+num1);	
			historique.add(num1+" est le max entre  "+num1+" et "+num2+" et "+num3);
			}	
		
		else if (num2 >num1 && num2>num3)
			{
			System.out.println("Resultat :"+num2);	
			historique.add(num2+" est le max entre  "+num1+" et "+num2+" et "+num3);
			}		
		else {
		System.out.println("Resultat :"+num3);		
		historique.add(num3+" est le max entre  "+num1+" et "+num2+" et "+num3);
		}
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}
	case"L":{
		try {
		System.out.println("Entrer valeur Max ");
		num1=sc.nextDouble();
		for (int i = 1; i < num1; i++)
		{
		if ( i % 2 == 0 && i / 2 > 1)
			continue;
		else if ( i % 3 == 0 && i / 3 > 1)
  			continue;
		else if ( i % 5 == 0 && i / 5 > 1)
   			continue;
	   else if ( i % 7 == 0 && i / 7>1)
			continue;
			System.out.print(i);
			System.out.print(" , ");			
		}
		System.out.println("");
		}
		catch (Exception e) {
            System.out.println("Exception thrown: Erreur saisie " + e);
        }
		break;
	}
	default:		
		System.out.println("Selection invalide");
	//throw new IllegalArgumentException("Unexpected value: "+choixDeOperation);	
	break;
	// choixDeOperation = sc.nextLine();
	}
    
	System.out.println("Voulez-vous faire un autre calcul ? (oui/non)");
    String reponse = sc.next();
    if (reponse.toLowerCase().equals("non")) {
        continuer = false;
    } else {System.out.println("Quelle opération souhaitez-vous effectuer ? ");}
    
}
	 System.out.println("\u001b[45;1mHistorique : \n" + historique);
	 System.out.println("Merci d'avoir utilisé la calculatrice !");
	 CalculMenu();
	}
catch (Exception e) {
    System.out.println("Exception thrown:  " + e);
}
}

public static void CalculMenu() {
	System.out.println("\033[47m\033[35;1m|                            Calculatrice des Entiers                            |");
	System.out.println("+================================================================================+");	
	int options = 10;
	String menuItems1[]= {"| A) Addition ","S) Soustraction ","M) Multiplication ","D) Division  ","   MO) Modulo       |"};
	String menuItems2[]= {"| P) Puissance","F) Factorielle","  R) Racine_carré","   Pr) Premier","     V) V_absolue     |"};
	String menuItems3[]= {"| M2) Max Entre 2", "    Mx2) Max Entre 2 ","    M3) Min Entre 3", "    Mx3) Max Entre 3    |"};
	String menuItems4[]= {"|                             L) Liste nombre premier                            |"};
	
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
	System.out.print("|                               ----------------------                           |");
	System.out.println("");
	for (int i = 0 ; i< menuItems3.length;i++) {
		System.out.print(menuItems3[i] + "");
	}
	System.out.println("");
	for (int i = 0 ; i< menuItems4.length;i++) {
		System.out.print(menuItems4[i] + "");
	}
	System.out.println("");
	System.out.println("+================================================================================+\033[0m");
	
}
private boolean isPremier(int n) {
	for(int i=2;i<=n/2;i++) {
		if(n%i == 0)
			return false;
	}
	return true;
}

public void listePremiers() {
	for(int i=1;i<=100;i++) {
		if(isPremier(i)) {
			System.out.print(i+" ");
		}
	}
}
}
