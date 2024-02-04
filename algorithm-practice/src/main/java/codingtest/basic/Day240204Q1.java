package codingtest.basic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Day240204Q1 {

    /* 배열의 최소값? (BaekJoon - 3058)
     * 7개의 자연수가 주어질 때, 이들 중 짝수인 자연수들을 모두 골라 그 합을 구하고,
     * 고른 짝수들 중 최솟값을 찾는 프로그램을 작성하시오.
     * 예를 들어, 7개의 자연수 13, 78, 39, 42, 54, 93, 86가 주어지면
     * 이들 중 짝수는 78, 42, 54, 86이므로 그 합은 78 + 42 + 54 + 86 = 260 이 되고,
     * 42 < 54 < 78 < 86 이므로 짝수들 중 최솟값은 42가 된다.
     * */

    /* 입력은 T개의 테스트 데이터로 구성된다.
     * 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
     * 각 테스트 데이터는 한 줄로 구성되어 있고, 7개의 자연수가 공백으로 구분되어 있다.
     * 입력으로 주어지는 자연수는 1보다 크거나 같고,
     * 100보다 작거나 같다. 7개의 자연수 중 적어도 하나는 짝수이다.
     * */

    /*  각 테스트 데이터에 대해, 7개 자연수 중 짝수의 합과 최솟값을 공백으로 구분하여 한 줄에 하나씩 출력한다.
     * */

//    public static void main(String[] args) {
//        String str = "a b c d e";
//        StringTokenizer st = new StringTokenizer(str);
//        System.out.println(st);
//    }
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken());
        int[][] testArray = new int[n][7];

        int s[][] = new int[n][2];

        /* 다차원 배열에 값 삽입 */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                testArray[i][j] = Integer.valueOf(st.nextToken());

                if (testArray[i][j] % 2 == 0) {
                    s[i][1] += testArray[i][j];
                }

            }

        }





        return null;
    }


}
