package Leren.Linda;

public class Main {

    public static void main(String[] args) {

        int value = 3;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char letter = 'F';

        switch (letter) {
            case 'A':
                System.out.println("Letter is an A");
                break;

            case 'B':
                System.out.println("Letter is a B");
                break;

            case 'C':
                System.out.println("Letter is a C");
                break;

            case 'D':
                System.out.println("Letter is a D");
                break;

            case 'E':
                System.out.println("Letter is an E");
                break;

            default:
                System.out.println("Letter not found");
                break;

        }

    }
}
