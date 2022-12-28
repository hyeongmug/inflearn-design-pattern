package interpreter._01_before;

import java.util.Stack;

public class PostfixNotation {

    private final String expression;


    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }

    private void calculate() {
        Stack<Integer> mumbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    mumbers.push(mumbers.pop() + mumbers.pop());
                    break;
                case '-':
                    int right = mumbers.pop();
                    int left = mumbers.pop();
                    mumbers.push(left - right);
                    break;
                default:
                    mumbers.push(Integer.parseInt(c + ""));
            }

            System.out.println(mumbers.pop());
        }
    }
}
