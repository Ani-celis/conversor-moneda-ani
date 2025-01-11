import java.util.Scanner; // leer la entrada del usuario desde la consola.
import java.text.DecimalFormat;//dar formato a los números y presentar los valores convertidos de manera más amigable

public class ConvertirMoneda {

    //El método convertir toma cuatro parámetros:
//monedaBase: La moneda de origen (por ejemplo, "USD").
//monedaTarget: La moneda de destino (por ejemplo, "ARS").
//consulta: Un objeto de la clase ConsultarMoneda, que se usa para obtener la tasa de conversión.
//lectura: Un objeto Scanner para leer la entrada del usuario.
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;
        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión para hoy\n" + monedaBase + " -> " + monedaTarget + " = " + monedas.conversion_rate());
        System.out.println("Ingrese la cantidad de " + monedaBase + ":");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();

        // Usar DecimalFormat para agregar puntos como separadores de miles y mantener 2 decimales
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println(cantidad + " " + monedaBase + " = " + df.format(cantidadConvertida) + " " + monedas.target_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
