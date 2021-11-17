package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] favFood = new String [6];
		
		favFood[0] = "Tortellini con brodo di carne";
		favFood[1] = "Pizza margherita";		
		favFood[2] = "Mezze maniche alla carbonara";
		favFood[3] = "Burek al formaggio";
		favFood[4] = "Tagliata di carne";
		favFood[5] = "Seppie alla griglia";
		
		System.out.println("Array length is: " + (favFood.length));
		
		System.out.println("My favourite food is: " + favFood[0]);
		System.out.println("My least favourite food is: " + favFood[5]);
		
		System.out.println("My third favourite food is: " + favFood[2]);
	
	
	}

}
