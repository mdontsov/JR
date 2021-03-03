package G_methods.c_methodParameterList;

public class MethodParameterList {

    int getZero() { // niladic/no arguments method
        return 0;
    }

    int increment(int number) { // monadic/1 argument method
        return number++;
    }

    int sum(int a, int b) { // dyadic/2 arguments method
        return a+b;
    }

    int plusMinus(int a, int b, int c) { // triadic/3 arguments method
        return a+b-c;
    }

    double average(double a, double b, double c, double d) { // polyadic/4 and more arguments method
        return (a+b+c+d)/4;
    }

    // It is better to avoid triadic or polyadic methods in real life coding

    void test() {

    }

    void test2(int a, int b) {

    }
}
