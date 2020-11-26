import java.util.*;
import java.io.*;

public class Fase2App {

	public static void main (String[] args) {
		
		
		// Construim les variables pels bitllets, i la que contindrà el total.
				
		int cinc = 5;
		int deu = 10;
		int vint = 20;
		int cinquanta = 50;
		int cent = 100;
		int doscents = 200;
		int cinccents = 500;
		
		int total = 0;
		
		// Construim les variables que contindran el menú i el preu.
		
		Object [] menu = new Object [9];
		Object [] preu = new Object [9];
		
// FASE 2
		
		// Construim un HasMap amb els plats i els seus preus, per poder omplir després les variables.
		
	try {	
		HashMap <String, Integer> menu_preu = new LinkedHashMap <String, Integer>();
		
		menu_preu.put("Gazpacho", 6);
		menu_preu.put("Menestra", 7);
		menu_preu.put("Esqueixada", 8);
		menu_preu.put("Lassanya", 8);
		menu_preu.put("Pollastre forn", 9);
		menu_preu.put("Peix dia", 10);
		menu_preu.put("Fruita temporada", 4);
		menu_preu.put("Brownie", 5);
		menu_preu.put("Music", 6);
		
		// Portem claus i valors a un format transferible.
		
		Object [] keys = menu_preu.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			menu [i] = keys[i];
		}

		Object [] values = menu_preu.values().toArray();
		for (int i = 0; i < values.length; i++) {
			preu [i] = values[i];
		}

	} catch (Exception f) {
		
		System.out.println("Alguna cosa no funciona.");
		}
		
		// Comencem a mostrar per consola el menú.
		
		System.out.println("Els plats del menú i els seus preus són:");
		
		for (int i = 0; i < menu.length; i++) {
		
			System.out.println(menu[i]+" "+preu[i]+"€");			
			}
		
		// Construim una llista que contindrà la comanda de l'usuari.
		
		List <String> comanda = new ArrayList <String>();
		
		// Construim la variable que contindrà la resposta a si vol més plats.
		
		int resposta = 1;
		
		// Construim un loop on preguntem a l'usuari quin plat vol i si vol demanar-ne més.
				
	try {
		
		do {			
		Scanner demana = new Scanner (System.in);
			System.out.println("Indica el nom del plat a afegir a la comanda: ");
			comanda.add(demana.nextLine());
		Scanner mes_plats = new Scanner (System.in);
			System.out.println("Vols alguna altra cosa? (1:Si/0:No)");
			resposta = mes_plats.nextInt();
		} while(resposta == 1);
	
		// Imprimim el resum de la comanda de l'usuari un cop ja no vol més plats.
		

	} catch (Exception f) {
		
		System.out.println("Alguna cosa no funciona.");
		}
		
		System.out.println("La comanda escollida és: " + comanda);
		
	}
	
}
