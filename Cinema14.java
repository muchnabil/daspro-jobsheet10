public class Cinema14 {
    public static void main(String[] args) {

        String [][] audience = new String[4][2];

        audience [0][0] = "Amin";
        audience [0][1] = "Bena";
        audience [1][0] = "Candra";
        audience [1][1] = "Dela";
        audience [2][0] = "Eka";
        audience [2][1] = "Farhan";
        audience [3][0] = "Gisel";
        audience [3][1] = "Hana";

        for (int i = 0; i < audience.length; i++) {
            System.out.println("viewers on line " + (i + 1) + " : " + String.join(", ",audience[i]));
        }
    }
}