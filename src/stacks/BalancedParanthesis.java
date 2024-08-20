package stacks;

import java.util.ArrayDeque;

public class BalancedParanthesis {

    public static void main(String[] args) {
        isBalanced("(({{[[]]}}))");
    }

    public static boolean isBalanced(String paranthesis) {
        char[] characters = paranthesis.toCharArray();
        ArrayDeque<Character> characterArrayDeque = new ArrayDeque<>();
        for(int i = 0; i < characters.length; i++) {
            if(characters[i] == '[' || characters[i] == '{' || characters[i] == '(') {
                characterArrayDeque.push(characters[i]);
            } else {
                if(characterArrayDeque.isEmpty()) {
                    return false;
                } else if (!isMatching(characterArrayDeque.peek(), characters[i])) {
                    return false;
                } else {
                    characterArrayDeque.pop();
                }
            }
        }
        return (characterArrayDeque.isEmpty());
    }
    
    public static boolean isMatching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
    }

}
