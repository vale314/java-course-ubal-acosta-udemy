//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var cadena1 = new String("Hola");
        var cadena2 = new String();
        System.out.println(cadena1);

        //recupera el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("0: " + primerCaracter);


        //Comparacion de cadenas
        var cadena3 = "Java";
        var cadena4 = "Java";
        var cadena5 = new String("Java"); // no apunta a cadena3 ni cadena4 crea un nuevo valor en stack

        ///Cuando las cadenas son iguales en Java ultiza un mecanismo que ambas var apuntas a la misma
        ///Memoria

        /*Compara si ambas variables apuntan a la misma direcion de memoria del heap*/
        System.out.println(cadena3 == cadena4);

        /// Comparar si ambas cadenas tienen el mismo valor ( compara los caracteres)
        System.out.println(cadena3.equals(cadena4));

        ///Metodo de cadenas
        var longitud = cadena1.length();
        System.out.println(longitud);

        ///Remplazar caracteres
        var nuevaCadena = cadena1.replace('H', 'J');
        /// Creara una nueva cadena en el heap con el cambio y se da la dir de memoria
        System.out.println(nuevaCadena);

        ///Convertir a mayusculas
        var nuevaCadena2 = cadena1.toUpperCase();
        System.out.println(nuevaCadena2);

        ///Convertir a minusculas
        System.out.println(cadena1.toLowerCase());

        /// Eliminar espacios al inicio y al final
        System.out.println(cadena1.trim());


        ///Obtener sub-cadena
        cadena1 = "Hola Mundo";
        System.out.println(cadena1);
        var subCadena1 = cadena1.substring(0, 4);
        //el primer indice si se incluye pero el ultimo indice no se incluye
        System.out.println(subCadena1);


        ///Busqueda de sub-cadenas
        /// IndexOf - Devuelve el primer indice de la primera aparacion de la suv-cadena

        var indice1 = cadena1.indexOf("Hola");
        System.out.println(indice1);

        /// Last IndexOf - Devuelve el ultimo indice de la aparicion de la sub-caddea

        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println(indice2);

        ///subcadena no ecnontrada -1


        /// Reemplzar sub-cadenas
        var cadena6 = "Hola Mundo";
        System.out.println(cadena6);

        var cadena7 = cadena6.replace("Mundo", "A Todos");
        System.out.println(cadena7);


        ///Concatenacion de cadenas
        var cadena8 = "Hola Mundo";
        var cadena9 = "Como Estan";
        var cadena10 = cadena8 + " " + cadena9;
        System.out.println(cadena10);

        var cadena11 = cadena8.concat(" ").concat(cadena9);
        System.out.println(cadena11);

            //Todo genera nuevas cadenas y se guardan por separado

            /// StringBuilder

            /// Constructor de cadenas no crea varias instancias porque es mutable

            var constructorCadena = new StringBuilder();
            constructorCadena.append("Hola Mundo");
            constructorCadena.append(" ");
            constructorCadena.append("Como Estan");

            System.out.println(constructorCadena);

            ///StringBuffer

            /// Realiza lo mismo que StringBuilder pero es mas seguro cuando trabajamos con varios hilos

            var constructorCadena2 = new StringBuffer();
            constructorCadena2.append("Hola Mundo").append(" ").append("Como Estan");

            System.out.println(constructorCadena2);

            ///Join
            var resultado = String.join(" ", cadena8, cadena9);
            System.out.println(resultado);

            /// Caracteres especiales
            /// \n -> salto de liena
            /// \t -> tabulacion
            /// \' -> comilla simple
            var cadena12 = "Hola\n Mundo";
            System.out.println(cadena12);


        }
    }
