// Day5 2025.04.18
// 통합강의 : 알고리즘

package Java_algorithm_01;

// 프로그래머스 lv1 예산
/*import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
            result += d[i];
            if(result >= budget) {
                answer = i;
                break;
            }
        }

        if(result < budget) {
            answer = d.length;
        }
        return answer;
    }
}*/

// 프로그래머스 lv1 소수 만들기
// 소수 판별하여 배열생성 후 추가
// 배열에서 서로 다른 소수 3개 합 갯수 출력

/*class Solution {
    public int solution(int[] nums) {
        int count = 0; // 3개의 소수 합 갯수

        // 3개의 수를 뽑는 모든 조합 - 완전 탐색
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // 소수 판별 함수
    public boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}*/

// 프로그래머스 lv1 완주하지 못한 선수

/*import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        // 한 명이 더 많으므로 마지막까지 비교
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }

        // 모두 같았다면 마지막 주자가 완주하지 못한 사람
        answer = participant[participant.length - 1];
        return answer;
    }
}*/

// 프로그래머스 lv2 전화번호 목록

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 번호가 다음 번호의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}












