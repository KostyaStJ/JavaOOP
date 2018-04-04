package st.kostya;

public class Group {

	private Student[] gr = new Student[10];

	public Group() {

	}

	public void addStudent(Student student) throws MyExeption {
		for (int i = 0; i < gr.length; i++) {
			
			if (gr[i]==null) {
				gr[i] = student;
				return;
			}
		}
        throw new MyExeption();
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < gr.length; i++) {
			if (gr[i].equals(student)) {
				gr[i] = null;
				break;

			}

		}

	}
	
	public Student surnameSearch(String surname) {
		Student searchRes = null;
		for(int i=0;i<gr.length;i++) {
			if(gr[i].getSurname().equals(surname)) {
				searchRes=gr[i];
			}
		}
		return searchRes;
		
	}

}
