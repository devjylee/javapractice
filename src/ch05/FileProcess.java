package ch05;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileProcess {

	public static void main(String[] args) throws IOException {
		// 파일 시스템 객체 불러오기
		var fs = FileSystems.getDefault();
		
		var path1 = fs.getPath("C:/data/sample.txt");
		
		System.out.println(Files.exists(path1)); // true
		System.out.println(Files.isReadable(path1)); // true
		System.out.println(Files.isWritable(path1)); // true
		System.out.println(Files.isExecutable(path1)); // true
		
		System.out.println(Files.size(path1)); // 0
		
		// 파일 카피
		var path2 = Files.copy(path1, fs.getPath("C:/data/copy.txt"),StandardCopyOption.REPLACE_EXISTING);
		
		// 카피 파일 sub 카테고리로 이동
		Files.move(path2, fs.getPath("C:/data/sub/copy.txt"), StandardCopyOption.REPLACE_EXISTING);
		
		// 파일명 변환
		var path3 = Files.move(path1, fs.getPath("C:/data/sub/rename.txt"), StandardCopyOption.REPLACE_EXISTING);
		
		Files.delete(path3);
		
		Files.deleteIfExists(path3);

	}

}
