package st.kostya;

public class Main {

	public static void main(String[] args) {
		Group bb = new Group();
		Student one = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student two = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student three = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student four = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student five = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student six = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student seven = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student eight = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student nine = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student ten = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		Student eleven = new Student("Male", 18, "Dave", "Jenkins", 456789, "History");
		
		try {
			bb.addStudent(one);
			bb.addStudent(two);
			bb.addStudent(three);
			bb.addStudent(four);
			bb.addStudent(five);
			bb.addStudent(six);
			bb.addStudent(seven);
			bb.addStudent(eight);
			bb.addStudent(nine);
			bb.addStudent(ten);
			bb.addStudent(eleven);

		} catch (MyExeption e) {
			System.out.println(e.getMessage());
		}

	}

}
