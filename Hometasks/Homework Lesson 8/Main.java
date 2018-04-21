package st.kostya;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Group bb = new Group();
		Student one = new Student("Male", 19, "Andrey", "Petrov", 110924 , "Math");
		Student two = new Student("Male", 18, "Vitaliy", "Sydorov", 110926 , "Law");
		Student three = new Student("Male", 18, "Fedor", "Smolov", 110928 , "Chemistry");
		Student four = new Student();
		Student five = new Student();
		
		try {
			bb.addStudent(one);
			bb.addStudent(two);
			bb.addStudent(three);
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NullPointerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MyExeption e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		File group = new File("gr.txt");
		try {
			SaveLoadWorker.saveOb(group, bb);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//	   try {
//		bb.interactiveAdd(four);
//		bb.interactiveAdd(five);
//	   } catch (InputMismatchException e) {
//		System.out.println("Incorrect data.Try again");
//		return;
//	} catch (NullPointerException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (MyExeption e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//   	}
	     
	    
	     
	    
		
		
        
		
		
	}

}
