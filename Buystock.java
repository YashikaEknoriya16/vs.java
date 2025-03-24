public class Buystock {
    public static int buySell(int price[]) {
        int buyp = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyp < price[i]) {
                int pro = price[i] - buyp;
                maxprofit = Math.max(maxprofit, pro);
            } else {
                buyp = price[i];
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buySell(price));
    }
}
