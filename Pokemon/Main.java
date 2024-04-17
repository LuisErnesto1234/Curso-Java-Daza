package Pokemon;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int buscarEntrenador(Entrenador []e, int n){
        int i = 0;
        int indice = 0;
        boolean encontrado = false;

        while (i < e.length && !encontrado){
            if(e[i].getIdEntrenador() == n){
                indice = i;
                encontrado = true;
            }
        }

        if(!encontrado){
            indice = -1;
        }

        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int idPokemon, idEntrenador, indiceEntrenador = 0, indicePokemon = 0;
        String nombrePokemon, nombreEntrenador;
        int vidaPokemon, resultadoEntrenador;
        int ataquePokemon;
        int defensaPokemon, op;
        Pokemon []pokemons = new Pokemon[100];
        Entrenador []entrenadores = new Entrenador[20];

        do {
            System.out.println("\t ...::::Menu::::...");
            System.out.println("1. Registrar Entrenador");
            System.out.println("2. Registrar Pokemon");
            System.out.println("3. Pelear");
            System.out.println("4. Ver pokemon");
            System.out.println("5. Ver entrenador");
            System.out.println("Salir");
            System.out.println("*********************");
            System.out.print("Ingrese su eleccion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el id del entrenador");
                    idEntrenador = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del entrenador: ");
                    nombreEntrenador = sc.nextLine();

                    entrenadores[indiceEntrenador] = new Entrenador(idEntrenador, nombreEntrenador);
                    System.out.println("Entrenador registrado!! 🎉🎉");
                    indiceEntrenador++;
                    break;
                case 2:
                    System.out.print("Ingrese el id del entrenador: ");
                    idEntrenador = sc.nextInt();
                    resultadoEntrenador = buscarEntrenador(entrenadores, idEntrenador);
                    if (resultadoEntrenador == -1) {
                        System.out.println("El entrenador no existe");
                    } else {
                        System.out.print("Ingrese el id del pokemon: ");
                        idPokemon = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el nombre del pokemon: ");
                        nombrePokemon = sc.nextLine();
                        System.out.print("Ingrese la vida del pokemon: ");
                        vidaPokemon = sc.nextInt();
                        System.out.print("Ingrese el ataque del pokemon: ");
                        ataquePokemon = sc.nextInt();
                        System.out.print("Ingrese la defensa del pokemon: ");
                        defensaPokemon = sc.nextInt();
                        Entrenador et = entrenadores[resultadoEntrenador];
                        pokemons[indicePokemon] = new Pokemon(idPokemon, nombrePokemon, vidaPokemon, ataquePokemon, defensaPokemon, et);
                        System.out.println("Pokemon registrado!! 🐔🐔");
                        indicePokemon++;
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el id de entrenador: ");
                    idEntrenador = sc.nextInt();
                    resultadoEntrenador = buscarEntrenador(entrenadores, idEntrenador);
                    if (resultadoEntrenador == -1) {
                        System.out.println("El entrenador no existe 😴😴");
                    }
                    else {
                        for (int i = 0; i < indicePokemon; i++) {
                            assert pokemons[i] != null;
                            if (pokemons[i].getIdEntrenador() == idEntrenador) {
                                System.out.println((i) + " " + pokemons[i].mostrarPokemon());
                            }
                        }

                        System.out.print("Elija su pokemon a luchar: ");
                        op = sc.nextInt();

                        if (op > indicePokemon || op < 0) {
                            System.out.println("Error dato ingresado incorrecto");
                            System.out.print("Elija su pokemon a luchar: ");
                            op = sc.nextInt();
                        } else {
                            System.out.println("Pokemon elegido: ");
                            System.out.println(pokemons[op].mostrarPokemon());
                            // Creamos una instancia de Random
                            int numeroAleatorio = random.nextInt(indicePokemon);
                            System.out.println("El pokemon oponente es: ");
                            System.out.println(pokemons[numeroAleatorio].mostrarPokemon());

                            //Hora de la batalla
                            int suerte = random.nextInt(7);
                            System.out.println("Recuerda si tu suerte es 6 tu eliges el daño de lo contrario es aleatorio 👻👻");
                            System.out.println("Suerte: " + suerte);
                            if (suerte != 6){
                                System.out.println("Ingrese el ataque que desea realizar: ");
                                ataquePokemon = sc.nextInt();
                                pokemons[numeroAleatorio].atacarPokemon(ataquePokemon);
                                pokemons[numeroAleatorio].mostrarPokemon();


                            }
                        }
                    }

                    break;
                case 4, 5, 6:
                    break;
                default:
                    System.out.println("Error dato ingresado incorrecto");
                    break;
            }


        }while (op != 6);

    }
}
