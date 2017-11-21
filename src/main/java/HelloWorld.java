public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello world!");

        Fibonacci fibonacciNumbers = new Fibonacci();
        fibonacciNumbers.printFibonacciNumbers(12);

        Person person1 = new Person(12, "Kolya");
        Person person2 = new Person(18, "David");
        Person person3 = new Person(12, "Kolya");

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.hashCode());


        try {
            int a = 100 / 0;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}