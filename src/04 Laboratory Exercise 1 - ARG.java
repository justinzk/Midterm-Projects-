import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String  EmployeeName = sc.nextLine();
        System.out.print("Enter Your Gross Pay: ");
        Double GrossPay = sc.nextDouble();

        Double WHTax = GrossPay * .15;
        Double SSContri = GrossPay * .0363;
        Double Medicare = GrossPay * .0125;
        Double Pagibig = 100.0;
        Double NetPay = GrossPay -WHTax - SSContri - Medicare - Pagibig;

        System.out.printf("Employee Name: %20s %n",EmployeeName);
        System.out.printf("Gross pay: %25s %n",GrossPay);
        System.out.println("________________________________________");
        System.out.printf("Deductions  %25s %n","Amounts");
        System.out.printf("Withholding Tax: %20s %n",WHTax);
        System.out.printf("SSS Contribution: %19s %n",SSContri);
        System.out.printf("Medicare: %27s %n",Medicare);
        System.out.printf("Pagibig Contribution: %15s %n",Pagibig);
        System.out.println("________________________________________");
        System.out.printf("Net Pay: %28s",NetPay);








    }
}
