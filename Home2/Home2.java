package Home2;
public class Home2 {
    public static void main(String[] args) {
        String[][] strings = MyArray();
        strings[1][1] = "t";
        Array arr = new Array();
        arr.setStrings(strings);
        arr.summ();
    }

    private static String[][] MyArray() {
        String[][] MyArray = new String[4][4];
        for (int i = 0; i < MyArray.length; i++) {
            for (int j = 0; j < MyArray[i].length; j++) {
                MyArray[i][j] = String.valueOf((int) (Math.random() * 10));
                System.out.print("|" + MyArray[i][j] + "|");
            }
            System.out.println();
        }
        return MyArray;
    }
}