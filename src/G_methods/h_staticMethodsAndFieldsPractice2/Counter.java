package G_methods.h_staticMethodsAndFieldsPractice2;

public class Counter {

    public static int count;
    public int anotherCount;

    public Counter() {
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {

        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        // all  = 4 for count because it is static and shared across all the instances
        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        count++;
        // all = 5 for count now
        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        // all = 1 for anotherCount because every new instance reference is isolated and NOT shared
        System.out.println(one.anotherCount);
        System.out.println(two.anotherCount);
        System.out.println(three.anotherCount);
        System.out.println(four.anotherCount);

        one.anotherCount = 2;
        two.anotherCount = 3;
        three.anotherCount = 4;
        four.anotherCount = 5;

        // instance references already created so Constructor NOT invoked
        System.out.println(one.anotherCount);  // 2
        System.out.println(two.anotherCount);  // 3
        System.out.println(three.anotherCount); // 4
        System.out.println(four.anotherCount); // 5
    }
}
