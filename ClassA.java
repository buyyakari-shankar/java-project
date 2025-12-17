package pack1;
import java.util.Arrays;
import java.util.Scanner;
public class ClassA
{
	public static Scanner sc=new Scanner(System.in);
	static int pid;
	static int sid;
	static int qty;
	static int price;
	static String menu[]={"1) Fruits","2) vegetable","3) Cometics","4) Masalapowders","5) Exit"};
	static String fruits[]={"101)Mango-1kg-Rs.200-","102)Apple-1kg-Rs.250-","103)Banana-1kg-Rs.50-","104)Pineapple-1kg-Rs.70-","105)Papaya-1kg-Rs.60-"};
	static String veges[]={"201)tamatoes-1kg-Rs.100-","202)onions-1kg-Rs.150-"," 203)potatoes-1kg-Rs.350-","204)carrots-1kg-Rs.270--","205)beetroots-1kg-Rs.160-"};
	static String cosmics[]={"301)Kajal-1-Rs.50-","302)Lip stick-1-Rs.20-","303)Nail polish-1-Rs.30-","304)Face Powder-1-Rs.80-","305)Lotion-1-Rs.120-"};
	static String masala[]={"401)chilli powder-1kg-Rs.15-","402)veg masala-1kg-Rs.25-","403)chicken masala-1kg-Rs.10-","404)mutton masala-1kg-Rs.23-","405)garlic-1kg-Rs.55--"};
	
	static int fcost[]= {200,250,50,70,60};
	static int vcost[]= {100,150,350,270,160};
	static int ccost[]= {50,20,30,80,120};
	static int mcost[]= {15,25,10,23,55};
	public static void main(String[] args) 
	{
		new ClassA().selectproduct();
	}
	public int getqty()
	{
		System.out.println("please select quantity ");
		qty=sc.nextInt();
		return qty;
	}
	
    public void selectproduct() 
    {
    	System.out.println(Arrays.toString(menu));
    	System.out.print("please select valid product id : ");
    	pid=sc.nextInt();
    	
    	System.out.println("you have selected "+menu[pid-1]);
    	if(pid==1)
    	{
    		System.out.println("please select fruits "+Arrays.toString(fruits));
    		sid=sc.nextInt();
    		
    		if(sid==101) {
    		System.out.println("you have selected "+fruits[1-1]);
    		
    		int price=fcost[1-1]*this.getqty();
    		System.out.println(" price is "+price);
    		}
    		if(sid==102) {
    			
        		System.out.println("you have selected "+fruits[2-1]);
        		int price=fcost[2-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		if(sid==103) {
    			
        		System.out.println("you have selected "+fruits[3-1]);
        		int price=fcost[3-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==104) {
    			
        		System.out.println("you have selected "+fruits[4-1]);
        		int price=fcost[4-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==105) {
    			
        		System.out.println("you have selected "+fruits[5-1]);
        		int price=fcost[5-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		}
    	if(pid==2)
    	{
    		System.out.println("please select vegetables "+Arrays.toString(veges));
    		sid=sc.nextInt();
    		
    		if(sid==201) {
    		System.out.println("you have selected "+veges[1-1]);
    		
    		int price=vcost[1-1]*this.getqty();
    		System.out.println(" price is "+price);
    		}
    		if(sid==202) {
    			
        		System.out.println("you have selected "+veges[2-1]);
        		int price=vcost[2-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		if(sid==203) {
    			
        		System.out.println("you have selected "+veges[3-1]);
        		int price=vcost[3-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==204) {
    			
        		System.out.println("you have selected "+veges[4-1]);
        		int price=vcost[4-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==205) {
    			
        		System.out.println("you have selected "+veges[5-1]);
        		int price=vcost[5-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		}
    	if(pid==3)
    	{
    		System.out.println("please select cosmetics "+Arrays.toString(cosmics));
    		sid=sc.nextInt();
    		
    		if(sid==301) {
    		System.out.println("you have selected "+cosmics[1-1]);
    		
    		int price=ccost[1-1]*this.getqty();
    		System.out.println(" price is "+price);
    		}
    		if(sid==302) {
    			
        		System.out.println("you have selected "+cosmics[2-1]);
        		int price=ccost[2-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		if(sid==303) {
    			
        		System.out.println("you have selected "+cosmics[3-1]);
        		int price=ccost[3-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==304) {
    			
        		System.out.println("you have selected "+cosmics[4-1]);
        		int price=ccost[4-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==305) {
    			
        		System.out.println("you have selected "+cosmics[5-1]);
        		int price=ccost[5-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		}
    	if(pid==4)
    	{
    		System.out.println("please select masalas "+Arrays.toString(masala));
    		sid=sc.nextInt();
    		
    		if(sid==401) {
    		System.out.println("you have selected "+masala[1-1]);
    		
    		int price=mcost[1-1]*this.getqty();
    		System.out.println(" price is "+price);
    		}
    		if(sid==402) {
    			
        		System.out.println("you have selected "+masala[2-1]);
        		int price=mcost[2-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		if(sid==403) {
    			
        		System.out.println("you have selected "+masala[3-1]);
        		int price=mcost[3-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==404) {
    			
        		System.out.println("you have selected "+masala[4-1]);
        		int price=mcost[4-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		if(sid==405) {
    			
        		System.out.println("you have selected "+masala[5-1]);
        		int price=mcost[5-1]*this.getqty();
        		System.out.println(" price is "+price);
        		}
    		
    		}
    	if(pid==5) 
    	{
    		System.out.println("===Thank you , for choosing this mart ,please visit again====");
    	}
    }
    public static void main(String arg[])
	{
		ClassA obj= new ClassA();
		obj.selectproduct();
	}
	
}