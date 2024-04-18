package Polimorfismo_Java;

public class Principal {
    public static void main(String[] args) {

        //Instanciar Objetos
        Vehiculo []misVehiculos = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("Ab112", "Nissan", "Nova");
        misVehiculos[1] = new VehiculoTurismo("Bf65", "Toyota", "Nuevo", 4);
        misVehiculos[2] = new VehiculoDeportivo("A543", "Ford", "A12d", 200);
        misVehiculos[3] = new VehiculoFurgoneta("A543", "Tesla", "Solaris", 100);

        for (Vehiculo carro: misVehiculos){
            System.out.println(carro.mostrarDatos());
            System.out.println();
        }
    }
}
