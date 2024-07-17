package day02;

import java.util.Scanner;
import java.util.Stack;

public class Quiz03 {
    public static boolean solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("괄호를 입력하세요: ");
        String str = sc.nextLine();

        boolean isTrue = solution(str);
        if (isTrue) {
            System.out.println("Ok");
        }
        else {
            System.out.println("No");
        }
    }
}
