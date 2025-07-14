class Main {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 49;
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        int res = sum(num1, num2);
        System.out.println("Sum: " + res);
    }
}
