package EnvioDePaquete;
/*Ejercicio 8: Una empresa de envio de paquetes tiene varias sucursales
 * en todoe el pais. Cada sucursal esta definida por su numero de sucursal,
 * dirección, y ciudad. Para calcular el precio que cuesta enviar cada paquete,
 * las sucursales tienen en cuenta el precio del paquete y la prioridad, sabiendo
 * que se cobra un dolar por kilo, 10 dolares mas si la prioridad es alta y 20 si
 * express. Cada paquete enviado tendra un numero de referencia y el DNI de la persona
 * que lo envia.
 */

public class Sucursal {

    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    //Metodos
    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    //GET
    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String mostrarDatosSucursal() {
        return "Numero Sucursal: " + numeroSucursal + "\n" + "Direccion: " + direccion + "\n" + "Ciudad: " + ciudad;
    }

    public float calcularPrecio(Paquete t) {//Instacioamos un objeto para llamar a los atributos del Paquete
        //Este se encuentra en la clase Paquete
        float precio;
        precio = t.getPeso();
        if(t.getPrioridad() == 1){
            precio += 10;
        }
        if(t.getPrioridad() == 2){
            precio += 20;
        }


        return precio;
    }


}
