import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter The Based Attack Speed: ");
       double EnterBAS = sc.nextDouble();
       System.out.print("Enter The Bonus Attack Speed %: ");
       double EnterBSAS = sc.nextInt();
       System.out.print("Enter The Level: ");
       int level = sc.nextInt();

       double batkspeed = EnterBSAS / 100;
       int lvl = level - 1;
       double ccatkspeed = lvl * batkspeed;
       double ccatkspeed2 = ccatkspeed + 1;
       double ccatkspeed3 = ccatkspeed2 * EnterBAS;
       int BSAS = (int) EnterBSAS;



       System.out.println("\nEnter the base attack speed: "+ EnterBAS);
       System.out.println("Enter the Bonus attack speed %: " + BSAS);
       System.out.println("Enter the Level: " + level);
       System.out.printf("The character's current attack speed is %.3f", ccatkspeed3);










    }
}