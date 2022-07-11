package 集合;

import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void test(){
        Collection collection = new ArrayList();

        collection.add("AA");
        collection.add("BB");
        collection.add(123);
        collection.add(new Date());

        System.out.println(collection.size());

        Collection collection1 = new ArrayList();
        collection1.add(456);
        collection1.add("cc");

        collection.addAll(collection1);
        System.out.println(collection);

        System.out.println(collection.isEmpty());

//        collection.clear();
//        System.out.println(collection);

        collection.add(new Person("TOM",20));
        String tom = new String();
        tom = "Tom";
        collection.add(tom);
        Person mike = new Person("Mike", 22);
        collection.add(mike);

        System.out.println(collection);
        System.out.println(collection.contains("AA"));
        System.out.println(collection.contains("Tom"));
        System.out.println(collection.contains(mike));
        System.out.println(collection.contains(new Person("TOM",20)));
        collection.add(mike);
        collection1.add(78979545);
        collection.contains(collection1);
        System.out.println(collection);
        System.out.println(collection.remove(mike));
        System.out.println(collection);

        collection.removeAll(collection1);
        System.out.println(collection);

        Collection collection2 = Arrays.asList("af", "faaf");
        List list = Arrays.asList("af", "faaf");
        System.out.println(collection2 + "  !!  " + list);

    }

    @Test
    public void test1(){
        Collection collection = new ArrayList();

        collection.add("AA");
        collection.add("BB");
        collection.add(123);
        collection.add(new Date());

        Collection collection2 = Arrays.asList("AA", "faaf");
//        System.out.println(collection.retainAll(collection2));
        Iterator iterator = collection.iterator();


//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println(iterator.next());
//        }
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for(Object obj: collection){
            System.out.println(obj);
        }

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,};
        for(int i: arr){
            System.out.println(i);
        }
    }

    @Test
    public void test2(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(1234);
        arrayList.add(12345);
        arrayList.add(123456);
        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add(new Person("tom",18));

        System.out.println(arrayList);

        arrayList.add(2,2222);
        System.out.println(arrayList);

        List list = Arrays.asList(123, 456, 78);
        arrayList.addAll(2,list);
        System.out.println(arrayList);

        System.out.println(arrayList.indexOf(123));
        System.out.println(arrayList.lastIndexOf(123));
        System.out.println(arrayList.subList(2, 6));

        Object remove = arrayList.remove(1);
        System.out.println(remove);
        System.out.println(arrayList);
        arrayList.set(2,8888);
        System.out.println(arrayList);

        List list1 = arrayList.subList(2, 5);
        System.out.println(list1);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        for(Object obj : arrayList)
            System.out.println(obj);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }

    @Test
    public void test3(){
        HashSet hashSet = new HashSet();
        hashSet.add(11);
        hashSet.add(22);
        hashSet.add(33);
        hashSet.add("AA");
        hashSet.add("BB");
        hashSet.add("CC");
        hashSet.add(new Person("tom",18));
        hashSet.add(new Person("tom",19));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());


    }

    @Test
    public void test4(){
        HashMap hashMap = new HashMap();
        hashMap.put("aa",123);
        hashMap.put("bb",223);
        hashMap.put("cc",323);
        hashMap.put("dd",423);

        Set set = hashMap.entrySet();
        System.out.println(set);

        for (Object object:set){
            System.out.println(object);
        }
        Collection values = hashMap.values();
        System.out.println(values);
        Iterator iterator = values.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
