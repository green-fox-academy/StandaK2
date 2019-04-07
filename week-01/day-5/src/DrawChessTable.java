// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class DrawChessTable {
    public static void main(String[] args) {

        int side = 8;
        String sign = "o";
        String space = " ";

        for (int row = 0; row < side; row++) {
            for (int column = 0; column < side / 2; column++) {
                if (row % 2 == 0) {
                    System.out.print(sign + space);
                } else {
                    System.out.print(space + sign);
                }
            }
            System.out.println();
        }
    }
}
