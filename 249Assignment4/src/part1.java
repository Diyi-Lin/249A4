// -------------------------------------------------------
	// Assignment4
	// part1
    // Written by: (Diyi Lin student id40086388)
	// For COMP 249 Section  – winter 2019
	// --------------------------------------------------------
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class part1 {
	public static void main(String[] args) {
	
	ArrayList<String> words = new ArrayList<String>();	
	String str1, str2;
	int a=0;
	PrintWriter pw=null;
	Scanner key = new Scanner(System.in);
	Scanner sc = null;
	
	try {
	str1 = "PersonOfTheCentury.txt";
	sc = new Scanner(new FileInputStream(str1));
	while(sc.hasNext()) {
		str2 = sc.next().toUpperCase();
		str2.replaceAll("?", "");
		str2.replaceAll(":", "");
		str2.replaceAll("'M", "");
		str2.replaceAll("'S", "");
		str2.replaceAll(",", "");
		str2.replaceAll("=", "");
		str2.replaceAll(";", "");
		str2.replaceAll("!", "");
		str2.replaceAll(".", "");
		if(str2.contains("0")||str2.contains("1")||str2.contains("2")||str2.contains("3")||str2.contains("4")||str2.contains("5")||str2.contains("6")||str2.contains("7")||str2.contains("8")||str2.contains("9")) 
		continue;
		if((str2.length()>1||str2.contains("I")||str2.contains("M"))&&!words.contains(str2)) {
		words.add(str2);
		}
		else continue;	
	    for(String word:words) {
	       int i = word.length();
	       for(int j=0;j<i;j++) {
	    	 if(word.compareTo(str2)>0) {
	    		a=words.indexOf(word);
	    		words.add(a,str2);
	    	    break;
	    	 }
	       }
	  pw = new PrintWriter(new FileOutputStream("SubDictionary.txt"));
	  pw.println("The doucument produceed this sub-dictionary, which includes "+words.size()+" entries.");  
	  pw.println("A");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("A"))
			pw.println(entry);
		}
	  pw.println("B");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("B"))
			pw.println(entry);
		}
	  pw.println("C");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("C"))
			pw.println(entry);
		}
	  pw.println("D");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("D"))
			pw.println(entry);
		}
	  pw.println("E");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("E"))
			pw.println(entry);
		}
	  pw.println("F");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("F"))
			pw.println(entry);
		}
	  pw.println("F");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("F"))
			pw.println(entry);
		}
	  pw.println("G");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("G"))
			pw.println(entry);
		}
	  pw.println("H");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("H"))
			pw.println(entry);
		}
	  pw.println("I");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("I"))
			pw.println(entry);
		}
	  pw.println("J");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("J"))
			pw.println(entry);
		}
	  pw.println("K");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("K"))
			pw.println(entry);
		}
	  pw.println("L");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("L"))
			pw.println(entry);
		}
	  pw.println("M");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("M"))
			pw.println(entry);
		}
	  pw.println("N");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("N"))
			pw.println(entry);
		}
	  pw.println("O");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("O"))
			pw.println(entry);
		}
	  pw.println("P");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("P"))
			pw.println(entry);
		}
	  pw.println("Q");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("Q"))
			pw.println(entry);
		}
	  pw.println("R");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("R"))
			pw.println(entry);
		}
	  pw.println("S");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("S"))
			pw.println(entry);
		}
	  pw.println("T");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("T"))
			pw.println(entry);
		}
	  pw.println("U");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("U"))
			pw.println(entry);
		}
	  pw.println("V");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("V"))
			pw.println(entry);
		}
	  pw.println("W");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("W"))
			pw.println(entry);
		}
	  pw.println("X");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("X"))
			pw.println(entry);
		}
	  pw.println("Y");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("Y"))
			pw.println(entry);
		}
	  pw.println("Z");
	  pw.println("==");
	  for(String entry:words) {
		if(String.valueOf(entry.charAt(0)).equals("Z"))
			pw.println(entry);
		}

	    }
	}
	
	}
	catch (FileNotFoundException e) {
		sc.close();
		pw.close();
		System.exit(0);
	}
	
	}
}
