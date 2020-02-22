import java.util.Scanner;
import java.util.Date;
public class MainBanco {

  public static void main(String[] args) {
    
    Cuenta persona1 = new Cuenta("Mantonio","DC700");
    Cuenta persona2 = new Cuenta("Maria","DT330");
    Date date = new Date();
    persona1.showMenu();
    persona2.showMenu();
  }
}