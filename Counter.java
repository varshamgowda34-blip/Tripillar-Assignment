package module5;

class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}
