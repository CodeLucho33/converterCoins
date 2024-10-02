## Proyecto de Conversor de Monedas

### Descripción del Proyecto
Este proyecto es una aplicación de consola en Java que permite a los usuarios convertir valores entre diferentes pares de divisas utilizando la [API de tipo de cambio de Exchangerate-API](https://www.exchangerate-api.com/). La aplicación se comunica con la API para obtener el valor de conversión en tiempo real y muestra el resultado de la conversión en pantalla. Los usuarios pueden seleccionar el par de divisas deseado y proporcionar el valor que desean convertir. 

### Funcionalidades
- **Interfaz de Menú**: El programa presenta un menú con opciones para seleccionar el par de divisas que se desea convertir. Los pares soportados son:
  1. Dólar Estadounidense (USD) a Peso Argentino (ARS).
  2. Peso Argentino (ARS) a Dólar Estadounidense (USD).
  3. Dólar Estadounidense (USD) a Real Brasileño (BRL).
  4. Real Brasileño (BRL) a Dólar Estadounidense (USD).
  5. Dólar Estadounidense (USD) a Peso Colombiano (COP).
  6. Peso Colombiano (COP) a Dólar Estadounidense (USD).
  7. Salida del programa.
  
- **Solicitudes HTTP a la API**: Utiliza la clase `HttpClient` de Java para enviar solicitudes GET a la API de Exchangerate y obtiene el resultado en formato JSON.
  
- **Parámetros de Conversión**: Los usuarios pueden ingresar el monto deseado para realizar la conversión.

- **Procesamiento de Respuesta JSON**: La respuesta de la API se procesa usando `Gson` para extraer el valor de la conversión (`conversion_result`).

### Cómo ejecutar el proyecto
1. Clona el repositorio o descarga el archivo fuente.
2. Asegúrate de tener Java 11 o superior instalado en tu sistema.
3. Compila y ejecuta los archivos `Request.java` y `Main.java`:
    ```bash
    javac Main.java Request.java
    java Main
    ```
4. Sigue las instrucciones en pantalla para seleccionar la conversión y proporcionar el valor a convertir.

### Dependencias
- La biblioteca `Gson` de Google para el procesamiento de JSON. Si aún no la tienes, puedes agregarla manualmente al proyecto o usar un gestor de dependencias como Maven.

### Mejoras Futuras
1. **Agregar más pares de divisas** para aumentar la flexibilidad del conversor.
2. Implementar un **sistema de manejo de errores** para entradas no válidas.
3. **Interfaz gráfica** utilizando JavaFX para hacer la aplicación más amigable.
4. Opción para **mostrar las tasas de cambio actuales** para todos los pares de divisas soportados.

### Notas Adicionales
El proyecto utiliza la API de Exchangerate-API con una clave de API gratuita. Para ejecutar el programa, asegúrate de reemplazar `0a53b6b5cbc73e26f99db78d` en la URL con tu propia clave de API válida si el límite de consultas se alcanza.

