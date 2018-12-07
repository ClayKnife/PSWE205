import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class database_try {

	public static void main(String[] args) {
		genericReadFile("StudentInformation.txt");
		System.out.println();
		courseReadFile("courses.txt");

	}
	
	 private static void genericReadFile(String fileName) {
	       try {
	         File file = new File(fileName);
	         Scanner scanner = new Scanner(file);
	         String s;
	         while (scanner.hasNextLine()) {
	        	 s=scanner.nextLine();
	           System.out.println(s);
	         }
	         scanner.close();
	       } catch (FileNotFoundException e) {
	         e.printStackTrace();
	       }
	     }
	 
	 private static void courseReadFile(String fileName) {
	       try {
	         File file = new File(fileName);
	         Scanner scanner = new Scanner(file);
	         String s;
	         while (scanner.hasNextLine()) {
	        	 s=scanner.nextLine();
	           System.out.println(s.substring(0, s.indexOf("CRN")+9));
	         }
	         scanner.close();
	       } catch (FileNotFoundException e) {
	         e.printStackTrace();
	       }
	     }

}
