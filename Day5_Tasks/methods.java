class AllMethodsDemo {

    // 1. No parameters, no return
    void greet() {
        System.out.println("Hello! This is no parameter, no return method");
    }

    // 2. No parameters, but return value
    int getNumber() {
        return 100;
    }

    // 3. Parameters, no return
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // 4. Parameters and return value
    int multiply(int a, int b) {
        return a * b;
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    // Recursive method
    int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // Calling static method
        staticMethod();

        // Creating object
        AllMethodsDemo obj = new AllMethodsDemo();

        // 1. No parameter, no return
        obj.greet();

        // 2. No parameter, return
        int num = obj.getNumber();
        System.out.println("Returned Number = " + num);

        // 3. Parameter, no return
        obj.add(10, 20);

        // 4. Parameter and return
        int result = obj.multiply(5, 4);
        System.out.println("Multiplication = " + result);

        // Recursive method
        int fact = obj.factorial(5);
        System.out.println("Factorial = " + fact);
    }
}