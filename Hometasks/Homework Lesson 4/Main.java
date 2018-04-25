package st.kostya;




public class Main {

	public static void main(String[] args) {
		Group c = new Group();
		try {
			c.addStudent(new Student("Male", 18, "Alex", "Petrov", 123603, "Math"));
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	    
	     
	    
		
		
        
		
		
	}

}
