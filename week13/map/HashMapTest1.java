package map;

import java.util.HashMap;

public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("홍길동", 90);
        map.put("김철수", 85);
        map.put("이영희", 95);

        // get()
        System.out.println("홍길동 점수: " + map.get("홍길동"));

        // containsKey()
        System.out.println("김철수 존재? " + map.containsKey("김철수"));

        // remove()
        map.remove("김철수");

        // keySet()
        System.out.println("모든 학생 목록: ");
        for (String name : map.keySet()) {
            System.out.println(name + " : " + map.get(name));
        }

        // size()
        System.out.println("총 학생 수: " + map.size());
    }
}
