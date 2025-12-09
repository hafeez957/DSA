
// Checking the Parenthesis is Valid or not

import java.util.Stack;

class ParenthesisValidOrNot{
    public static void main(String[] args) {
        String s="({})([])";
        if(isValid(s))
            System.out.println("Parenthesis is Valid");
        else
            System.out.println("Parenthesis is not Valid");

    }

    public static boolean isValid(String s){
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }else if(st.isEmpty()){
                return false;
            }else if(ch=='}'&&st.peek()=='{'||ch==']'&&st.peek()=='['||ch==')'&&st.peek()=='('){
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
    }
}