package ch05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {

	public static void main(String[] args) {
		final var file = "C:/data/article.ser";
		
		//오브젝트의 시리얼라이즈 & 보존
		try(var out = new ObjectOutputStream(new FileOutputStream(file)))
		{
			out.writeObject(new Article("Java11의 변경점과 새로운 API", "https://codezine.jp/article/corner/751"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일로부터 오브젝트를 취득
		try(var in = new ObjectInputStream(new FileInputStream(file)))
		{
			var a = (Article)in.readObject();
			System.out.println(a);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
