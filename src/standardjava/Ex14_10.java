package standardjava;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Studentc {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Studentc(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}

	public int getHak() {
		return hak;
	}

	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %d학년 %d반,  %3d점]",
				name, isMale? "남" : "여", hak, ban, score);
	}
	
	enum Level { HIGH, LOW, MID }
	
}

public class Ex14_10 {

	public static void main(String[] args) {
		Studentc[] stuArr = {
				new Studentc("나자바", true, 1, 1, 300),
				new Studentc("김자바", true, 1, 1, 250),
				new Studentc("박자바", true, 1, 1, 200),
				new Studentc("최자바", false, 1, 2, 150),
				new Studentc("김자바", false, 1, 2, 100),
				new Studentc("강자바", true, 1, 2, 200),
				new Studentc("안자바", false, 1, 3,  50),
				new Studentc("황자바", true, 1, 3, 100),
				new Studentc("이자바", true, 2, 1, 200),
				new Studentc("한자바", false, 2, 1, 300),
				new Studentc("남자바", true, 2, 1, 150),
				new Studentc("신자바", false, 2, 2, 200),
				new Studentc("서자바", true, 2, 2, 100),
				new Studentc("김자바", true, 2, 3,  50),
				new Studentc("오자바", false, 2, 3, 200)
		};
		
		System.out.println("1. 단순분할 (성별로 분할)");
		
		Map<Boolean, List<Studentc>> stuByGender = Stream.of(stuArr).collect(Collectors.partitioningBy(Studentc::isMale));
		
		List<Studentc> maleStudent = stuByGender.get(true);
		List<Studentc> femaleStudent = stuByGender.get(false);
		
		for (Studentc s : maleStudent) System.out.println(s);
		for (Studentc s : femaleStudent) System.out.println(s);

		System.out.println();
		
		System.out.println("2. 단순분할 + 통계(성별 학생 수)");
		
		Map<Boolean, Long> stuNumByGender = Stream.of(stuArr).collect(Collectors.partitioningBy(Studentc::isMale, Collectors.counting()));

		System.out.println("남학생수: " + stuNumByGender.get(true));
		System.out.println("여학생수: " + stuNumByGender.get(false));
		
		System.out.println();
		
		System.out.println("3. 단순분할 + 통계(성별 1등)");
		
		Map<Boolean, Optional<Studentc>> topScoreByGender = Stream.of(stuArr).collect(Collectors.partitioningBy(Studentc::isMale, Collectors.maxBy(Comparator.comparingInt(Studentc::getScore))));
		
		System.out.println("남학생 1등: " + topScoreByGender.get(true));
		System.out.println("여학생 1등: " + topScoreByGender.get(false));
		
		Map<Boolean, Studentc> topScoreByGender2 = Stream.of(stuArr).collect(Collectors.partitioningBy(Studentc::isMale, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Studentc::getScore)), Optional::get)));
		
		System.out.println("남학생 1등: " + topScoreByGender2.get(true));
		System.out.println("여학생 1등: " + topScoreByGender2.get(false));
		
		System.out.println();
		
		System.out.println("4. 다중분할(성별 불합격자, 100점 이하)");
		
		Map<Boolean, Map<Boolean, List<Studentc>>> faildStuByGender = Stream.of(stuArr).collect(Collectors.partitioningBy(Studentc::isMale, Collectors.partitioningBy(s -> s.getScore() <= 100)));
		
		List<Studentc> failedMaleStu = faildStuByGender.get(true).get(true);
		List<Studentc> failedFemaleStu = faildStuByGender.get(false).get(true);
		
		for(Studentc s : failedMaleStu) System.out.println(s);
		for(Studentc s : failedFemaleStu) System.out.println(s);
		
		
	}

}
