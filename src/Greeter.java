public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        //Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting myLambdaGreeting = () -> System.out.print("Hello World");

        Greeting myInnerClass = new Greeting() {

            public void perform() {
                System.out.print("Hello World");
            }
        };
           // myInnerClass.perform();
        greeter.greet(myLambdaGreeting);
        greeter.greet(myInnerClass);




    }
}