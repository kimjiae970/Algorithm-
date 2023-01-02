import java.util.Arrays;

public class Prac3 {
    public String solution(String s) {

        String answer = "";

        String[] arr = s.split(" ");

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
           arr1[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr1);

        answer += (arr1[0] + " "+ arr1[arr1.length-1]);

        return answer;
    }
}
