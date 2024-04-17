package EnvioDePaquete;
/*Ejercicio 8: Una empresa de envio de paquetes tiene varias sucursales
 * en todoe el pais. Cada sucursal esta definida por su numero de sucursal,
 * dirección, y ciudad. Para calcular el precio que cuesta enviar cada paquete,
 * las sucursales tienen en cuenta el precio del paquete y la prioridad, sabiendo
 * que se cobra un dolar por kilo, 10 dolares mas si la prioridad es alta y 20 si
 * express. Cada paquete enviado tendra un numero de referencia y el DNI de la persona
 * que lo envia.
 */
public class Paquete {
    private int prioridad;
    private int numeroPaquete;
    private String dni;
    private float peso;

    //Metodos

    public Paquete(int numeroPaquete, String dni, int prioridad, float peso) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.prioridad = prioridad;
        this.peso = peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public float getPeso() {
        return peso;
    }

    public String mostrarDatos(){
        return "El numero de paquete es: " + numeroPaquete + "\nEl DNI es: " + dni + "\nLa prioridad es: " + prioridad + "\nEl peso es: " + peso;
    }
}
