import java.util.Scanner;

public class Menu {
    Automovil auto;

    public Menu(Automovil auto) {
        this.auto = auto;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Realizar acción: " +
                "e) Encender, a) Apagar, c) Acelerar, f) frenar, t) estado, p) preguntar, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'e': auto.encender(); break;
                case 'a': auto.apagar(); break;
                case 'f': auto.frenar(); break;
                case 'c': auto.acelerar(); break;
                case 't': auto.estado(); break;
                case 's': System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}
