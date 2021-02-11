package it.objectmethod.ese;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Articolo[] articoli = new Articolo[3]; //creo l'array articoli e gli assegno grandezza = 3

		for (int i = 0; i < 3; i++) {
			System.out.println("Inserisci nuovo articolo");
			int idTmp = i + 1;
			System.out.println("Inserisci il codice: ");
			String codiceTmp = scanner.nextLine();

			System.out.println("Inserisci la descrizione: ");
			String descrizioneTmp = scanner.nextLine();

			System.out.println("Inserisci la quantità: ");
			//int quantitaTmp = scanner.nextInt();
			
			int quantitaTmp = Integer.parseInt(scanner.nextLine()); //classe integer - metodo parseInt ti coverte il numero in un intero
			
			Articolo articoloTmp = new Articolo(idTmp, descrizioneTmp, codiceTmp, quantitaTmp); //creo l'oggetto articolo temporaneo
			articoli[i] = articoloTmp; //assegno lo stesso riferimento di articoli ad articolo temporaneo in modo tale che anche fuori dal ciclo i valori esisteranno
			
			

		}
		for (Articolo art : articoli) { // creo un for each in cui creo l'oggetto art e gli assegno lo stesso riferimento in memoria di articoli
			System.out.println("Articolo inserito: " + art.getDescrizione()); //get serve per leggere i dati
		}
		Articolo massimo = articoli[0];
		for(int i = 0; i < articoli.length; i++ ) {
			if (articoli[i].getQuantita() > massimo.getQuantita()) { //prendi la quantita e la confronti con gli altri elementi
				massimo = articoli[i];
			}
		}
		System.out.println("Il valore massimo è: " +  massimo.getId() + " - " + massimo.getCodice() + " - " + massimo.getDescrizione() + " - " + massimo.getQuantita());
		

		scanner.close();
	}
}

//
