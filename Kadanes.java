public class Kadanes {
    public static void kadane(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = -1;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subb:" + ms);
    }

    public static void main(String[] args) {

        int number[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        kadane(number);
    }
}
