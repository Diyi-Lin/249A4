// -------------------------------------------------------
	// Assignment4
	// part2
    // Written by: (Diyi Lin student id40086388)
	// For COMP 249 Section  – winter 2019
	// --------------------------------------------------------
public class CellPhone implements implementation,Cloneable{
long serialNum;
String brand;
int year;
double price;

//dc
public CellPhone() {
	serialNum = 3838438;
	brand = "Motorola";
	year = 2000;
	price = 100;
}
//pc
public CellPhone(long serialNum,String brand,int year,double price) {
	this.serialNum = serialNum;
	this.brand = brand;
	this.year = year;
	this.price = price;
}
//cc
public CellPhone(CellPhone a,long serialNum){
	this.serialNum = serialNum;
	this.brand = a.brand;
	this.year = a.year;
	this.price = a.price;
}
//A
public long getSerialNum() {
	return serialNum;
}
public String getBrand() {
	return brand;
}
public int getYear() {
	return year;
}
public double getPrice() {
	return price;
}
//M
public void setSerialNum(long serialNum) {
	this.serialNum = serialNum;
}
public void setBrand(String brand) {
	this.brand = brand.replace(" ","");
}
public void setYear(int year) {
	this.year = year;
}
public void setPrice(double price) {
	this.price = price;
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

//toString
public String toString() {
	return "["+serialNum+": "+brand+"  "+price+"$ "+year+"] --->";
}
//equals
public boolean equals(CellPhone a) {
	return (this.getBrand().equals(a.getBrand())&&this.getPrice()==a.getPrice()&&this.getYear()==a.getYear());
}


//test code
public static void main(String[] args) {
	CellPhone defaultPhone = new CellPhone();
	CellPhone Nokia = new CellPhone(1989000,"Nokia",2006,237.24);
	CellPhone Nokia1 = new CellPhone(Nokia,3838438); 
	
	System.out.println(defaultPhone.getBrand()+defaultPhone.getSerialNum()+defaultPhone.getPrice()+defaultPhone.getYear());
	System.out.println(defaultPhone.toString());
	System.out.println();
	
	System.out.println(Nokia.toString());
	System.out.println(Nokia1.toString());
	System.out.println(Nokia.equals(Nokia1));
	System.out.println();
	
	Nokia.setBrand("Motorola");
	Nokia.setPrice(677.90);
	Nokia.setYear(2020);
	Nokia.setSerialNum(12346567);
	System.out.println(Nokia.toString());
	System.out.println(Nokia.equals(Nokia1));
	
	
	
	
	
	
	
	
}

}
