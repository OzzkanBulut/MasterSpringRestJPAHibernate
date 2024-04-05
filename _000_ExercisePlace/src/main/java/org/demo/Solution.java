package org.demo;

import java.util.List;
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) { // "([)]"
        Stack<Character> stack = new Stack<Character>();
        for(Character c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }


        }
        return stack.isEmpty();


    }
}
