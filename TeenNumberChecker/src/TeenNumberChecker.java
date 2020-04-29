public class TeenNumberChecker {

    public static boolean hasTeen (int ageOne, int ageTwo, int ageThree) {
        return isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThree);
    }

    public static boolean isTeen (int ageX) {
        return (ageX >= 13 && ageX <= 19);
    }
}