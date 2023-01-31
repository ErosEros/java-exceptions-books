package books.java.exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		SCANNER
		Scanner s = new Scanner(System.in);

//		CREO L'OGGETTO LIBRO
		Book[] b = new Book[2];

//		INIZIALIZZO VARIABILE PAGES
		int pages = -1;
//		INIZIALIZZO VARIABILE TITLE	
		String title="";

//		CICLO FOR
		for (int i = 0; i < b.length; i++) {
			
//			TITOLO WITH TRY
			try {
			System.out.print("Titolo: ");
			title = s.nextLine().toLowerCase().trim();
			} catch (Exception e) {
				System.out.println("Titolo non valido");
			}
			
//			AUTHOR
			System.out.print("Autore: ");
			String author = s.nextLine();

//			PUBLISHER		  
			System.out.print("Editore: ");
			String publisher = s.nextLine();

//			PAGES WITH TRY
			try {
				System.out.print("Inserisci numero di pagine:");
				pages = Integer.parseInt(s.nextLine());
				if (pages < 30)
					System.out.println("Il libro deve essere di almeno 30 pagine!!");
			} catch (NumberFormatException e) {
				System.out.println("Devi inserire un numero");

			}
			
			b[i] = new Book(title, pages, author, publisher);

		}

		
		
		for (int j = 0; j < b.length; j++)
			System.out.printf("Titolo del libro: %s %n " 
					+ "Autore del libro: %s %n" 
					+ "Editore: %s %n"
					+ "Numero di pagine: %d%n",
					b[j].getTitle(), b[j].getAuthor(), b[j].getPublisher(), b[j].getPages());
		
//		CHISURA SCANNER
		s.close();
	}

}
