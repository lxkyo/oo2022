import java.util.Scanner;

public class kalkulaator {
    
    public static void main(String args[]){
        System.out.println("Kalkulaatoriprogramm");

        Scanner input = new Scanner(System.in);
        int a,b;
        int vastus;
        float jagamiseVastus;

        System.out.println("Sisesta arvud liitmiseks: ");
        a = input.nextInt();
        b = input.nextInt();

        vastus = liitmine(a, b);
        System.out.println("Liitmise vastus: " + vastus);


        System.out.println("Sisesta arvud lahutamiseks: ");
        a = input.nextInt();
        b = input.nextInt();

        vastus = lahutamine(a, b);
        System.out.println("Lahutuse vastus: " + vastus);


        System.out.println("Sisesta arvud korrutamiseks: ");
        a = input.nextInt();
        b = input.nextInt();

        vastus = korrutamine(a, b);
        System.out.println("Korrutise vastus: " + vastus);


        System.out.println("Sisesta arvud jagamiseks: ");
        a = input.nextInt();
        b = input.nextInt();

        jagamiseVastus = jagamine(a, b);
        System.out.println("Jagatise vastus: " + jagamiseVastus);
    }

    public static int liitmine(int a, int b) {
        int c = a + b;
        return c;
    } 

    public static int lahutamine(int a, int b){
        int c = a - b;
        return c;
    }

    public static int korrutamine(int a, int b){
        int c = a * b;
        return c;
    }

    public static float jagamine(int a, int b){
        float c = a / b;
        return c;
    }

    
    public boolean paarisVoiPaaritu(int a){
        boolean c = a % 2 == 0;
        return c;
    }
}