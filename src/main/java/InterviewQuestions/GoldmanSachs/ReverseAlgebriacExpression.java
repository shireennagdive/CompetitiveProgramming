package InterviewQuestions.GoldmanSachs;

import java.util.*;

public class ReverseAlgebriacExpression {

    public static void main(String args[]) {
        String s = "1098";
        int flag=0;
        Stack<String> stk = new Stack<String>();
        for(int i=0;i<s.length();i++) {

            if(i==s.length()-1||(s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/')) {
                if(i==s.length()-1) {
                    String temp = s.substring(flag, i+1);
                    stk.push(temp);
                }
                else {
                    String temp = s.substring(flag, i);
                    stk.push(temp);
                    stk.push(Character.toString(s.charAt(i)));
                    flag=i+1;
                }
            }

        }
        while(!stk.isEmpty()) {
            System.out.print(stk.pop());
        }
        System.out.println();

    }
}