package ch09.enumclass;

public class EnumConstSeasonClient {

	public static void main(String[] args) {
		var ecs = new EnumConstSeason();
		ecs.processSeason(EnumConstSeason.SPRING);
		ecs.processSeason(4); // 상정하지 않은 값도 받음
	}

}
