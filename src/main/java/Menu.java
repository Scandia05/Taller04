import java.util.Scanner;

public class Menu {
    public static void iniciarPrograma() {
        boolean a;
        do {
            menuPrincipal();
            a = seleccionarOpcion(ingresarRespuesta());
        } while (!a);

    }
    public static void menuPrincipal() {
        System.out.println("Hola, en este programa podrá ver todo lo relacionado a desastres gefísicos");
        System.out.println("Seleccione una opción");
        System.out.println("[1] Iniciar Programa");
        System.out.println("[2] Salir");

    }
    public static String ingresarRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static boolean seleccionarOpcion(String ingresoDatos) {
        boolean a = false;

        switch (ingresoDatos) {
            case "1" -> {
                DGeofisicos desastres = new DGeofisicos();
                    System.out.println("Ha iniciado el programa");
                System.out.println(desastres.getTipo());
                    a = true;

            }
            case "2" -> {
                System.out.println("Ha salido del programa");
                    a = true;

                break;
            }

            default -> {
                System.out.println("opción no válida/invalid option");
                a = false;
                break;
            }
        }
        return a;
    }

}
