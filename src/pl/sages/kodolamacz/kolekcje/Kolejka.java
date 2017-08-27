package pl.sages.kodolamacz.kolekcje;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kolejka {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // FIFO
        // first in, first out
        queue.add("Ania");
        queue.add("Bania");
        queue.add("Czesio");

        System.out.println(queue);

        System.out.println("Obsługuję "+queue.poll());
        System.out.println("Teraz w kolejce zostali:");
        System.out.println(queue);
    }

}
