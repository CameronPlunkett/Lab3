import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
    float balance, APR, MPR, min_payment; // MPR = Monthly percentage rate
    Scanner sc = new Scanner(System.in);
    System.out.print("Amount owed: ");
    balance = sc.nextFloat();
    System.out.print("APR: ");
    APR = sc.nextFloat();
    MPR = APR / 12;
    System.out.println("Monthly percentage rate: " + MPR);
    APR = APR / 100;
    min_payment = (balance * APR) / 12;
    System.out.println("Minimum payment: " + min_payment);
  }
}