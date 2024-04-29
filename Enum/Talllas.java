import java.util.Scanner;

public class Talllas {

    /*enum Talla{MINI,GRANDE,MEDIA,CHICA}*/
    enum Talla{

        MINI("S"), MEDIANO("M"), GRANDE("L");

        private String abreviatura;

        Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura(){
            return abreviatura;
        }

    }

    public static void main(String[] args) {
        System.out.println("Escribe una talla: ");
        for (Talla t : Talla.values()) {
            System.out.println("Talla: " + t.getAbreviatura());
        }

        Scanner sc = new Scanner(System.in);

        String ingreso_talla = sc.next().toUpperCase();

        Talla t = Enum.valueOf(Talla.class, ingreso_talla);

        System.out.println("La talla es: " + t);
        System.out.println("La abreviatura es: " + t.getAbreviatura());


    }
}
