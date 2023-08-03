import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
1-Crear las variables correspondientes para leer tu nombre,
apellido y edad e imprimirlos por consola en una oración.
* */
    /*    String name;
        byte age;

        System.out.print("Ingrese su nombre: ");
        name = scanner.next();
        System.out.print("Ingrese su edad: ");
        age = scanner.nextByte();
        System.out.println(name + " Tiene " + age +" Años");
        */

/*
* 2-Realizar un pequeño programa que permita ingresar 3 números
e imprimir por consola cuál es el mayor.
* */


   /*int number1, number2, number3 ;
        System.out.print("Ingrese el primer número: ");
        number1 = scanner.nextInt();
        System.out.print("Ingrese  el segundo número: ");
        number2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        number3 = scanner.nextInt();
        System.out.println( higherNumber(number1,number2,number3) + " Es el número más grande");
*/


        /*
        * 3-Realizar un pequeño programa que permita el ingreso de un
número e imprimir por consola su paridad.
        * */
/*
int paridad ;
        System.out.print("Ingrese un número: ");
        paridad = scanner.nextInt();
          if(paridad%2 == 0){
              System.out.println(paridad + " Es un número par.");
          }else{
              System.out.println(paridad + " Es un número impar.");
          }
          */

/*
*4-Crear el código correspondiente que permita ingresar 2 cadenas
 de caracteres e imprima por consola si son iguales o no.
*
* */
/*String cadena1, cadena2;

        System.out.println("Ingrese la cadena 1: ");
        cadena1= scanner.next();
        System.out.println("Ingrese la cadena 2: ");
        cadena2= scanner.next();

        if (cadena1.equals(cadena2)){
            System.out.println("Cadenas son iguales.");
        }else{
            System.out.println("Las cadenas no son iguales.");
        }*/


/*
*5-Realizar un pequeño programa que permita el ingreso de
números, almacenarlos en una colección hasta ingresar un 0.
* */

      /*  ArrayList coleccion = new ArrayList();
        int valor;
   boolean flag =  false ;
        do {

            if (!flag){
                System.out.println("Para salir del programa Ingrese el valor 0. ");
                System.out.print("Ingrese un valor : ");
                valor = scanner.nextInt();
                flag= true;

            }else{
                System.out.println("Para salir del programa Ingrese el valor 0. ");
                System.out.print("Ingrese otro valor : ");
                valor = scanner.nextInt();
            }

            if(valor!=0){
                coleccion.add(valor);
            }


        }while ( valor!=0);
        System.out.println(coleccion.toString());
*/

/*
* 6-Crear una función que imprima un mensaje de bienvenida en la
consola.
* */
    welcome();

/*
* 7-Crear una función que reciba un número entero y devuelva si es
par o impar en forma de texto.
* */

       /* int valor;
        System.out.print("Ingrese un valor: ");
        valor = scanner.nextInt();
        System.out.println(paridad(valor));*/

/*
* 8-Crear una función que reciba un número y devuelva si el mismo
es primo o no.
* */



      /*
      * 9-Crear una función que reciba una colección de números y
devuelva la suma de los números impares.
      * */

      /*  ArrayList coleccionNumeros = new ArrayList();
        coleccionNumeros.add(3);
        coleccionNumeros.add(1);
        coleccionNumeros.add(18);
        coleccionNumeros.add(17);
        coleccionNumeros.add(2);
        coleccionNumeros.add(5);
        coleccionNumeros.add(73);
        System.out.println(suma(coleccionNumeros));*/
/*int valor;
        System.out.print("Ingrese un numero: ");
        valor=scanner.nextInt();
        System.out.println(primo(valor));*/


        /*
        *10- Crear una función que reciba una colección de números e
imprima los números pares y la suma de los números primos.
        * */
     /*   ArrayList coleccionNumeros = new ArrayList();
        coleccionNumeros.add(3);
        coleccionNumeros.add(1);
        coleccionNumeros.add(18);
        coleccionNumeros.add(17);
        coleccionNumeros.add(2);
        coleccionNumeros.add(5);
        coleccionNumeros.add(73);
        System.out.println("La suma total de los numeros primos es: "+sumaPrimosImprimePares(coleccionNumeros) );
*/
/*
*11- Crear una función que imprima por consola un pequeño
menú con las opciones básicas de una calculadora agregando
la opción 0 para salir del mismo.
* */

/* menu();*/


        /*
        *12- Crear otra función que ocupe la del punto anterior para poder
crear una pequeña calculadora usando switch. Tener en cuenta
el caso de la división por 0.
        * */


        /*
        *13- Crear el algoritmo necesario para poder gestionar el ingreso
a un boliche. El mismo deberá contar con un pequeño menú con
las siguientes opciones:
● Ingreso de datos.
● Capacidad disponible.
● Dinero recaudado.
● Salir del sistema.
        * */


     Boliche boliche = new Boliche();
     menuBoliche(boliche);

    }

    public static void menuBoliche(Boliche boliche){
        byte opcion;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("***********************************************");
            System.out.println("******************BOLICHONGO******************");
            System.out.println("***********************************************");
            System.out.println("1) Ingreso de Datos.");
            System.out.println("2) Capacidad Disponible.");
            System.out.println("3) Dinero Recaudado.");
            System.out.println("0) Salir del Sistema.");
            System.out.print("Ingrese una Opcion: ");
            opcion=sc.nextByte();
            switch (opcion){
                case 1:
                        if(boliche.lugaresDisponibles()!=0 ){
                            cargarPersona(boliche,sc);

                        }else{
                            System.out.println("Entradas Agotadas.");
                        }

                    break;
                case 2:
                    System.out.print("La capacidad disponible es: " + boliche.lugaresDisponibles() + "\n");
                    break;
                case 3:
                    System.out.print("Dinero recaudado es: $" + boliche.getRecaudación()+ "\n");
                    break;

                case 0:
                    System.out.println("Fin del programa. Hasta la Próxima!!!");
                    break;
                default:
                    System.out.println("Usted a ingresado una opción incorrecta.");
                    break;
            }




        }while (opcion!= 0);
    }


public static  void cargarPersona(Boliche boliche, Scanner sc){
    int numero1, numero2;
    byte edad ;
    int dni;
    String pase;
    String nombre;

    System.out.print("Ingrese la edad: ");
    edad = sc.nextByte();
    if(edad > 21){
        System.out.print("Ingrese el nombre: ");
        nombre = sc.next();

        System.out.print("Ingrese el dni: ");
        dni = sc.nextInt();

        pase =menuPase();

        Persona persona = new Persona(nombre,dni,edad,pase);
        String entrada = menuEntada();
        float precioEntrada = boliche.getPrecioRealEntrada(entrada,pase);
        System.out.println("El costo de la entrada "+ entrada + " es de $" + precioEntrada );
        boliche.setRecaudación(boliche.getRecaudación()+ precioEntrada);
        boliche.cargarPersona(persona);
        System.out.println("Le damos la Bienvenida al Bolichongo...!!!!");
    }else{
        System.out.println("Tiene que ser mayor a 21 años, para ingresar. ");
    }
}

    public static String menuEntada(){
        byte opcion;
        Scanner sc = new Scanner(System.in);
        String  entrada ="Comun";
        System.out.println("***********************************************");
        System.out.println("******************  ENTRADA   ******************");
        System.out.println("***********************************************");
        System.out.println("1) VIP.");
        System.out.println("2) Comun.");
        System.out.print("Ingrese una Opcion: ");
        opcion=sc.nextByte();
        switch (opcion){
            case 1:
                entrada = "VIP";
                break;
            case 2:
                entrada ="Comun";
                break;
            default:

                break;
        }
        return entrada;

    }

    public static String menuPase(){
        byte opcion;
        Scanner sc = new Scanner(System.in);
        String  pase ="Sin Descuento";
            System.out.println("***********************************************");
            System.out.println("******************   PASE    ******************");
            System.out.println("***********************************************");
            System.out.println("1) VIP.");
            System.out.println("2) Descuento.");
            System.out.println("0) Sin Descuento.");
            System.out.print("Ingrese una Opcion: ");
            opcion=sc.nextByte();
            switch (opcion){
                case 1:
                      pase = "VIP";
                    break;
                case 2:
                    pase ="Descuento";
                      break;
               default:

                    break;
            }
   return pase;

    }



    public static void menu(){
 byte opcion;
 Scanner sc = new Scanner(System.in);
 int numero1, numero2;
        do{
            System.out.println("***********************************************");
            System.out.println("******************CALCULADORA******************");
            System.out.println("***********************************************");
            System.out.println("1) Sumar.");
            System.out.println("2) Restar.");
            System.out.println("3) Multiplicar.");
            System.out.println("4) Dividir.");
            System.out.println("0) Salir.");
            System.out.print("Ingrese una Opcion: ");
            opcion=sc.nextByte();
            switch (opcion){
                case 1:
                    System.out.print("Ingrese un numero a sumar: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese el otro numero a sumar: ");
                    numero2 = sc.nextInt();
                    System.out.print("La suma es: " + (numero1 + numero2) + "\n");

                    break;
                case 2:
                    System.out.print("Ingrese un numero a restar: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese el otro numero a restar: ");
                    numero2 = sc.nextInt();
                    System.out.print("La resta es: " + (numero1 - numero2) + "\n");
                    break;
                case 3:
                    System.out.print("Ingrese un numero a multiplicar: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese el otro numero a multiplicar: ");
                    numero2 = sc.nextInt();
                    System.out.print("La multiplicación es: " + (numero1 * numero2) + "\n");
                    break;
                case 4:
                    System.out.print("Ingrese un numero a dividir: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese el otro numero a dividir: ");
                    numero2 = sc.nextInt();
                    if(numero2!=0){
                        System.out.print("La division es: " + ((((float)(numero1))) / (((float)(numero2)))) + "\n");
                    }else{
                        System.out.println("No se pueden hacer divisiones por CERO");
                    }

                    break;
                case 0:
                    System.out.println("Fin del programa. Hasta la Próxima!!!");
                    break;
                default:
                    System.out.println("Usted a ingresado una opción incorrecta.");
                    break;
            }




        }while (opcion!= 0);
    }


   public static  int sumaPrimosImprimePares(ArrayList <Integer> coleccion){
      int sumaPrimos =0;
       for (int numero:coleccion
            ) {
           if(numero%2 == 0){
               System.out.println(numero);
           }
           if(Isprimo(numero)){
              sumaPrimos += numero;
           }

       }


        return sumaPrimos;
   }
    public static  String primo(int numero){

        for ( int i=1; i < numero ; i++){
            System.out.println(i);
            if(numero % i  == 0 && i != 1 ){
                return "El numero " + numero + " no es Primo.";
            }
        }

        return  "El numero " + numero + " es Primo.";
    }

    public static  boolean Isprimo(int numero){

        for ( int i=1; i < numero ; i++){
            if(numero % i  == 0 && i != 1 ){

                return false;
            }
        }

        return true;
    }
    public static  int suma(ArrayList <Integer> numeros){
        int total = 0;
        for (int numero:numeros) {
            if(numero%2 !=0){
                total+=numero;
            }
        }

        return total ;
    }


    public static String paridad(int valor){

        if( valor%2 == 0){
           return "El numero " + valor + " es un numero PAR.";
        }else{
            return  "El numero " + valor + " es un numero IMPAR.";
        }

    }



    public static int higherNumber(int number1, int number2, int number3){
        int higher;
        if(number1 > number2 && number1 > number3){
            higher = number1;
        }else{
            if(number2 > number1 && number2 > number3){
                higher = number2;
            }else{
                higher = number3;
            }
        }
        return higher;
    }


    public static  void  welcome(){
        System.out.println("Bienvenido al curso de JAVA... de MindHub.");
    }
}


