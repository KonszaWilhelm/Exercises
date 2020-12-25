package javaprogrammingmasterclass.exercises;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        int row = number;
        int column = number;
        String cunt = "";
        for (int i = 0; i < row; i++) {


            for (int j = 0; j < column; j++) {
                System.out.print(i + " " + j + "     ");
//                if (i == 0 || i == number - 1 || i == j || j == 0 || j == number - 1 || j == (number - i - 1)) {
//                    cunt += "*";
//                } else
//                    cunt += " ";
//            }

//
//            System.out.println(cunt);
//            cunt = "";

            }
            System.out.println();
        }


/* In the first or last row
 In the first or last column
 When the row number equals the column number
 When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)*/

    }
}

