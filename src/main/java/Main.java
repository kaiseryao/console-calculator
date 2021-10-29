public class Main {
    public static void main(String[] args) {
        Operators operator = new Operators();
        operator.readIn();
        operator.calculate();
        System.out.println( operator.toString() );
    }

}
