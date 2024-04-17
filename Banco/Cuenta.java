package Banco;
/*Ejercicio 7: Hacer un porgrama sencillo para realizar gestiones en un banco para lo cual
 * tendremos 2 clases (Cliente y Cuenta). Considerar que un cliente se carateriza, por su nombre,
 * apellido y DNI. El cliente puede consultar saldo, asi como ingresar y retirar dinero de sus cuentas.
 * Ademas cada cuenta se carateriza por un numero de cuenta y un saldo.*/
public class Cuenta {
    //Atributos
    private int numeroCuenta;
    private double saldo;

    //Constructor
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarSaldo(double cantidad){
        saldo += cantidad;
    }

    public void retirarSaldo(double cantidad){
        saldo -= cantidad;
    }

}
