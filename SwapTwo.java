package tripillarassignment;
public class SwapTwo{
    public static void main(String[] args) {

        int a = 10, b = 20;

        // 🔹 Method 1: Using Third Variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap (Using Temp): " + a + " " + b);

        // Reset values
        a = 10;
        b = 20;

        // 🔹 Method 2: Without Using Third Variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap (Without Temp): " + a + " " + b);
    }
}
