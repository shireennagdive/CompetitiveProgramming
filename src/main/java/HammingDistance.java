package main.java;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 15));
    }

    public static int hammingDistance(int x, int y) {
        return (x^y) == 0 ? 0 : (x^y)%2 + hammingDistance(x/2, y/2);
    }
}
