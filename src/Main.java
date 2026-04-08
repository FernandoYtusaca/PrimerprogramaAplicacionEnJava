public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanazamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0)/3;
        System.out.println(media);

        String sipnosis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanazamiento;
        System.out.println(sipnosis);

        int clasificacion = (int) (media / 2);
        System.out.println("La clasificación es: "+ clasificacion);

    }
}