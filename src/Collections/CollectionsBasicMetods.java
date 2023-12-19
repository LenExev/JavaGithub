package Collections;

import java.util.*;

public class CollectionsBasicMetods {

    public static void main(String[] args) {
        List<String> list1= new ArrayList<>();
        String [] strings ={"строка1", "строка2", "строка3","строка4", "строка5", "строка6"};
        list1.addAll(Arrays.asList(strings));
        for (String element : list1) {
            System.out.println(element);
        }

        System.out.println("*********************");
        List<String> list2 = new ArrayList<>(list1);;
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("*********************");

        List<String> list3 = Arrays.asList("1","2","3");
        for (String element : list3) {
            System.out.println(element);
        }
        System.out.println("*********************");

        list2.addAll(list2.size()/2,list3);
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("*********************");

        list2.sort(Collections.reverseOrder());
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("*********************");

        ListIterator<String> iterator = list2.listIterator();
        int count=0;
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(count % 2==0){
                iterator.remove();
            }
            count++;
        }
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("*********************");
        System.out.println("/////////////////////");

        Set<String> set1 = new HashSet<>();
        set1.add("set1_1");
        set1.add("set1_2");
        set1.addAll(list1);
        set1.addAll(list2);

        for (String element : set1) {
            System.out.println(element);
        }
        System.out.println("/////////////////////");

        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(list1);
        set2.addAll(list2);

        for (String element : set2) {
            System.out.println(element);
        }
        System.out.println("-----------------");

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(0,"Январь");
        map1.put(1,"Февраль");
        map1.put(2,"Март");
        map1.put(3,"Апрель");
        map1.put(4,"Май");
        map1.put(5,"Июнь");
        map1.put(6,"Июль");
        map1.put(7,"Август");
        map1.put(8,"Сентябрь");
        map1.put(9,"Октябрь");
        map1.put(10,"Ноябрь");
        map1.put(11,"Декабрь");

        System.out.println(map1.get(0));
        System.out.println(map1.get(11));
        System.out.println("--------------------");

        map1.put(6,"ОТПУСК");
        System.out.println(map1.get(6));
        System.out.println("--------------------");

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        for (Map.Entry<Integer, String> current : map1.entrySet()) {
            System.out.println(current.getKey() + " | " + current.getValue());
        }
        System.out.println("--------------------");
        System.out.println("--------------------");
        for (Map.Entry<Integer, String> current : map2.entrySet()) {
            System.out.println(current.getKey() + " | " + current.getValue());
        }
        System.out.println("--------------------");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");

        Set<String> set3 = new LinkedHashSet<>(Arrays.asList("(097)1234567", "ivanov@gmail.com","IvanIvanov125"));
        Map< String,Set<String>> map3 = new HashMap<>();
        map3.put("Ivanov",set3);
        for (Map.Entry< String,Set<String>> current : map3.entrySet()) {
            System.out.println(current.getKey() + " : " + current.getValue());
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
    }
}
