package Sobre_Carga_Miembros;

public class Persona extends Animal{
    @Override
    public void Comer(){
        System.out.println("Estoy comiendo sentado en una silla");
    }

}
