import java.util.Scanner;

public class Menu {
    public static void iniciarPrograma() {
        boolean a;
        do {
            menuPrincipal();
            a = tipodeBusqueda(ingresarRespuesta());
        } while (!a);

    }
    public static void menuPrincipal() {

    }
    public static String ingresarRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static boolean tipodeBusqueda(String ingresoDatos) {
        boolean a = false;

        switch (ingresoDatos) {
            case "1" -> {

                    System.out.println();
                    a = true;

            }
            case "2" -> {

                    System.out.println("");
                    a = true;

                break;
            }
            case "3" -> {
                break;
            }
            case "4" -> {
                System.out.println("");
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
