import java.util.Random;

public class Person {


   /* atributos */

    private String name;
    private String sexo;
    private int edad;
    private double peso;
    private double altura;
    private String DNI;
   


    // Contructor 1
    public void person(String name, String sexo, double altura,double peso, int edad, String DNI)
     {
        this.name = name;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.DNI = DNI;

    }

    // set y get

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

   // metodos para determinar el peso de una persona

   public void CalcularIMC(double peso)
   {
       peso = (this.peso/Math.sqrt(this.altura));

       if(peso <20)
          System.out.printf("-1");

       else if( peso > 20 && peso < 25)
          System.out.printf("0");

       else
           System.out.printf("1");

   }
   //metodo para determinar si la pesona es mayor de edad.

   public void esMayorDeEdad(int edad)
   {
      String esMayorDeEdad;

       // determinar si la persona es mayor de edad
      
       if(this.edad >18)
           esMayorDeEdad  = "Es Mayor de Edad";

       else
          esMayorDeEdad  = "Es Menor de Edad";

  
       
   }

   // metodo para comprobar si el sexo es correcto.

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
    int frecuencia;
    final Random numerosAleatorios = new Random();
    frecuencia =  numerosAleatorios.nextInt(600000000);
    System.out.printf("El DNI: " + frecuencia);

   }

   public String toString()
   {
    System.out.println("===================================");
       System.out.println("Mostrar Datos Generales del Usuario");
       System.out.println("===================================");
       System.out.println();
     

       return  "Nombre: " +  getName()+ "\n" +  "Edad: " +
                getEdad() + "\n"+ "Sexo: " + getSexo() + "\n" + 
                "Peso: "+ getPeso()+"\n"+
                "Altura: "+getAltura()+ "\n" +  "DNI: " + DNI;

                

     
                    
       
   }

}