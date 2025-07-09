package lanqiao;

import java.util.*;
import java.util.Map.Entry;

public class MainMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1); // map存储每个数的出现次数
        }
        int max = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        List<Integer> list = new ArrayList<>();
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey()); // 出现次数最大的值都放在集合中
            }
        }
        Collections.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }
        scan.close();
    }
}
