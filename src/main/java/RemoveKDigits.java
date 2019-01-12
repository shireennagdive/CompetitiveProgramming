import java.util.Stack;

class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<num.length();i++){
            while(k>0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        sb.reverse();

        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}