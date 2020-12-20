package exercises;

public class ArrayOfObjects {
    static void ArrayGame(){
        String strings[] = {"whatever"};
        Object objects [] = strings;
        String againString [] = (String[]) objects;
//        againString[0] = new StringBuilder();
     //   objects[0] = new StringBuilder(); // throws ArrayStoreException as the array of objects points to the Array of Strings
    }
}
