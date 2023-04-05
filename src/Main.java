public class Main {
    public static void main(String[] args) throws InterruptedException {

        Usuario usuario = new Usuario();
        Algoritmo algoritmo = new Algoritmo();
        Juego juego = new Juego(usuario, algoritmo);

        juego.intro();
        juego.primerTurno();
        System.out.println(juego.imprimirChocolates());
        juego.turnoUsuario();
        System.out.println(juego.imprimirChocolates());
        juego.turnoAlgoritmo(5);
        System.out.println(juego.imprimirChocolates());
        juego.turnoUsuario();
        System.out.println(juego.imprimirChocolates());
        juego.turnoAlgoritmo(9);
        System.out.println(juego.imprimirChocolates());
        juego.turnoUsuario();
        System.out.println(juego.imprimirChocolates());
        juego.turnoAlgoritmo(13);
        System.out.println(juego.imprimirChocolates());
        juego.turnoUsuario();


        System.out.println("Has perdido");

    }



}