import java.util.Scanner;

public class MainTemplate {
    public static void main(String[] args) {
        AutomovilTemplate auto = new AutomovilTemplate();

        Scanner scanner = new Scanner(System.in);
        char opcion;

        String mensajeOpciones = "Realizar acción: " +
                "e) Encender, a) Apagar, c) Acelerar, f) frenar, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'e':
                    auto.realizarAccion(new EncendidoTemplate());
                    break;
                case 'a':
                    auto.realizarAccion(new ApagadoTemplate());
                    break;
                case 'f':
                    auto.realizarAccion(new FrenadoTemplate());
                    break;
                case 'c':
                    auto.realizarAccion(new AceleradoTemplate());
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
