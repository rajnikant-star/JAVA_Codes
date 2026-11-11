import java.util.Arrays;

public class stack {
    static int[] stack = new int[5];
    static int top = -1;

    static void push(int ele) {
        if (top == stack.length - 1) {
            System.out.println("Overflow");
            return;
        }

        top++;
        stack[top] = ele;
    }

    public static void main(String[] args) {
        push(1);
        push(2);

        System.out.println(Arrays.toString(stack));
    }
}