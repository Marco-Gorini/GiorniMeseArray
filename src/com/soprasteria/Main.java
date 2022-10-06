package com.soprasteria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] months = {"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};
		int[] dayOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero del mese di cui vuoi le info:");
		int index = in.nextInt();
		
		System.out.println("Il mese è " + months[index - 1] + " e ha " + dayOfMonths[index - 1] + " giorni.");
	}
}
