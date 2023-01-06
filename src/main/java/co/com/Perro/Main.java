package co.com.Perro;

public class Main {

    public static void main(String[] args) {

        /* Ejemplo  clases  y objetos */


        /* colocamos el nombre del objeto
         */

        Perro Lassie = new Perro();
        /* De esta manera es que instanciamos un objeto ,instanciar no es mas que el  proceso de crear un
         nuevo objeto , al objeto creado lo podemos conocer como instancia*/

        /* Estos son los  atributos Nombre , Raza , edad */

        Lassie.Nombre = "Sacha";
        Lassie.Raza = " Golden ";
        Lassie.edad = 7;

         /* una vez  instanciado  podemos trabajar con  sus atributos y metodos  ahora
         imprimieros  los atributos , nombre , raza , edad  */
        System.out.println(" El nombre es : " +Lassie.Nombre  );
        System.out.println("La Raza es:  " +Lassie.Raza );
        System.out.println("La Edad es: "+Lassie.edad );
    }
}