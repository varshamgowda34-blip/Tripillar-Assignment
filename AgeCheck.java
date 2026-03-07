package module5;

public class AgeCheck {
    static void checkAge(int age) {
        if(age < 18)
            throw new
                    ArithmeticException("Not eligible");
        else
            System.out.println("Eligible");
    }
        public static void main(String[] args) {
        try {
            checkAge(20);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

