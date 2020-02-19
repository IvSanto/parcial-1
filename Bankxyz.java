import java.util.Scanner;
import java.util.Date;
public class Bankxyz {
  public static void main(String[] args) {
    
    Cuenta obj1 = new Cuenta("Mantonio","DC700");
    Cuenta obj2 = new Cuenta("Maria","DT330");
    Date date = new Date();
    obj1.showMenu();
    obj2.showMenu();
  }
}

class Cuenta {
  int balance;
  int previousTrans;
  String custName;
  String custId;


  Cuenta(String cname, String cid) {
    custName = cname;
    custId = cid;
  }
  void deposit(int amount) {
    if (amount != 0) {
      balance = balance + amount;
    }
  }
  void credit(int amount) {
    if (amount != 0) {
      balance = balance - amount;
      previousTrans = -amount;
    }
  }
  void getpreviousTrans() {
    if (previousTrans > 0) {
      System.out.println("Deposited: " + previousTrans);
    }
    else if (previousTrans < 0) {
      System.out.println("Withdrawn: " + Math.abs(previousTrans));
    }
    else {
      System.out.println("No transactions accured");
    }
  }
  void showMenu() {
    int user_option = 1;
    Scanner s = new Scanner(System.in);
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println("Welcome " + custName);
    System.out.println("Your ID " + custId);
    System.out.println("\n");
    System.out.println("1. ver Estado de cuenta");
    System.out.println("2. Solicitar un credito");
    System.out.println("3. Cambiar contraseña");
    System.out.println("4. Salir");
    System.out.println();
    
    do {
      System.out.println("===================");
      System.out.println("Ingresar Opciones: ");
      System.out.println("===================");
      user_option = s.nextInt();
      System.out.println();
      
      switch(user_option) {
        case 1:
          System.out.println("Estado de la cuenta");
          System.out.println("Balance = " + balance);
          System.out.println("________________");
          System.out.println("\n");
          break;
        case 2:
          System.out.println("----------------------------");
          System.out.println("Ingresar la cantidad a Solicitar");
          System.out.println("----------------------------");
          int amount = s.nextInt();
          deposit(amount);
          System.out.println("Monto adeudado de su cuneta ");
          System.out.println("\n");
          break;
        case 3:
          System.out.println("------------------------------");
          System.out.println("gresar la nueva contraseña");
          System.out.println("------------------------------");
          int amount2 = s.nextInt();
          credit(amount2);
          System.out.println("su contraseña a si actualizada");
          System.out.println("\n");
          break;
       
        case 4:
          System.out.println("------------");
          System.out.println("Gracias");
          System.out.println(date.toString());
          System.out.println("------------");
          break;
        default:
          System.out.println("Opsion invalida");
          break;
      }
    }
    while (user_option != 4);
    System.out.println("Gracias por utilizar este servicio");
  }
}