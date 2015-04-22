package com.FrequencyOfwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;


// We are assuming that there are repetitive queries.
// So we are going to create the Hashtable and maintain the word as keys and their frequency as value.
// Original qs is to find the word frequency in a book.
// Here we are assuming that we have a paragraph. and we have to find frequency of each word in a paragraph.
// Lets make a paragraph into a list of words.
// So may be linked list.
//Now the qs is from where we should fetch data. Ok lets create the file.

public class FrequencyOfWords {
	public static Integer getFrequency(Hashtable<String, Integer> table, String word){
		Integer frequency = 0;
		if(table.containsKey(word)){
			 frequency = table.get(word);
			System.out.println("Frequency of word is: " + frequency);
		}
		return frequency;
		
	}
	
	public static void main(String[] args) {
		//Create the bufferedreader to accept the file name from the user.
		Hashtable<String, Integer> table = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = null;
		System.out.println("Please Enter file name: ");
		BufferedReader input = null;
		try {
			fileName = br.readLine();
			File file = new File(fileName);
			// Create bufferedreader to read the file.
			 input = new BufferedReader(new FileReader(file));
			// Create Hashtable to store the data. Words and their frequency.
			// in key and value respectively.
			
		 table = new Hashtable<String, Integer>();
			
			String currentLine = null;
			// Reading line by line from text file.
			while((currentLine = input.readLine()) != null){
				//passing words from each line.
				
				StringTokenizer parser = new StringTokenizer(currentLine, " \f.,;:!?"); 
				while(parser.hasMoreTokens()){
					String  currentWord = parser.nextToken();
					System.out.println("CurrentWord is: " + currentWord);
					if(!table.containsKey(currentWord)){
						table.put(currentWord, 0);
					}
					table.put(currentWord, table.get(currentWord) + 1);
					System.out.println(table.get(currentWord));
					System.out.println("Frequency of currentword is: " + table.get(currentWord));
				}
			}
		} catch (IOException e) {
			System.out.println("Filename is incorrect.");
			e.printStackTrace();
		}
		finally{
			try {
				input.close();
			}
				 catch (IOException e) {
						System.out.println("Unable to open file");
					}catch(NullPointerException ex){
						System.out.println("File was never opened");
		}
		
}
		getFrequency(table, "wife");

	

	
	

	}
}
