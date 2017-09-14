package Assignment3_2;
/*
 * program to show the use of super and this keyword with a constructor, methods, variables
 */
class Vehicle // Parent Class
{ 
   String name; // instance Variable
   String color="Black";
   Vehicle()//Default Constructor
   {  
       this("Maruti Desire");  // Calling parameterized Constructor from a default constructor using This Keyword
       System.out.println("Default Constructor Vehicle Created");  
   }  
   Vehicle(String name)//parameterized Constructor
   { 
       this.name=name; // to invoke Instance variable of a Class using This Keyword
       System.out.println("Parameterized Constructor Vehicle with parameter= " + name);  
   }  
   void speed()
   {
       System.out.println("Speed is 10 km/hr");
   }  
   void mileage()
   {  
       System.out.println("Milage is good");   
       this.speed();// Calling speed method using this keyword from mileage method  
   }  
   void engine()
   {
	   System.out.println("Engine working well...");
   }  
}  
class Car extends Vehicle //Child Class
{  
   String color="white";  
   void printColor()
   {  	
       System.out.println(color);//prints color of Car class 
       System.out.println(super.color);//prints color of Vehicle class
   }  
   void engine()
   {
	   System.out.println("Engine working Fine...");
   }  
   void fuel()
   {
	   System.out.println("Petrol or Desel...");
   }  
   void onRoad()
   {  
       super.engine();  //call Engine method of Vehicle Class or Parent Class
       fuel();  
   }  
   Car()
   {
      super(); //Super keyword will invoke Vehicle class constructor
      System.out.println("Car is working");
   }
} 
public class Assignment3_2
{
   public static void main(String args[])//Start of main Class
   {  
	   Vehicle v=new Vehicle();  //Creating object of  Vehicle Class
	   v.mileage(); // Calling Method mileage with object of Vehicle Class
	   Car c=new Car();  //Creating object of Car Class
	   c.printColor(); //Calling printColor Method of Car Class	 
	   c.onRoad(); //Calling onRoad method of Car Class
   }//Close of main Class
}

