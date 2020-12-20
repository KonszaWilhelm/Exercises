package javaprogrammingmasterclass.exercises;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigFlourBags = bigCount * 5;
        int smallFlourBags = smallCount * 1;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigFlourBags + smallFlourBags == goal || smallFlourBags >= goal) {
            return true;
        } else if (bigFlourBags + smallFlourBags > goal && goal % 5 <= smallFlourBags) {
            return true;
        }else
            return false;
    }
}
