public class Josephus {

    // TODO: Implement this method
    public static int josephus(int n, int k) {
        // Return survivor position (1-indexed)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(josephus(n, k));
        sc.close();
    }
}