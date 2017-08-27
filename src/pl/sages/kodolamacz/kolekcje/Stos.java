package pl.sages.kodolamacz.kolekcje;

import java.util.Iterator;
import java.util.Stack;

public class Stos {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // FILO
        // first in, last out
        // LIFO
        // last in, first out
        stack.push("Ala");
        stack.push("Bruno");
        stack.push("Czesio");
        System.out.println(stack);
        System.out.println("Zdejmuję ze stosu "+stack.pop());
        System.out.println(stack);
        System.out.println("Podglądam tylko kto jest pierwszy " +
                stack.peek());
        System.out.println(stack);

        for (String s : stack) {
            System.out.println(s);
        }




    }

}
