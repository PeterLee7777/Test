package 集合;

import org.junit.Test;

import java.util.*;

public class SmallTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        for (int j = 0; j < 10; j++) {
            int i = scanner.nextInt();
            arrayList.add(i);
        }
        Collections.sort(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Integer && o2 instanceof Integer){
                    Integer o11 = (Integer) o1;
                    Integer o12 = (Integer) o2;
                    return -((Integer) o1).compareTo((Integer) o2);
                }throw new RuntimeException("不一致");
            }
        });
        for (Object obj:arrayList)
            System.out.println(obj);
    }

    @Test
    public void test(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a",78);
        hashMap.put("b",88);
        hashMap.put("c",58);
        hashMap.put("d",98);

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println(entries);
    }

}
