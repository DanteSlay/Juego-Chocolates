import java.util.ArrayList;

public class Juego {
    //ATRIBUTOS
    private final int FRESA = 3;
    private final int CHOCO_LIBRES = 0;
    private final int CHOCO_IA = 2;
    private final int CHOCO_USUARIO = 1;
    private final int MAX_CHOCO = 14;


    private  ArrayList<Integer> chocolates;
    private final Algoritmo algoritmo;
    private final Usuario usuario;


    //CONSTRUCTOR

    public Juego(Usuario usuario, Algoritmo algoritmo) {
        this.chocolates = new ArrayList<>();
        this.algoritmo = algoritmo;
        this.usuario = usuario;
    }

    //GETTER


    //SETTER


    //FUNCIONES
    public void intro(){
        while (true) {
            String sb = "Evita comerte la fresa " + Utilidades.emoji(3) +
                    "\n" + "Los chocolates que te comas tu estan representados con " + Utilidades.emoji(1) +
                    "\n" + ", los del algoritmo con " + Utilidades.emoji(2) +
                    "\n\nCuando sea tu turno, elige 1, 2 o 3 chocolates.\n" +
                    "Enter para empezar.";
            System.out.println(sb);
            String empezar = Utilidades.in.nextLine();
            if (empezar != null) {
                break;
            }
        }
    }

    public void primerTurno() {

        System.out.println("Turno del algoritmo...");
        algoritmo.unChocolate();
        chocolates.add(0, CHOCO_IA);
        System.out.println(algoritmo.numChocolates);

    }

    public void turnoUsuario() {
        System.out.println("\nTu turno:");
        usuario.pedirEleccion(MAX_CHOCO - chocolates.size());
        usuario.comerChocolates();
        for (int i = 0; i < usuario.numChocolates(); i++) {
            chocolates.add(CHOCO_USUARIO);
        }
    }

    public void turnoAlgoritmo(int posicion) throws InterruptedException {
        System.out.print("\nTurno del algoritmo");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".");
        Thread.sleep(300);
        System.out.print(".\n");
        Thread.sleep(1000);
        algoritmo.setNumChocolates(posicion - chocolates.size());
        for (int i = 0; i < algoritmo.numChocolates; i++) {
            chocolates.add(CHOCO_IA);
        }
        System.out.println(algoritmo.numChocolates());
        Thread.sleep(300);

    }

    public String imprimirChocolates() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> chocolatesPantalla = chocolatesPantalla();
        for (int i = 0; i < chocolatesPantalla.size(); i++) {
            if (i == 5 || i == 10) {
                sb.append("\n");
                sb.append(Utilidades.emoji(chocolatesPantalla.get(i))).append(" ");
            } else {
                sb.append(Utilidades.emoji(chocolatesPantalla.get(i))).append(" ");
            }
        }
        return sb.toString();
    }

    private ArrayList<Integer> chocolatesPantalla() {
        ArrayList<Integer> chocolatesPantalla = new ArrayList<>();
        chocolatesPantalla.addAll(chocolates);
        while (chocolatesPantalla.size() < MAX_CHOCO - 1) {
            chocolatesPantalla.add(CHOCO_LIBRES);
        }
        chocolatesPantalla.add(FRESA);

        return chocolatesPantalla;
    }



}

