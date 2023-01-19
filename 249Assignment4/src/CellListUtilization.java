// -------------------------------------------------------
	// Assignment4
	// part2
    // Written by: (Diyi Lin student id40086388)
	// For COMP 249 Section  – winter 2019
	// --------------------------------------------------------
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CellListUtilization {

	public static void main(String[] args) {
		
		CellList list1 = new CellList();
		CellList list2 = new CellList();
		long a;
		String b=null;
		int c=0;
		double d;
		CellPhone temp =null;
		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileInputStream("Cell_Info.txt"));
		    while(sc.hasNextLine()) {
		    	a=sc.nextLong();
		    	b=sc.next();
		    	d=sc.nextDouble();
		    	c=sc.nextInt();
                temp = new CellPhone(a,b,c,d);
                list1.addToStart(temp);
		    }
		    list1.showContents();
		}
		catch (FileNotFoundException e) {
			System.exit(0);
		}
	    do {
		System.out.print("Please enter the serial number you are going to search for:");
	    sc = new Scanner(System.in);
	    a = sc.nextLong();
	    System.out.println(list1.display(list1.find(a))+" the number of iterations performed:"+list1.getInterations());
        System.out.print("Do you want to serach for another number?If yes input y, else input anyother.");
	    sc = new Scanner(System.in);
        b = sc.nextLine();
	    }
	    while(b.equals("y"));
	    sc.close();
	//IV(e)
	    CellList list1Copy = new CellList(list1);
	    list1Copy.showContents();
	    System.out.println(list1.equals(list1Copy));
	    System.out.println();
	    
	    CellPhone add1 = new CellPhone();
	    list1Copy.addToStart(add1);
	    list1Copy.showContents();
	    System.out.println(list1Copy.contains(3838438));
	    System.out.println(list1.equals(list1Copy));
	    
	    list1Copy.deleteFromStart();
	    list1Copy.showContents();
	    System.out.println(list1.equals(list1Copy));
	    System.out.println();
	    
	    list1.insertAtIndex(add1, 1);
	    list1.showContents();
	    System.out.println();
	    list1.deleteFromIndex(1);
	    list1.replaceAtIndex(add1, 1);
	    list1.showContents();
	}
}
