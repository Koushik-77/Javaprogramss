package Codes;

import java.util.*;

public class Cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int k = sc.nextInt();
        List<Queue<Long>> lists = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(p -> p.val));
        for (int i = 0; i < k; i++) {
            int l = sc.nextInt();
            Queue<Long> list = new LinkedList<>();
            for (int j = 0; j < l; j++) {
                list.add(sc.nextLong());
            }
            lists.add(list);
            pq.add(new Pair(list.poll(), i));
        }
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            if (x + p.val < 0) break;
            x += p.val;
            if (!lists.get(p.idx).isEmpty()) {
                pq.add(new Pair(lists.get(p.idx).poll(), p.idx));
            }
        }
        System.out.println(x);
    }

    static class Pair {
        long val;
        int idx;

        Pair(long val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
}