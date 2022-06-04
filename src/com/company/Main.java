package com.company;

import java.util.*;

/**
 * 0 жана 1 деген сандар менен рандомно Массивди,
 * ArrayList ти жана LinkedList ти толтурунуз.
 * Overload методдорду тузунуз,
 * алар сортировка болгон элементтерди кайтарсын.
 * Башында 0 дор жана аягында 1 лер.
 */

public class Main {

    public static void main(String[] args) {

        Random randoms = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        int[] array = new int[10];
        System.out.print("Arrays numbers : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = randoms.nextInt(2);
        }
        methodArray(array);

        Collections.sort(arrayList);
        System.out.print("Array list : ");
        for (int i = 0; i < 10; i++) {
            int random = randoms.nextInt(2);
            arrayList.add(random);
        }
        methodArraylist(arrayList);

        System.out.print("Linked list : ");
        for (int i = 0; i < 10; i++) {
            int random = randoms.nextInt(2);
            linkedList.add(random);
        }
        methodLinkedlist(linkedList);
    }

    public static void methodArray(int[] arrays) {
        Arrays.sort(arrays);
        for (int a:arrays) {
            System.out.print(a+" ");
        }
        System.out.println();
    }


    public static void methodArraylist(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        for (Integer a:arrayList) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void methodLinkedlist(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        for (Integer l : linkedList) {
            System.out.print(l + " ");
        }
    }
}

        /*System.out.println(Arrays.toString(arrays));*/
       /* System.out.println(method(4, 3, 11));
        System.out.println(method(2, 1, 0));
        System.out.println(method(3, 4));
*/
/*Arrays.sort(a*//*rray);
            System.out.print(array[i]);
            System.out.print(", ");*/

/*System.out.println(l);*/
            /*if (l== linkedList.lastIndexOf(",")){
                linkedList.remove(",");*/

           /* array[i] = randoms.nextInt(0, 2);
            arrayList.add(randoms.nextInt(0, 2));
            linkedList.add(randoms.nextInt(0, 2));*/

   /* @Override
    public int compare(Object o1, Object o2) {
        return method(4, 3, 0);
    }
}*/

        /*Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator);
        }*/


    /*Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return o1-o2;
        }
    }*/


/*System.out.println("linked list " + linkedList);*/

/*Collections.sort(array);*/
/*Collections.sort(linkedList);*/
