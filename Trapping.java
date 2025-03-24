public class Trapping {
    public static int trappinggg(int h[]) {
        int n = h.length;
        int leftmax[] = new int[n];
        leftmax[0] = h[0];

        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(h[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = h[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(h[i], rightmax[i + 1]);
        }

        int trap = 0;

        for (int i = 0; i < n; i++) {
            int water = Math.min(leftmax[i], rightmax[i]);
            trap += water - h[i];
        }

        return trap;
    }

    public static void main(String[] args) {
        int[] h = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = trappinggg(h);
        System.out.println("Trapped water: " + result);
    }
}
