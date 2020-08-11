package main.java.training;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 201912-1
 * 报数
 *
 * @author wangzhs
 * @since 11/08/2020
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer data = Integer.valueOf(scanner.nextLine());
        Map<Integer, Integer> map = new TreeMap() {
            {
                this.put(1, 0);
                this.put(2, 0);
                this.put(3, 0);
                this.put(4, 0);
            }
        };
        for (int i = 1; i <= data; i++) {
            if (i % 7 == 0 || String.valueOf(i).contains("7")) {
                int key = 0 == i % 4 ? 4 : i % 4;
                Integer integer = map.get(key);
                map.put(key, integer + 1);
                data++;
            }
        }

        map.values().forEach(System.out::println);
    }
}
