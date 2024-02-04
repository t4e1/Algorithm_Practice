package codingtest.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Day240204Q1Tests {

    private static String input1, input2, input3;
    private static String output1, output2, output3;

    @BeforeAll
    public static void set () {

        input1 = "2\n" +
                "1 2 3 4 5 6 7\n" +
                "13 78 39 42 54 93 86";
        output1 = "12 2\n" +
                "260 42";

    }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                arguments(input1, output1)
        );
    }


    @DisplayName("최소값 연습 문제 1")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideSource")
    public void greedyPractice1(String input, String output) throws IOException {
        Object result = Day240204Q1.solution(input);
        Assertions.assertEquals(output, result);

    }

}


