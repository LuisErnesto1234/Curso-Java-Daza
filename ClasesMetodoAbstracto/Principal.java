package ClasesMetodoAbstracto;

public class Principal {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHervivoro animalH = new AnimalHervivoro();

        planta.comer();
        animalH.comer();
        animalC.comer();
    }
}
