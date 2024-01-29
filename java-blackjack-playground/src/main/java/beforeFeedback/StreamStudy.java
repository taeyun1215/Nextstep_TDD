package beforeFeedback;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamStudy {
    public static int sumOverThreeAndDouble(List<Integer> numbers) {
        return numbers.stream() // 스트림 생성
                .filter(number -> number > 3) // 3보다 큰 숫자 필터링
                .mapToInt(number -> number * 2) // 각 숫자를 2배
                .sum(); // 합 계산
    }

    public static void printLongestWordTop100() {
        String filePath = "src/main/resources/fp/war-and-peace.txt";
        try {
            Files.lines(Paths.get(filePath)) // 파일 읽기
                    .flatMap(line -> Arrays.stream(line.split("[^a-zA-Z]+"))) // 단어로 분리
                    .filter(word -> word.length() > 12) // 12자를 초과하는 단어 필터링
                    .map(String::toLowerCase) // 모든 단어를 소문자로 변환
                    .distinct() // 중복 제거
                    .sorted(Comparator.comparingInt(String::length).reversed()) // 길이에 따라 내림차순 정렬
                    .limit(100) // 상위 100개 단어
                    .forEach(System.out::println); // 출력
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long sumAll(List<Integer> numbers) {
        return 0;
    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return null;
    }

    public static long countWords() {
        return 0;
    }
}
