package ClasesYObjetos;

public class Tablero {

    private int tamanio; //Declara un atributo tamanio de tipo entero, que representará el tamaño del tablero.
    private int [][]tablero; //Declara un atributo tablero que es una matriz de enteros, que representará el tablero.
    private int x; //Declara un atributo x de tipo entero, que representará la posición en la fila del objeto en el tablero.
    private int y; //Declara un atributo y de tipo entero, que representará la posición en la columna del objeto en el tablero.

    //Constructor

    public Tablero(int tamanio) {//Define el constructor de la clase Tablero. Recibe como parámetro el tamaño del tablero.
        this.tamanio = tamanio;
        this.tablero = new int[tamanio][tamanio];// Inicializa la matriz tablero con el tamaño especificado por tamanio.
        this.x = tamanio / 2;//Inicializa la coordenada x del objeto en la posición central del tablero.
        this.y = tamanio / 2;//Inicializa la coordenada y del objeto en la posición central del tablero.
    }

    public void inicializarObjeto(){
       tablero[x][y] = 1;//Asigna el valor 1 en la posición (x, y) del tablero para indicar la presencia del objeto.
    }

    public void mostrarTablero(){
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mostrarCoordenadas() {
        System.out.println("Coordenadas del objeto: X = " + x + ", Y = " + y);
    }

    public void moverArriba(){
        if (x > 0){//Verifica si el objeto no está en el borde superior del tablero.
            tablero[x][y] = 0;//Borra la posición anterior del objeto en el tablero, estableciendo el valor en 0.
            x--;/*Disminuye la coordenada x para mover el objeto hacia arriba en una fila en el tablero.*/
            tablero[x][y] = 1;// Actualizar la nueva posición del objeto estableciendo el valor en 1.
        }
        else {
            System.out.println("No se puede mover mas arriba!");
        }
    }

    public void moverAbajo(){
        /*La condición x < tamano - 1 asegura que el objeto no se mueva más hacia abajo si ya está
        en la última fila del tablero. Si x representa la fila y tamano es el tamaño del tablero,
        entonces tamano - 1 es el índice de la última fila del tablero. Si x es igual a tamano - 1,
        significa que el objeto ya está en la última fila del tablero y no puede moverse más hacia
        abajo sin salirse del tablero.*/
        if (x < tamanio - 1){
            tablero[x][y] = 0;// Borrar la posición anterior del objeto
            x++;
            tablero[x][y] = 1;// Actualizar la nueva posición del objeto
        }
        else {
            System.out.println("¡No se puede mover más ABAJO!");
        }
    }

    public void moverIzquierda() {
        if (y > 0) {
            tablero[x][y] = 0; // Borrar la posición anterior del objeto
            y--;
            tablero[x][y] = 1; // Actualizar la nueva posición del objeto
        } else {
            System.out.println("¡No se puede mover más a la IZQUIERDA!");
        }
    }

    public void moverDerecha() {
        if (y < tamanio - 1) {
            tablero[x][y] = 0; // Borrar la posición anterior del objeto
            y++;
            tablero[x][y] = 1; // Actualizar la nueva posición del objeto
        } else {
            System.out.println("¡No se puede mover más a la DERECHA!");
        }

    }
}
