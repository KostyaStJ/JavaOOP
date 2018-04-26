package st.kostya;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Group implements ArmyCo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Student> gr = new ArrayList<Student>();
	private Scanner sc = new Scanner(System.in);
	private int grSize = 10;

	public Group(ArrayList<Student> gr, Scanner sc) {
		super();
		gr = new ArrayList<>();
		this.sc = sc;
	}

	public Group() {
		super();
	}

	public List<Student> getGr() {
		return gr;
	}

	public void setGr(ArrayList<Student> gr) {
		this.gr = gr;
	}

	public void interactiveAdd(Student student) throws MyExeption, InputMismatchException, NullPointerException {
		try {
			System.out.println("Input favourite subject");
			student.setFavorSubj(sc.nextLine());
			System.out.println("Input name");
			student.setName(sc.nextLine());
			System.out.println("Input surname");
			student.setSurname(sc.nextLine());
			System.out.println("Input age");
			student.setAge(sc.nextInt());
			System.out.println("Input markbook ID");
			student.setMarkbookId(sc.nextLong());
			System.out.println("Input gender");
			student.setGender(sc.nextLine());
			sc.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("Incorrect data.Try again");
			return;
		}

		if (student.equals(null)) {
			throw new NullPointerException();
		}
		if (gr.size()>=grSize) {
			throw new MyExeption();
		}
			
		gr.add(student);
	}

	public void addStudent(Student student) throws MyExeption, IllegalArgumentException, NullPointerException {
		if (student.equals(null)) {
			throw new NullPointerException();
		}
		if (gr.size()>=grSize) {
			throw new MyExeption();
		}
			
		gr.add(student);
		
	}

	public void deleteStudent(long markId) {
		Iterator <Student>itr = this.gr.iterator();
		for (;itr.hasNext();) {
			Student student = itr.next();
			if (student.getMarkbookId()==markId) {
				itr.remove();
				
				
			}
		}
		throw new IllegalArgumentException("There is no student with that markbook number");

			}

		

	

	public Student surnameSearch(String surname) {

		for (Student student : gr) {
			if (surname != null & student.getSurname().equals(surname)) {
				return student;
			}

		}
		return null;
	}

	

	private int compareStudent(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getSurname().compareTo(b.getSurname());

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (Student student : gr) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	@Override
	public Student[] cadets() {
		int c = 0;
		for (Student student : gr) {
			if (student != null & student.getGender().equals("male") & student.getAge() >= 18) {
				c++;
			}
		}
		Student[] cadetsArray = new Student[c];
		int id = 0;
		for (Student student : gr) {
			if (student != null & student.getGender().equals("male") & student.getAge() >= 18) {
				cadetsArray[id++] = student;
			}
		}
		return cadetsArray;
	}

}
