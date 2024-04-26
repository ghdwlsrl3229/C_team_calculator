public class Main {

    public static double getZegop(double target, int square) {
        return Math.pow(target, square);
    }

    public static void main(String[] args) {
        System.out.println(getZegop(2, 4));
    }
}
