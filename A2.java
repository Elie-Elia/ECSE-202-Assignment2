
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner; 

public class A2 {
	public static void main(String[] args) {
		bTree tree = new bTree();
		/**
		 * Ask the user to enter a file name
		 * If no name is entered the program is terminated
		 * Otherwise, try to open the file
		 * If it does not open successfully, ask again for a new name
		 * Keep doing this until successful open, or a blank line is entered
		 */
		System.out.println("Simple File Listing Program");   
		Scanner sc = new Scanner(System.in);   
		BufferedReader rd = null;      
		while(rd == null) {    
			System.out.print("Enter name of file to list: ");    
			String filename = sc.nextLine();    
			if (filename.equals("")) {     
				System.out.println("Program terminated");     
				System.exit(0); 
			}
			//Try to open the specified file
			try {     
				rd = new BufferedReader(new FileReader(filename));    }    
			catch (IOException ex) {     
				System.out.println("Unable to open file, try again."); 
			} 
			//Read the file a line at a time into a string
			//Print as read to the output display
			System.out.println("");   
			try {    
				while (true) {     
					String line = rd.readLine(); //Read line of text
					if (line == null) break;//Exit if at the end of the file
					tree.addNode(line); 
				}       
			}   
			catch (Exception ex) {    
				System.out.println("I/O Error - program terminated");    
				System.exit(-1);   }         
		}
		System.out.println("");
		System.out.println("File in sort order:");
		System.out.println("");
		tree.traverse_tree();
		System.out.println("");
		System.out.println("File in reverse sort order:");
		System.out.println("");
		tree.reverse_traverse();
		System.out.println("");
		System.out.println("");
		System.out.println("Program terminated ");
	}
}




