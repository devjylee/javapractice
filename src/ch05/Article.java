package ch05;

import java.io.Serializable;

public class Article implements Serializable {
	private static final long serialVersionUID = 1L;
	public String title;
	public String url;
	public transient boolean expired;

	public Article(String title, String url) {
		this.title = title;
		this.url = url;
		this.expired = expired;
	}

}