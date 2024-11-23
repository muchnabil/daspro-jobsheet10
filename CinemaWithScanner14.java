import java.util.Scanner;
public class CinemaWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] audience = new String[4][2];
        String name, next;
        int row, column;

        while (true) {
            System.out.print("Enter a name : ");
            name = sc.nextLine();
            do {
                System.out.print("Enter row number : ");
                row = sc.nextInt();
                System.out.print("Enter column number : ");
                column = sc.nextInt();
                sc.nextLine();

                if (row > 4 || column > 2) {
                    System.out.println("Not available");
                    continue;
                }
                if (audience[row - 1][column - 1] != null){
                    System.out.println("seats on the row " + row + " column " + column + " already occupied, select another seat.");
                }
                else {
                    audience[row - 1][column - 1] = name;
                    break;
                }
            }while (true);
            System.out.print("Are they any other audience to be added? (y/n) : ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println();
        for (int i = 0; i < audience.length; i++) {
            for (int j = 0; j < audience[i].length; j++) {
                if (audience[i][j] == null) {
                    audience [i][j] = "***";
                }
            System.out.println(audience[i][j] + " row " + (i + 1) + " column " + (j + 1));
            }
        }
    }
}
