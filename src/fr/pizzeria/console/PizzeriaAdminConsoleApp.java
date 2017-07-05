package fr.pizzeria.console;

import java.lang.reflect.Method;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static String[][] listepizza = new String[100][4];

	public static void initListe() {

		listepizza = new String[][] { { "0", "PEP", "Pépéroni", "12.50" }, { "1", "MAR", "Margherita", "14.00" },
				{ "2", "REI", "La Reine", "11.50" }, { "3", "FRO", "La 4 fromages", "12.00" },
				{ "4", "CAN", "La cannibale", "12.50" }, { "5", "SAV", "La savoyarde", "13.00" },
				{ "6", "ORI", "L'orientale", "13.50" }, { "7", "IND", "L'indienne", "14.00" } };
	}

	public static void listeDesPizzas(String[][] a) {
		int i = 0;
		for (String[] s : a) {

			System.out.println(a[i][1] + "->" + a[i][2] + " (" + a[i][3] + ")");
			i++;
		}

	}
	public static void ajoutPizza(String[] a){
		
	}
	public static void main(String[] args) {

		initListe();
		System.out.println(
				"***** Pizzeria Administration ***** \n 1. Lister les pizza \n 2.Ajouter une nouvelle pizza \n 3.Mettre à jour une pizza \n 4.Supprimmer une pizza \n 99.Sortir");
		Scanner sc = new Scanner(System.in);
		int réponse = sc.nextInt();

		switch (réponse) {

		case 1:
			System.out.println("Liste des pizzas");
			listeDesPizzas(listepizza);
			break;

		case 2:
			System.out.println("Ajout d'une nouvelle pizza");
			
			break;
		case 3:
			System.out.println("Mise à jour d'une pizza");
			break;
		case 4:
			System.out.println("Suppression d'une pizza");
			break;
		case 5:
			System.out.println("Aurevoir =( ");

		}

	}
}
