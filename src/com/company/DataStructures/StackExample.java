package com.company.DataStructures;
/*
Solving Syntax error with stack, e.g:
(​var​ x = 2;
​var​ x = 2;)
(​var​ x = [1, 2, 3)];
 */

import java.util.NoSuchElementException;
import java.util.Stack;
public class StackExample {
    static String opening = "([{";
    static String closing = ")]}";
    static Stack<String> stack = new Stack<>();

    public static void linter(String s){

        char c;
        for (int i = 0; i < s.length() ; i++) {
            c = s.charAt(i);
            if(isOpeningBrace(c)){
                stack.push(String.valueOf(c));
            }
            else if(isClosingBrace(c)){
                if(doesCloseMostRecentOpeningBrace(c)){
                stack.pop();
                } else {
                    throw new RuntimeException("Incorrect closing brace");
                }
            }
        }
        if(!stack.empty()){
            throw new RuntimeException("Does not have closing brace");
        }

    }

    private static boolean doesCloseMostRecentOpeningBrace(char c) {
        try{
            return openingBraceOf(c).equals(stack.lastElement());
        } catch (NoSuchElementException e){
            return false;
        }

    }

    private static String openingBraceOf(char c) {
        String str = String.valueOf(c);

        if(str.equals(")")){
            return "(";
        } else if (str.equals("]")){
            return "[";
        }  else if (str.equals("}")) {
            return "{";
        }
        return null;
    }

    private static boolean isOpeningBrace(char c) {
        return opening.contains(String.valueOf(c));
    }

    private static boolean isClosingBrace(char c) {
        return closing.contains(String.valueOf(c));
    }
}
