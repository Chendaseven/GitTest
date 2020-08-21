package test_360;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("\\s+");
        System.out.println(Cal(strs));
    }
    public static String Cal (String[] strs) {
        Stack<String> stack1 = new Stack<String> ();
        Stack<String> stack2 = new Stack<String> ();
        //hello undo redo world.
        for (String str:strs){
            if (str.equals("undo")) {
                if (stack2.size() > 0) {
                    stack1.push(stack2.pop());
                }
            } else if (str.equals("redo")) {
                if (stack1.size() > 0) {
                    stack2.push(stack1.pop());
                }
            } else {
                stack2.push(str);
            }
        }
        String[] s = new String[stack2.size()];
        int i = stack2.size() - 1;
        while (stack2.size() > 0) {
            s[i] = stack2.pop();
            --i;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < s.length; ++j) {
            sb.append(s[j]);
            if (j < s.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}