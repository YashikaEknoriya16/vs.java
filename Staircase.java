public class Staircase {
    public static boolean stair(int m[][], int key) {
        int row = 0, col = m[0].length - 1;
        while (row < m.length && col >= 0) {
            if (m[row][col] == key) {
                System.out.println("found (" + row + "," + col + ")");
                return true;
            } else if (key < m[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int m[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        stair(m, key);

    }
}
