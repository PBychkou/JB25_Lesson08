public class Task_18_2_EqualsOperator {

    public static void main(String[] args) {
        Task_18_2_Fraction f1 = new Task_18_2_Fraction(1, 2);
        Task_18_2_Fraction f2 = new Task_18_2_Fraction(1, 2);

        if (f1.equals(f2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
    }
}