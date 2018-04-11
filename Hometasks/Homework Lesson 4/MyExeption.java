package st.kostya;

public class MyExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "The limit for adding students has been reached";
		
	}

}
