package calificaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class EjemploCalificaciones {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    String nombre = "";
    int [] calif = new int[5];

    public static void main(String[] args) {
        String capturaNombre = "";
        float promedioResult = 0;
        char califNota= ' ';
        Calificaciones pCalculoCalif = new Calificaciones();
        System.out.println("### CALIFICACIONES UNIVERSIDAD TECMILENIO ###/n");

        Scanner s = new Scanner(System.in);
        System.out.println("Nombre de Alumno: ");
        capturaNombre = s.next();

        pCalculoCalif.setNombre(capturaNombre);

        pCalculoCalif.setCalificaciones();
        promedioResult = pCalculoCalif.promedioCal();

        Calificaciones pCalculoNota = new Calificaciones();
        califNota = pCalculoNota.calificacion(promedioResult);
        System.out.print("Tu calificación es: " + califNota + "/n");
        System.out.print("################################# + /n");
        pCalculoCalif.imprimeCalificaciones(capturaNombre, promedioResult, califNota);





    }
}
