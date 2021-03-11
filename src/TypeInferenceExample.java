



public class TypeInferenceExample {
    public static void main(String[] args) {

        //StringLengthLambda myLambda = (String s) -> s.length();
        StringLengthLambda myLambda = s -> s.length();
        myLambda.getLength("Hello Lambda");

        System.out.println(  myLambda.getLength("Hello Lambda"));

    }



    interface StringLengthLambda{
        int getLength(String s);
    }

}
