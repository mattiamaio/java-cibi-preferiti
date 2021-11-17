package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] favFood = new String[6];
		
		favFood[0] = "Tortellini con brodo di carne";
		favFood[1] = "Pizza margherita";		
		favFood[2] = "Mezze maniche alla carbonara";
		favFood[3] = "Burek al formaggio";
		favFood[4] = "Tagliata di carne";
		favFood[5] = "Seppie alla griglia";
		
		int lengthArray = favFood.length;
		
		System.out.println("My favourite food list is " + lengthArray + " foods long");
		
		System.out.println("\nMy favourite food is: " + favFood[0]);
		
		System.out.println("\nMy least favourite food is: " + favFood[lengthArray -1]); //-1 è la posizione dell'ultimo elemento dell'array
		
		System.out.println("\nMy third favourite food is: " + (favFood[(lengthArray -1) / 2])); // posizione -1 /2 divide l'intero array a metà, partendo dalla conoscenza dell'ultimo elemento e seleziona l'elemento mediano

	}

}
