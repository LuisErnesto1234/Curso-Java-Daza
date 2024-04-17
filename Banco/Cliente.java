package Banco;
/*Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un banco para lo cual
 * tendremos 2 clases (Cliente y Cuenta). Considerar que un cliente se carateriza, por su nombre,
 * apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas.
 * Ademas cada cuenta se carateriza por un numero de cuenta y un saldo.*/
public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    private Cuenta [] cuentas;//Un cliente puede tener muchas cuentas

    //Constructor
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public double consultarSaldo(int n){
        return  cuentas[n].getSaldo();
    }
    public void ingresarDinero(int n, double cantidad){
        cuentas[n].ingresarSaldo(cantidad);
    }

    public void retirarDinero(int n, double cantidad){
        cuentas[n].retirarSaldo(cantidad);
    }

}
