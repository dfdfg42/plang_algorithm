import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
public class 문제1_유효한괄호문자열 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append(solution("()"));
        sb.append('\n');
        sb.append(solution("()[]{}"));
        sb.append('\n');
        sb.append(solution("([)]"));
        sb.append('\n');
        sb.append(solution("([)]"));
        sb.append('\n');
        sb.append(solution("{[]}"));
        sb.append('\n');

        System.out.println(sb);

    }

    public static boolean solution(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c =='[' || c=='{'){
                stack.push(c);
            }else if(c == ')' || c == ']' || c== '}'){
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if(c==')') {
                    if(top != '(') return false;
                    stack.pop();
                }
                if(c==']'){
                    if(top != '[') return false;
                    stack.pop();
                }
                if(c == '}'){
                    if(top != '{') return false;
                    stack.pop();
                }

            }
        }

        return stack.isEmpty();
    }
}
