import java.util.Scanner;

public class Evaluaciones {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;
        while (nota != -1) {
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();

            if (nota != -1) { //Al insertar "-1" culmina el proceso y devuelve el promedio de las puntuaciones
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}
