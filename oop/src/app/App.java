package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(addTwoNumbers(15, 30));
        System.out.println(multiplyTwoNumbers(2, 4));
        Person harry = new Person();
        Person carson = new Person();
        harry.getAge();
        carson.getAge();
        carson.setAge(21);
        System.out.println("Harry's age is " + harry.getAge());
        System.out.println("Carson's age is " + carson.getAge());
    }

    public static void cool(){
        System.out.println("cool");
    }

    public static int addTwoNumbers(int x, int y){
        return x + y;
    }

    public static int multiplyTwoNumbers(int x, int y){
        return x * y;
    }
}