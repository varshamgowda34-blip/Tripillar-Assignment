package module5;

    class LifeCycle extends Thread {
        public void run() {
            System.out.println("Thread running");     }
        public static void main(String[] args) {
            LifeCycle t = new LifeCycle();
            t.start();     }
    }

