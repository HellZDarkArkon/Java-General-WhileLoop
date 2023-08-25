package Java.general.whileloop;

public class WhileLoop {
    public static void main(String[] args) {
        boolean b = true;
        while(b) {
            for(int i = 0; i < 16; i++) {
                for(int j = 0; j < 64; j++) {
                    System.out.println("Hello, " + (j+1) + ", " + (i+1));
                }
            }
            b = false;
        }
    }
}