package basicOfSelenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollections {
	
	public static void main(String[] args) {
		
		System.out.println("Learning Java Collections !!!");
		
		//java_List();
		
	//	java_Set();
		
	//	java_HashTable();
		
		java_Map();
		
	}
	
	// JAVA ==> List, Set, Hashtable and Map Or HashMap 
	
	// Array C Or C++
	
	public static void java_List() {
		
		// List is a collection of records
		// List allows duplicate records/values
		// List allows null and blank records/values
		
		List<String> students = new ArrayList<>();
		
		students.add("Shital");
		students.add("Mrudula");
		students.add("Akshay");
		students.add("Shivam");
		students.add("Rahul");
		students.add("Akshay");
		students.add("Shivam");
		students.add("");
		students.add(null);
		students.add("6447743343");
		
		System.out.println(students);
		
		System.out.println("Total number of students in a class: " + students.size());
		
		for(int i = 0; i<students.size(); i++ ) { // Traditional 
			
			System.out.println(i +" record in my list is:" + students.get(i));
			
		}
			
		System.out.println(" ********* Output with Advance For loop *************** ");
		// for(Data_type  variable : collection_name) 
		
		for(String listOfStudents : students ) { // Advance For loop 
			
			System.out.println(listOfStudents);
			
		}
	
	}
	
	public static void java_Set() {
		
		// Set is a collection of Unique records
		// Set allows null and blank records/values
		
		Set<String> students = new HashSet<>();
		
		//Set<Integer> students1 = new HashSet<>();
		
		students.add("Shital");
		students.add("Mrudula");
		students.add("Akshay");
		students.add("Shivam");
		students.add("Rahul");
		students.add("Akshay");
		students.add("Shivam");
		students.add("");
		students.add(null);
	
		System.out.println(students);
		
		System.out.println(" ********* Output with Iterator and While loop *************** ");
		
		Iterator<String> itr = students.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}
	
	public static void java_HashTable() {
		
		//HashTable is collection of records in the form of Key and Value 
		// Allows to enter duplicate Keys and values, but it will override the duplicate records
		// Allows to enter null key and value but throwing error while running
		// Don't allow null key and value
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		// Hashtable<Key, Value> 
		
		ht.put("Std_1", "Shital");
		ht.put("City", "Pune");
		ht.put("Mobile", "9850324567");
		ht.put("City", "Mumbai");
		ht.put("Mobile", "45678932");
		ht.put("Addree","23 house");
		ht.put("Training","Automation");
		ht.put("Std_4","Shivam");
		ht.put("Std_5","Rahul");
		//ht.put("Std_6", null);
		//ht.put(null,"Rahul");
		
		System.out.println(ht);
		
		System.out.println(ht.get("Mobile"));
		System.out.println(ht.get("City"));
		System.out.println(ht.get("Std_4"));
			
		}
	
	public static void java_Map() {
		
		//Map Or MahMap is collection of records in the form of Key and Value 
		// Allows to enter duplicate Keys and values, but it will override the duplicate records
		// Allows to enter null key and value 
		
		Map<String, String> map = new HashMap<>();
		
		
		map.put("Std_1", "Shital");
		map.put("City", "Pune");
		map.put("Mobile", "9850324567");
		map.put("City", "Mumbai");
		map.put("Mobile", "45678932");
		map.put("Addree","23 house");
		map.put("Training","Automation");
		map.put("Std_4","Shivam");
		map.put("Std_5","Rahul");
		map.put("Std_6", null);
		map.put(null,"Rahul");
		
		System.out.println(map);
		
		System.out.println(map.get("Mobile"));
		System.out.println(map.get("City"));
		System.out.println(map.get("Std_4"));
		System.out.println(map.get("Std_6"));
		System.out.println(map.get(null));
			
		}
	
	}
