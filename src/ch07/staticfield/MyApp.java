package ch07.staticfield;

public class MyApp {
	public static final String BOOK_TITLE = "독습 Java";
	public final String APP_NAME;
	
	public MyApp(String value) {
		this.APP_NAME = value;
	}
}
