package st.kostya;

public class MyExeption extends Exception {
	@Override
	public String getMessage() {
		return "The limit for adding students has been reached";
		
	}

}
