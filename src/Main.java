package homework2;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[] { 1, 2, 5, 7, 9 };

        int numberSearch = 5;

        boolean check = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numberSearch == numbers[i]) {
                check = true;
            }
        }

        if (check==true) {
            System.out.println(numberSearch + " Number is present in the list.");

        } else {

            System.out.println(numberSearch + " Number is NOT present in the list.");

        }

    }

}
