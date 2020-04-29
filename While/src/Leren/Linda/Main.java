package Leren.Linda;

public class Main {

    public static void main(String[] args) {
////
//        int count = 6;
////        while (count != 6) {
////            System.out.println("count value is " + count);
////            count++;
////        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);
//      }

        int number = 4;
        int count = 0;

        while (number < 20) {
            if (isEvenNumber(number)) {
                    count++;
                }
            number++;

            if(count >= 5) {
                System.out.println("Total even numbers found: " + count);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
                System.out.println("number: " + number + " is an even number");
                return true;
            } else {
                return false;
            }
        }
    }

