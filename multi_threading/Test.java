package multi_threading;

public class Test {
    public static void main(String[] args) {
        // create the thread class object
        int n = 8;
        for (int i = 0; i < n; i++) {
            ThreadTest object = new ThreadTest();

            // start() is replaced with run() for
            // seeing the purpose of start
            object.run();
        }

    }
}
