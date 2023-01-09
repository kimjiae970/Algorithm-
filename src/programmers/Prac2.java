package programmers;

class Prac2 {
    public int solution(int[] numbers) {

        int answer = 0;

        for( int i = 0; i < 10; i++ ) {
            answer += i ;
        }

        for ( int i = 0; i < numbers.length; i++) {

            answer -= numbers[i];
        }
        System.out.println(answer);
        return answer;
    }

}