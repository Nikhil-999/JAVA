import java.util.*;

public class ArrayDequeInJava {
    public static void main(String[] args) {

        ArrayDeque<Integer> Ad = new ArrayDeque<>();
        // OR
        Queue<Integer> Ad2 = new ArrayDeque<>();

        Ad.offer(56);
        Ad.offer(506);
        Ad.offer(560);
        Ad.offer(956);
        Ad.offer(586);
        Ad.offer(546);

        Ad2.offer(9);
        Ad2.offer(56);
        Ad2.offer(99);
        Ad2.offer(79);
        Ad2.offer(59);
        Ad2.offer(449);

        System.out.println(Ad);
        System.out.println(Ad2);

        Ad.poll();
        Ad.pollLast();
        Ad.pollFirst();

        System.out.println(Ad);

        System.out.println(Ad.peek());
        System.out.println(Ad.peekFirst());
        System.out.println(Ad.peekLast());

        System.out.println(Ad.offerFirst(0));
        System.out.println(Ad.offerLast(0));
        System.out.println(Ad);

    }
}
