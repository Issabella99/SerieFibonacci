public class Main {
    int a = 0;
    int b = 1;
    int c = 0;

    public Main() {
        fibonacci();
    }

    public void fibonacci() {
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
