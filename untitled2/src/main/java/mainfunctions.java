import java.util.Scanner;
public class mainfunctions {


    //Method for multiply the value
    public static void multiply(int result,int first,int second){
        result = (first * second);
        System.out.println("Das Ergebnis lautet:" + result);
    }

    //Method for add the value
    public static void add(int result,int first,int second){
        result = (first + second);
        System.out.println("Das Ergebnis lautet:" + result);
    }

    //Method for subtract the value
    public static void subtract(int result,int first,int second){
        result = (first - second);
        System.out.println("Das Ergebnis lautet:" + result);
    }

    //Method for divide the value
    public static void divide(int result,int first,int second){
        result = (first / second);
        System.out.println("Das Ergebnis lautet:" + result);
    }
    
     
    public static void main(String[] args) {
        Scanner rechner = new Scanner(System.in);
        int first;
        int second;
        int result = 0;
        String checker;

        System.out.println("Bitte tragen Sie den ersten Wert ein: ");
        first =  rechner.nextInt();
        System.out.println("Bitte tragen Sie den zweiten Wert ein: ");
        second =  rechner.nextInt();
        System.out.println("Bitte tragen Sie die Rechenart ein: ");
        checker = rechner.next();

        if (checker.equals("+")) {
            add(result,first,second);
        }
        else if (checker.equals("-")) {
            subtract(result,first,second);
        }
        else if (checker.equals("/")) {
            divide(result,first,second);
        }
        else if (checker.equals("*")) {
            multiply(result,first,second);
        }
        else {
            System.out.println("Fehler bei der Eingabe! Bitte versuchen Sie es erneut.");
        }
    }
}
