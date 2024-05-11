package org.italy.generation;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		String risposta = "s";
		
		System.out.println("E' un triangolo isoscele, scaleno o equilatero?");
		
		do {
		System.out.println("Inserisci la misura dei lati:");
		
		System.out.print("Lato 1: ");
		x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Lato 2: ");
		y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Lato 3: ");
		z = sc.nextInt();
		sc.nextLine();
		
		if (x<=0 || y<=0 || z<=0) {
			System.out.println("Il triangolo non esiste.");
		} else if (x==y & y==z) {
			System.out.println("Il triangolo è equilatero.");
		} else if (x==y || y==z || x==z) {
			System.out.println("Il triangolo è iscoscele.");
		} else
			System.out.println("Il triangolo è scaleno");
		
		System.out.println("Vuoi effettuare un'altra ricerca? (s/n)");
		risposta = sc.nextLine();
		
		} while (risposta.equalsIgnoreCase("s"));
		
		System.out.println("Grazie, alla prossima!");
		
	} //chiusura main

}
