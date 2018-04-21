package st.kostya;

public class Student extends Human  {
	private long markbookId;
	private String favorSubj;

	public Student(String gender, int age, String name, String surname, long markbookId, String favorSubj) {
		super(gender, age, name, surname);
		this.markbookId = markbookId;
		this.favorSubj = favorSubj;
	}

	public Student() {
		super();
	}

	public long getMarkbookId() {
		return markbookId;
	}

	public void setMarkbookId(long markbookId) {
		this.markbookId = markbookId;
	}

	public String getFavorSubj() {
		return favorSubj;
	}

	public void setFavorSubj(String favorSubj) {
		this.favorSubj = favorSubj;
	}

	@Override
	public String toString() {

		return super.toString() + "; markbookId: " + markbookId + "; Favorite Subject: " + favorSubj;
	}

}
