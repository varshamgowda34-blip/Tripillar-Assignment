package module4;

public class GarbageCollectionDemo {
         public void finalize() {
             System.out.println("Object garbage collected");
         }
        public static void main(String[] args) {
             GarbageCollectionDemo obj = new GarbageCollectionDemo();
             obj = null;
             System.gc();
        }
    }


