package week4;

import java.io.*;
import java.util.*;

import acm.program.ConsoleProgram;

public class WordCount extends ConsoleProgram {
	
	public void run() {
		String filename="C:/Users/moni0/eclipse-meritamerica-workspace/Stanford106AAssignmentStarters/Stanford106AAssignments/worlds/lear.txt";
		String name = "lear.txt";
		int linecount=0;
		int wordcount=0;
		int charcount=0;
		try {
			BufferedReader rd = new BufferedReader(new FileReader(filename));
			
			System.out.println("File: "+name);
			String line;
			while((line = rd.readLine()) != null) { // reads each line  
					 
				linecount+=1;
					
				charcount+= (line).length();
					 
				String[] arr = line.split(" ");
				wordcount+= arr.length;
			}
			System.out.println("Lines = "+linecount);
			System.out.println("Characters = "+charcount);
			System.out.println("Words = "+wordcount);
			rd.close();
			
		} catch(IOException e) {
			System.out.println("File not found!!");
		}
	}
}
