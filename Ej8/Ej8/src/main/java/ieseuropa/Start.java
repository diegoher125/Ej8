package main.java.ieseuropa;

import java.util.ArrayList;
import java.util.Collections;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Carta> baraja = new ArrayList<>();
		
		for(Palo palo: Palo.values()) {
			for(Numero numero: Numero.values()) {
				baraja.add(new Carta(numero, palo));
			}
		}
		
		for(int i=0;i<baraja.size();i++) {
			System.out.println(baraja.get(i).toString());
		}
		
		ArrayList<Carta> baraja2 = new ArrayList<>();
		while(!baraja.isEmpty()) {
			int aleatorio = (int) (Math.random()*baraja.size());
			//System.out.println(aleatorio);
			baraja2.add(baraja.get(aleatorio));
			if(baraja2.contains(new Carta(Numero.As, Palo.Copas)))
				System.out.println("Sacado");
			else
				System.out.println("Aun no");
			
			baraja.remove(aleatorio);
			//baraja.remove(new Carta(null, null));
		}
		
		System.out.println("-----------------------");
		
		for(int i=0;i<baraja2.size();i++) {
			System.out.println(baraja2.get(i).toString());
		}
		
		Collections.sort(baraja2);
		
		System.out.println("-----------------------");
		
		for(int i=0;i<baraja2.size();i++) {
			System.out.println(baraja2.get(i).toString());
		}
		
	}

}
