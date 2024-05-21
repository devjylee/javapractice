package ch09.exception;

public class PatternSyntaxException extends IllegalArgumentException {
	
	private final String desc;
	private final String pattern;
	private final int index;
	
	public PatternSyntaxException(String desc, String regex, int index) {
		this.desc = desc;
		this.pattern  = regex;
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getDescription() {
		return desc;
	}

}
