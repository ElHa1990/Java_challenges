public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // big count = count of big flour bags (5 kg)
        // small count = count of small flour bags (1 kg)

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigCountFive = bigCount * 5;
        if(bigCountFive + smallCount < goal) {
            return false;
        }

        if ((bigCountFive % goal) == 0) {
            return true;
        } else {
            return (smallCount >= (goal % 5));
        }
    }


    public static boolean newTry(int bigCountNew, int smallCountNew, int goalNew) {

        if (bigCountNew < 0 || smallCountNew < 0 || goalNew < 0) {
            return false;
        }

        int bigCountFive = bigCountNew * 5;

            if ((bigCountFive % goalNew) == 0) {
                return true;
            } else {
                return (smallCountNew >= (goalNew % 5));
            }

    }




        public static void main (String[]args){
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-2,2,12));
        System.out.println(canPack(2, 1, 5));



        }
    }

