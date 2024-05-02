package ch05;

public class RegReplace {

	public static void main(String[] args) {
		var str = "서포트 사이트는 https://www.wings.msn.to/입니다.";
		System.out.println(str.replaceAll("(?i)http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w ./?%&=-]*)?", "<a href=\"$0\">$0</a>"));
	}

}
