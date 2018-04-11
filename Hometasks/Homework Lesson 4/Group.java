package st.kostya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Group implements ArmyCo {

	private Student[] gr = new Student[10];
	Scanner sc = new Scanner(System.in);

	public Group() {

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
		
		if (student == null) throw new NullPointerException();
		for (int i = 0; i < gr.length; i++) {
			if (gr[i] == null) {
				gr[i] = student;
				sc.close();
				return;
				
			}
		}
		throw new MyExeption();
	}

	public void addStudent(Student student) throws MyExeption, IllegalArgumentException, NullPointerException {
		if (student == null)
			throw new NullPointerException();
		for (int i = 0; i < gr.length; i++) {
			if (gr[i] == null) {
				gr[i] = student;

				return;
			}
		}
		throw new MyExeption();
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < gr.length; i++) {
			if (gr[i] == student) {
				gr[i] = null;
				break;

			}

		}

	}

	public Student surnameSearch(String surname) {

		for (Student student : gr) {
			if (surname != null & student.getSurname().equals(surname)) {
				return student;
			}

		}
		return null;
	}
		
		
		private void sort() {
			for (int i = 0; i < gr.length - 1; i++) {
				for (int j = i + 1; j < gr.length; j++) {
					if (compareStudent(gr[i], gr[j]) > 0) {
						Student n = gr[i];
						gr[i] = gr[j];
						gr[j] = n;
					}
				}
			}
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
		for(Student student:gr) {
			if(student!=null & student.getGender().equals("male") & student.getAge()>=18) {
				c++;
			}
		}
		Student [] cadetsArray = new Student[c];
		int id = 0;
		for(Student student:gr) {
			if(student!=null & student.getGender().equals("male") & student.getAge()>=18) {
				cadetsArray[id++] = student;
			}
		}
		return cadetsArray;
	}

	
}
