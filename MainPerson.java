
import java.util.Scanner;

public class MainPerson
{
    public static void main(String[] args)

    {
        
        Person persona1 = new Person();
        Person persona2 = new Person();
        Person persona3 = new Person();


        // crea un objeto Scanner para obtener la entrada de la ventana de comando.
        Scanner scan = new Scanner(System.in);

        System.out.println("PROGRAMA QUE CALCULA EL PESO DEL USUARIO SEGUN SUS DATOS");
        System.out.println();

        System.out.print("Ingresar el nombre del usuario 1: ");
        String name = scan.next();
        persona1.setName(name);

        System.out.print("Ingresar edad del usuario 1: ");
        int edad = scan.nextInt();
        persona1.setEdad(edad);

        System.out.print("Ingresar el sexo del Usuario 1: ");
        String sexo = scan.next();
        persona1.setSexo(sexo);

        System.out.print("Ingresar el peso del Usuario 1: ");
        double peso = scan.nextDouble();
        persona1.setPeso(peso);

        System.out.print("Ingresar la altura del Usuario 1: ");
        double altura = scan.nextInt();
        persona1.setAltura(altura);

        persona1.esMayorDeEdad(edad);
    

        System.out.println("\n");

        System.out.println(persona1);
        System.out.println("===============================");
        System.out.println("\n");



       // ingresar los datos del segundo objeto
        System.out.print("Ingresar el nombre del usuario 2: ");
        String name1 = scan.next();
        persona2.setName(name1);

        System.out.print("Ingresar edad del usuario 2: ");
        int edad1 = scan.nextInt();
        persona2.setEdad(edad1);

        System.out.print("Ingresar el sexo del Usuario 2: ");
        String sexo1 = scan.next();
        persona2.setSexo(sexo1);
        persona2.getDNI();
    

        System.out.println("\n");
        System.out.println(persona2);
        System.out.println("===============================");


        // ingresar los datos del tercer objeto
        System.out.print("Ingresar el nombre del usuario 3: ");
        String name2 = scan.next();
        persona3.setName(name2);

        System.out.print("Ingresar edad del usuario 3: ");
        int edad2 = scan.nextInt();
        persona3.setEdad(edad2);

        System.out.print("Ingresar el sexo del Usuario 3: ");
        String sexo2 = scan.next();
        persona3.setSexo(sexo2);

        persona3.CalcularIMC(peso);
        persona3.esMayorDeEdad(edad);

        System.out.println("\n");

        System.out.println(persona3);



 






    }
 
}