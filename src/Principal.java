import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in); //Es un objeto de la clase Scanner, que se usa para leer la entrada del usuario.
        ConsultarMoneda consulta = new ConsultarMoneda();//Se crea un objeto de la clase ConsultarMoneda, que  se encarga de manejar las consultas de la APIs de tasas de cambio

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("********************************\n" +
                    "Bienvenidos al conversor de monedas\n\n " +
                    "Ingresa la conversión que deseas realizar:\n\n" +
                    "1- Dólar ==> Peso Argentino\n" +
                    "2- Peso Argentino ==> Dólar\n" +
                    "3- Dólar ==> Peso Chileno\n" +
                    "4- Peso Chileno ==> Dólar\n" +
                    "5- Dólar ==> Peso Colombiano\n" +
                    "6- Peso Colombiano ==> Dólar\n" +
                    "7- Salir\n" +
                    "Elija una opción válida:"
            );
            opcion = lectura.nextInt(); //leer la opción seleccionada por el usuario.
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
        lectura.close();
    }
}
