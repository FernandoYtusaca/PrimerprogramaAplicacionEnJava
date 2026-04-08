public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanazamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "Plus";

        if (fechaDeLanazamiento >= 2022) {
            System.out.println("Pélicula más popular");
        }else {
            System.out.println("Pélicula retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("Plus")){
            System.out.println("Disfrute de su pélicula");
        }else {
            System.out.println("Pélicula no disponible para su plan actual");
        }
    }
}