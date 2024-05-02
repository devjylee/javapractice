package ch05;

public class RegReplaceNamed {

	public static void main(String[] args) {
		var str = "사무용은 wings@example.com입니다.";
		System.out.println(str.replaceAll("(?i)(?<localName>[a-z0-9.1#$%&'*+/=?^_{|}~-]+)@(?<domain>[a-z0-9-]+(?:\\.[a-z0-9-]+)*)", "${domain}의 ${localName}"));
	}

}
