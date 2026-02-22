public class 문제2_가장긴중복없는부분문자열길이 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(solution("abcabcbb") );
        sb.append('\n');
        sb.append(solution("bbbbb") );
        sb.append('\n');
        sb.append(solution("pwwkew"));
        sb.append('\n');
        sb.append(solution(""));
        sb.append('\n');

        System.out.println(sb);
    }
    
    public static int solution(String s){
        
        int[] cache = new int[128];
        int len =0 ;
        int l =0;

        for (int r = 0; r < s.length(); r++){
            cache[s.charAt(r) ]++;
            while(cache[s.charAt(r)] >1){
                cache[s.charAt(l++)]--;
            }
            len = Math.max(len,r-l +1 );
        }

        return len;

    }
}
