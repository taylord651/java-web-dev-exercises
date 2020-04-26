package exercises.class2;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,8};

        for(int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            } else {
                continue;
            }
        }
    }

}
