// -------------------------------------------------------
	// Assignment4
	// part2
    // Written by: (Diyi Lin student id40086388)
	// For COMP 249 Section  – winter 2019
	// --------------------------------------------------------
import java.util.NoSuchElementException;


public class CellList implements Cloneable {

	class CellNode implements Cloneable{
		private CellPhone CellPhone;
	    private CellNode link;
//dc	
	    public CellNode() {
	    	CellPhone =null;
	    	link = null;
	    }
//pc
	    public CellNode(CellPhone phone,CellNode link) {
	        this.CellPhone = phone;
	        this.link = link;
	    }
//cc
	    CellNode(CellNode a){
	    	this.CellPhone = a.CellPhone;
	    	this.link = a.link;
	    }
//clone	    
	    public Object clone() {
	    	try {
	    		return super.clone();
	    	}
	    	catch(CloneNotSupportedException e) {
	    		return null;
	    	}
	    }
//A
	    public CellPhone getCellPhone() {
	    	return CellPhone;
	    }
	    public CellNode getLink() {
	    	return link;
	    }
//M
	    public void setCellPhone(CellPhone a) {
	    	this.CellPhone = a;
	    }
	    public void setLink(CellNode a) {
	    	this.link = a;
	    }
}

	private CellNode head;
	private int size; 

    public CellList(){
    	head = null;
    }
    
    public CellList(CellList a){
    	size = a.size;
    	if(a.head==null)
    	   head = null;
    	else
    	{
    		head = null;
    		CellNode t1,t2,t3;
    		t1 = a.head;
    		t2=t3=null;
    		while(t1!= null) {
    			if(head == null)
    			{
    				t2 = new CellNode(t1.CellPhone,null);
    				head = t2;
    			}
    			else {
    				t3 = new CellNode(t1.CellPhone,null);
    				t2.link = t3;
    				t2 = t3;
    			}
    		 t1 = t1.link;
    		}
    	t2 = t3 =null;
    	}
    }
    
    public void addToStart(CellPhone phone) {
    	head = new CellNode(phone,head);
        size++;
    }
    
    public void insertAtIndex(CellPhone phone,int index) {
    	try {
    	if(index<0||index>=size) {
    		throw new NoSuchElementException();
    	}
    	else if(index == 0)
    	{
    		head =new CellNode(phone,head);
    		size++;
    	}
    	else{
    		CellNode t = head;
    		for(int i=0;i<index-1;i++)
    		     t=t.link;
    			t.link = new CellNode(phone,t.link);    
    	    size++;
    	}
    	}
    catch (NoSuchElementException e) {
    	System.exit(0);
    }
    }
    
    public void deleteFromIndex(int index) {
    	try {
        	if(index<0||index>=size) {
        		throw new NoSuchElementException();
        	}
        	else if (index==0)
        	{
        		this.deleteFromStart();
        	}
        	else{
        		CellNode t = head;
        		for(int i=0;i<index-1;i++)
        			t = t.link;
        	    t.link = t.link.link;	
        	    size--;
        	}
        	}
        catch (NoSuchElementException e) {
        	System.exit(0);
        }
    }

    public void deleteFromStart() {
    	if(head != null)
    	{
    		head = head.link;	
    	         size--;
    	}   
    }

    public void replaceAtIndex(CellPhone phone,int index) {
    	try {
        	if(index<0||index>=size) {
        		throw new NoSuchElementException();
        	}
        	else{
        		CellNode t = head;
        		for(int i=0;i<index;i++)
        			t = t.link;
        	    t.CellPhone = phone;   
        	}
        	}
        catch (NoSuchElementException e) {
        	System.exit(0);
        }
    }
    
    public CellNode find(long serialNum) {
    	CellNode t = head;
    	while(t !=null) {
    		if (t.getCellPhone().getSerialNum() == serialNum)
    			return t;
    	    t = t.link;
    	}
        return t;
    }

    public String display(CellNode t) {
    	if(t == null)
    		return "Such CellPhone is not in the list";
    	else return t.CellPhone.toString();
    }
    public boolean contains(long serialNum) {
    	CellNode t = head;
    	while(!t.equals(null)) {
    		if (t.getCellPhone().getSerialNum() == serialNum)
    			return true;
    	    t = t.link;
    	}
        return false;
    }
    
    public void showContents() {
    	System.out.println("The current size of the list is "+size+". Here are the contents of the list");
    	System.out.println("==========================================================================");
    	int q=0;
    	CellNode t = head;
    	while(t != null) {
    	System.out.print(t.getCellPhone().toString());
        t = t.link;
        q++;
        if((q%3)==0)
    	System.out.println();
    	}
        System.out.println("X");
    }
    
    public boolean equals(CellList list) {
    	if(list != null) {
    		return false;
    	}
    	else if(list.size!=size) {
    		return false;
    	}
    	else
    	{CellNode t1 = head;
     	 CellNode t2 = list.head;
    	
    	while (t1!=null)
    	{
    		if(t1.CellPhone != t2.CellPhone)
    			return false;
    	    t1 = t1.link;
    	    t2 = t2.link;
    	}
    	 return true;
    	}
    }

 
}
