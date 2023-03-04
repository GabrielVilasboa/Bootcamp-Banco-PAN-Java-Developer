package list;

public class Main {
    public static void main(String[] args) {

        int number = 1;

        No<Integer> firstNo = new No<>(number);

        number += number;

        No<Integer> secondNo = new No<>(number);
        firstNo.setNext(secondNo);

        number += number;

        No<Integer> thirdNo = new No<>(number);
        secondNo.setNext(thirdNo);

        number += number;

        No<Integer> fourthNo = new No<>(number);
        thirdNo.setNext(fourthNo);

        System.out.println(firstNo);

    }
}
