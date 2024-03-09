package Modulos.Mod11_Colecoes_1.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePrioritaria {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Short");
        queue.add("Very long indeed");
        queue.add("Medium");

        while (queue.size() != 0 ){
            System.out.println(queue.remove());
        }
    }
}
