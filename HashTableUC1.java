package com.DataStructure.HashTable.BTS.Program;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Set;

public class HashTableUC1 {
	public static void duplicate(String inputString)  {
		
		String[] words = inputString.split(" ");
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		 for (int i=0; i< words.length;i++) {
			 if (wordCount.containsKey(words[i]))  {
				 int count=wordCount.get(words[i]);
				 wordCount.put(words[i],count +1);
			 }
			 else  {
				 wordCount.put(words[i], 1);
			 }
		 }
		 System.out.println(wordCount);
		}	 
	
	public static void main(String [] args) {
		duplicate("To be or not to be");
	}

}







