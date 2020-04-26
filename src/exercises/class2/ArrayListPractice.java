package exercises.class2;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int getSum(ArrayList<Integer> arrayList) {

        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) % 2 == 0) {
                sum += arrayList.get(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        //ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);

        System.out.println(getSum(arrayList));
    }
}
