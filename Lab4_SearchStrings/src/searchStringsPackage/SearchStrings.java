package searchStringsPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchStrings {

	public static void main(String[] args) {
		
		if (args.length != 2) {
            System.out.println("Wrong number of arguments. Expected: <pattern> <file>");
            return;
        }

		String pattern = args[0].toLowerCase();
		String filename = args[1];

		
		try {
			Scanner scan = new Scanner(new File(filename));
			while (scan.hasNextLine()) {
				String lineFromFile = scan.nextLine();
				if (lineFromFile.toLowerCase().contains(pattern)) {
					
				System.out.println("Found " + pattern + " on line: " + lineFromFile);}
			}
			scan.close();
		}catch (FileNotFoundException e) {
			System.out.println("File not found: " + filename);
		}
	}
}
