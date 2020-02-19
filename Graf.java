
import java.util.Scanner;
import java.security.SecureRandom;

public class Graf
{
    public static void main(String[] args)

    {
        //muestra el inicio de programa
        
        Person1 persona1 = new Person1();
        Person1 persona2 = new Person1();
        Person1 persona3 = new Person1();


        // crea un objeto Scanner para obtener la entrada de la ventana de comando.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribir el nombre del usuario 1");
        double esMayorDeEdad = entrada.nextInt();
        System.out.printf("%el nombre %.2f del usuario", esMayorDeEdad);

    }
 
}

public class Person1 {


    private String name;
    private String sexo;
    private int edad;
    private double peso;
    private double altura;
    private String DNI;


    // Contructor 1
    public void person1(final String name, final String sexo, final double altura, final double peso, final int edad, final String DNI)
     {
        this.name = name;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.DNI = DNI;

    }

    // contructor 2

    // set y get

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSexo(final String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public void setEdad(final int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setPeso(final double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(final double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setDNI(final String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

   // metodos para determinar el peso de una persona

   public void CalcularIMC(final double ingPeso)
   {
       final double inp = (peso/Math.sqrt(altura));

       if(inp <20)
          System.out.printf("-1");

       else if( inp > 20 && inp < 25)
          System.out.printf("0");

       else
           System.out.printf("1");

   }
   //metodo predicado

   public boolean esMayorDeEdad()
   {
       boolean esMayorDeEdad;

       // determinar si la persona es mayor de edad
      
       if(getEdad()>18)
       esMayorDeEdad = true;

       else
        esMayorDeEdad = false;
       
   }

   public void comproSexo()
   {
       if(getSexo() =="M")

       System.out.print(sexo);

       else 
        System.out.print("H");
   }

   // Metodo para generar numero aleatorio
   public void generaDNI()
   {

    final SecureRandom numerosAleatorios = new SecureRandom();
    final int[] frecuencia = new int[2];

    for( int tiro = 1; tiro <= 60000000; tiro++)
       ++frecuencia[1 + numerosAleatorios.nextInt(1)];
    
    System.out.printf("%s%10s%n","Nombre","DNI");   
    
    // Imprime el valor de cada elemento del arreglo
    for( int cards= 1; cards < frecuencia.length;cards++)
       System.out.printf("%4d%10d%n",cards,frecuencia[cards]); 
   }

}