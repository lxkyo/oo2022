import java.util.Scanner;

public class paarisPaaritu{

    public static void main(String args[]){
        System.out.println("Kas arv on paaris või paaritu?");

        Scanner input = new Scanner(System.in);
        int a;
        boolean vastus;

        System.out.println("Sisesta arv, et teada saada, kas see on paaris või paaritu: ");
        a = input.nextInt();

        kalkulaator calc = new kalkulaator();
        vastus = calc.paarisVoiPaaritu(a);
        System.out.println("Arv on " + (vastus? "paaris" : "paaritu"));
    }
}