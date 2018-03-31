package ooponehw;

public class Main {

	public static void main(String[] args) {
	  Cat catOne = new Cat("Tom", "Grey", "Male", 2);
	  catOne.meow();
	  catOne.infoprint();
	  
	  System.out.println();    
	  
	  Cat catTwo = new Cat("Jess", "White", "Female", 1);
	  catTwo.sleep();
	  catTwo.meow();
      catTwo.infoprint();

	}

}
