/*
 * Demonstrates usage of Scanner for file input
 * Srikant Kumar Kalaputapu
 * June 28th, 2017
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import java.io.PrintWriter;
 
public class ScannerFileTest {

	public static void main(String[] args) {
		File file = new File("customers.txt");
		LinkedList<Customer> customers = new LinkedList<Customer>();
		
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String record = sc.nextLine();
				String[] customer = record.split("\\t");
				
				//strict format
				Customer c = new Customer(customer[0],customer[1],customer[2],customer[3],customer[4],customer[5],customer[6],customer[7],customer[8],customer[9],customer[10]);
				customers.add(c);
//				System.out.println(c);
				
			}
			sc.close();
			
			PrintWriter writer=null;
			 try {
			     writer = new PrintWriter(new File("output.txt"));
			     for(Customer c: customers){
			    	 writer.write(c.getFullName() + "\t" + c.getEmail() + "\n");
			     }
			 } catch (FileNotFoundException e) {
			     System.out.println("File not found");
			 }
			 //close the print writer
			 writer.close();
		
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}