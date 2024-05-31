package standardjava;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Ex14_11 {

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
		
		System.out.println("1. 단순그룹화(반별로 그룹화)");
		
		Map<Integer, List<Studentc>> stuByBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Studentc::getBan));
	
		for(List<Studentc> ban : stuByBan.values()) {
			for(Studentc s : ban) {
				System.out.println(s);
			}
		}
		
		System.out.println();
		
		System.out.println("2. 단순그룹화(성적별로 그룹화)");
		
		Map<Studentc.Level, List<Studentc>> stuByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) return Studentc.Level.HIGH;
					else if (s.getScore() >= 100) return Studentc.Level.MID;
					else return Studentc.Level.LOW;
				}));
		
		TreeSet<Studentc.Level> keySet = new TreeSet<>(stuByLevel.keySet());
	
		for(Studentc.Level key : keySet) {
			System.out.println("[" + key + "]");
			
			for(Studentc s : stuByLevel.get(key)) System.out.println(s);
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("3. 단순 그룹화 + 통계(성적별 학생수)");
		
		Map<Studentc.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) return Studentc.Level.HIGH;
					else if (s.getScore() >= 100) return Studentc.Level.MID;
					else return Studentc.Level.LOW;
				}, Collectors.counting()));
		
		for(Studentc.Level key : stuCntByLevel.keySet()) 
			System.out.printf("[%s] - %d명 %n", key, stuCntByLevel.get(key));
		
		System.out.println();
		
		System.out.println("4. 다중그룹화(학년별, 반별)");
		
		Map<Integer, Map<Integer, List<Studentc>>> stuByHakAndBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Studentc::getHak, Collectors.groupingBy(Studentc::getBan)));
		
		for(Map<Integer,List<Studentc>> hak : stuByHakAndBan.values()) {
			for(List<Studentc> ban : hak.values()) {
				System.out.println();
				for(Studentc s : ban) System.out.println(s);
			}
		}
		
		System.out.println();
		
		System.out.println("5. 다중그룹화 + 통계(학년별, 반별 1등)");
		
		Map<Integer, Map<Integer, Studentc>> topStuByHakAndBan = 
				Stream.of(stuArr)
						.collect(Collectors.groupingBy(Studentc::getHak, 
								Collectors.groupingBy(Studentc::getBan,
											Collectors.collectingAndThen(
														Collectors.maxBy(Comparator.comparingInt(Studentc::getScore)), 
														Optional<Studentc>::get))));
		
		for(Map<Integer, Studentc> ban : topStuByHakAndBan.values())
			for(Studentc s : ban.values())
				System.out.println(s);
		
		System.out.println();
		
		System.out.println("6. 다중그룹화 + 통계(학년별, 반별 성적그룹)");
		
		Map<String, Set<Studentc.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> s.getHak() + "-" + s.getBan(),
						Collectors.mapping(s -> {
							if(s.getScore() >= 200) return Studentc.Level.HIGH;
							else if(s.getScore() >= 100) return Studentc.Level.MID;
							else return Studentc.Level.LOW;
						}, Collectors.toSet())));
		
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key : keySet2) {
			System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
		}
		
		
	}

}
