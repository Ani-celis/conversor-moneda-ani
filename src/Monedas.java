public record Monedas(String base_code,
                       String target_code,
                       double conversion_rate

) {
}
//# Conversor de Monedas
//
//Este es un conversor de monedas en Java que consulta tasas de cambio a través de una API externa. El programa permite a los usuarios seleccionar diferentes conversiones entre monedas, ingresar una cantidad a convertir y ver el resultado con el formato adecuado.
//
//## Funcionalidad
//
//El programa ofrece las siguientes conversiones entre monedas:
//
//        1. **Dólar (USD) -> Peso Argentino (ARS)**
//        2. **Peso Argentino (ARS) -> Dólar (USD)**
//        3. **Dólar (USD) -> Peso Chileno (CLP)**
//        4. **Peso Chileno (CLP) -> Dólar (USD)**
//        5. **Dólar (USD) -> Peso Colombiano (COP)**
//        6. **Peso Colombiano (COP) -> Dólar (USD)**
//
//Los resultados se muestran con formato adecuado (separadores de miles y dos decimales) para mayor claridad.
//
//        ## Estructura del Proyecto
//
//El proyecto está compuesto por varias clases que interactúan entre sí para realizar las conversiones de manera eficiente:
//
//        ### 1. **Clase `Principal`**
//        - **Función principal**: Es el punto de entrada del programa, donde se muestra un menú con las opciones de conversión disponibles y permite al usuario seleccionar la conversión deseada.
//   - **Interacción con el usuario**: Utiliza un bucle `while` para mostrar el menú y un `switch` para realizar la conversión según la opción elegida.
//        - **Llamada a la conversión**: La clase se encarga de llamar a la clase `ConvertirMoneda` para realizar la conversión seleccionada.
//
//### 2. **Clase `ConvertirMoneda`**
//        - **Función principal**: Contiene métodos que realizan las conversiones entre dos monedas.
//   - **Método `convertir`**: Recibe las monedas base y objetivo, consulta la tasa de conversión a través de la clase `ConsultarMoneda` y convierte la cantidad introducida por el usuario.
//        - **Formato de la salida**: La cantidad convertida se muestra con un formato adecuado (separadores de miles y dos decimales).
//        - **Método `convertirOtraMoneda`**: Permite ingresar las monedas base y objetivo manualmente.
//
//        ### 3. **Clase `ConsultarMoneda`**
//        - **Función principal**: Realiza solicitudes HTTP a una API externa para obtener la tasa de conversión entre dos monedas.
//        - **Método `buscarMoneda`**: Consulta la API externa y devuelve un objeto `Monedas` que contiene la tasa de conversión.
//        - **Uso de la API**: Utiliza la API `exchangerate-api.com` para obtener las tasas de cambio y la biblioteca `Gson` para parsear la respuesta JSON.
//
//### 4. **Clase `Monedas`**
//        - **Función principal**: Representa una tasa de conversión entre dos monedas.
//        - **Campos**:
//        - `base_code`: Código de la moneda base (ej. 'USD').
//        - `target_code`: Código de la moneda objetivo (ej. 'ARS').
//        - `conversion_rate`: Tasa de conversión entre las dos monedas (ej. 350.5).
//        - **Características**: La clase es inmutable, utilizando el concepto de `record` de Java, lo que genera automáticamente métodos como el constructor, getters, `toString()`, `equals()`, y `hashCode()`.
//
//        ## Requisitos
//
//Para ejecutar este proyecto necesitas tener instalado Java 11 o superior. Además, es necesario contar con una conexión a Internet para consultar las tasas de conversión a través de la API externa.
//
//        ## Cómo ejecutar el proyecto
//
//1. Clona este repositorio en tu máquina local.
//2. Abre una terminal y navega a la carpeta del proyecto.
//        3. Ejecuta el siguiente comando para compilar y ejecutar el proyecto:
//
//        ```bash
//javac Principal.java ConvertirMoneda.java ConsultarMoneda.java Monedas.java
//java Principal
