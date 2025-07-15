
public class Main {
    public static void main(String[] args) {
        byte age = 30;
        long viewscount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        // Using concatenation
        System.out.println("age = " + age + ", views = " + viewscount + ", price = " + price +
                ", letter = " + letter + ", isEligible = " + isEligible);

        // Using formatted output
        System.out.printf("age = %d, views = %,d, price = %.2f, letter = %c, isEligible = %b\n",
                age, viewscount, price, letter, isEligible);
    }
}