// Day2 2025.04.15
// 오후 보충자료: Java 1장,2장
// 1. 환경설정 2. 변수 3. 연산자 4. 조건식 5. 입출력 6. 참조타입

package AfterLecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lecture_0415 {
    public static void main(String[] args) throws IOException {
        /* 데이터 타입 출력
        System.out.println("Hello World");
        int a = 7;
        double b = 4.3;
        float c = 171.8f;
        boolean d = true;
        char e = 'c';
        String f = "Hello Java World!";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);*/


        /* 명시적 형변환
        double a = 2.3;
        int b = (int) a;
        System.out.println(b);*/

        /* 연산자
        String str = "a + b = ";
        int c = 10;
        System.out.println(str + c);

        int d = 10;
        char e = 'e';
        System.out.println(d + e);*/

        /*
        String str1 = "abc";
        String str2 = "def";

        boolean result1 = "abc".equals("abc");
        boolean result2 = "abc".equals("def");
        boolean result3 = "abc".equals(str1);
        boolean result4 = "abc".equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("abc"=="def");*/


        /* 첫번째 숫자부터 두번째 숫자까지의 합 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a값 입력: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b값 입력: ");
        int b = Integer.parseInt(br.readLine());
        if (a > b){
            return;
        }
        int sum =0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("두 정수의 합: " + sum);*/

        /* 랜덤 숫자 맞추기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int randNum = (int)(Math.random()*99);

        while(true) {
            System.out.print("랜덤 숫자를 입력하세요 : ");
            int input = Integer.parseInt(br.readLine());

            if(randNum == input) {
                System.out.println("정답입니다! 랜덤 숫자는 "+randNum);
                break;
            }
            if(randNum > input) {
                System.out.println("Up");
            }
            if(randNum < input) {
                System.out.println("Down");
            }
        }*/

        /* 배열의 합, 평균 출력
        int[] nums = new int[]{ 100,39,60,30,42,40,25,70,90,55};

        float sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        float avg = sum / nums.length;

        System.out.println("배열의 합산 값 : " + sum);
        System.out.println("배열의 평균 값 : " + avg);*/

        /* 랜덤 배열, 합, 평균 출력
        int[] arr = new int[10];
        float sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100);
            sum += arr[i];
        }

        float avg = sum/arr.length;

        System.out.println("랜덤 배열: " + Arrays.toString(arr));
        System.out.println("랜덤 배열의 합산: " + sum);
        System.out.println("랜덤 배열의 평균: " + avg);*/
        
    }
}
