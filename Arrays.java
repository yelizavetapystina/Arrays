//Yelizaveta Pystina
//Assignment9
//June 10, 2024
//Write a Java program to demo the use of ArrayList API with Strings. It is a open-ended assignment. 
//Your program must compile and display the results as a collection of Strings that you set up using ArrayList.
//Generics use is not required for this assignment.

import java.util.ArrayList;
public class Arrays {
	public static void main(String[] args) {

		ArrayList<String> dogList = new ArrayList<String>();
	 
		dogList.add("Beagle");
		dogList.add("Chihuahua");
		dogList.add("Pitbull");
		dogList.add("Great Dane");
		dogList.add("Mutt");
	 
		System.out.println("The original list is: " + dogList);

		System.out.println("There are " + dogList.size() + " types of dog breeds in the list");
		System.out.println("\nIs one of the breeds in the list a Beagle? " + dogList.contains("Beagle"));
		System.out.println("\nIs one of the breeds in the list a Great Dane? " + dogList.contains("Great Dane"));
		System.out.println("\nIs one of the breeds in the list a Golden Retriever? " + dogList.contains("Golden Retriever"));

		System.out.println("\nIs the list empty? " + dogList.isEmpty() + "\n");
	 
		dogList.add(3, "Cocker Spaniel");
		System.out.println("After adding value 'Cocker Spaniel' to to index 3, the list is: " + dogList);
	 
		dogList.remove("Pitbull");
		System.out.println("After removing value 'Pitbull', the list is: " +dogList);
		dogList.remove(1);
		System.out.println("After removing index 1, the list is: " + dogList);

		System.out.println("\nThe current list is: " + dogList.toString());
		
		
		System.out.print("\nIn reverse, the list is: \n");
		for (int i = dogList.size() - 1; i >= 0; i--) {
			System.out.print(dogList.get(i) + " ");
			System.out.println();

		}
	}
	
}
