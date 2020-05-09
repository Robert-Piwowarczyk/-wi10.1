import java.util.InputMismatchException;
import java.util.Scanner;

public class detailsPerson {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        int strLength = "Jan".length();
        try {
        firstName = sc.nextLine();
            System.out.println("Wczytano imię: ");
        }catch (NameUndefinedException ex){
            System.err.println("Podane imię jest nullem lub ma 1 albo 2 litery," +
                    "podaj imię jeszcze raz: ");
            ex.printStackTrace();
        }
        System.out.println("Podałeś imię: "+ firstName);

        System.out.println("Podaj nazwisko:");
        try {
            lastName = sc.nextLine();
            System.out.println("Wczytano nazwisko: ");
        }catch (NameUndefinedException ex){
            System.err.println("Podane imię jest nullem lub ma 1 albo 2 litery," +
                    "podaj imię jeszcze raz: ");
            ex.printStackTrace();
        }
        System.out.println("Podałeś nazwisko: "+ lastName);

        System.out.println("Podaj wiek:");
        int age = 1;
        try {
            age = sc.nextInt();
            System.out.println("Wczytano wiek: ");
        }catch (IncorrectAgeException ex){
            System.err.println("Podany wiek jest mniejszy od 1," +
                    "podaj wiek jeszcze raz: ");
            ex.printStackTrace();
        }
        System.out.println("Podałeś wiek: "+ firstName);
        sc.close();

        System.out.println("Podaj pesel:");
        int pesel = 1;
        try {
            pesel = sc.nextInt();
            System.out.println("Wczytano pesel: ");
        }catch (IncorrectAgeException ex){
            System.err.println("Podany numer pesel jest mniejszy od 1," +
                    "podaj numer pesel jeszcze raz: ");
            ex.printStackTrace();
        }
        System.out.println("Podałeś numer pesel: "+ firstName);
        sc.close();
    }
}
