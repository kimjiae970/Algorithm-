package programmers;

class Prac16 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int yellow_w = 1; yellow_w <= brown; yellow_w++) {
            for( int yellow_h = 1; yellow_h <= yellow_w; yellow_h++) {

                int brown_w = yellow_w+2;
                int brown_h = yellow_h+2;

                int total_v = brown + yellow;

                if(yellow_w * yellow_h == yellow) {

                    if(total_v == brown_w*brown_h) {
                        answer[0] = brown_w;
                        answer[1] = brown_h;
                    }
                }

            }

        }

        return answer;
    }
}
