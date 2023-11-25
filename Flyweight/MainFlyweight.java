import java.util.Scanner;

public class MainFlyweight {
    public static void main(String[] args) {
        AutomovilFlyweight auto = new AutomovilFlyweight();

        Scanner scanner = new Scanner(System.in);
        char opcion;

        String mensajeOpciones = "Realizar acción: " +
                "e) Encender, a) Apagar, c) Acelerar, f) frenar, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'e':
                    auto.setState("Encendido");
                    auto.realizarAccion();
                    break;
                case 'a':
                    auto.setState("Apagado");
                    auto.realizarAccion();
                    break;
                case 'f':
                    auto.setState("Frenado");
                    auto.realizarAccion();
                    break;
                case 'c':
                    auto.setState("Acelerado");
                    auto.realizarAccion();
                    break;
                case 's':
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
