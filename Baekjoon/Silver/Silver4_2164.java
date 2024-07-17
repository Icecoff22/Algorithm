package day02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Quiz01 {
    public int solution(int num) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }
        if (q.isEmpty()) {
            throw new NullPointerException();
        }
        return q.poll();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Quiz01 quiz = new Quiz01();
        System.out.println(quiz.solution(num));
    }
}
