import java.util.Scanner;

public class Ahorcado {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "Inteligencia".toLowerCase();
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabrasAdivinadas = false;


        //Arreglo
        char [] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraSecreta.length(); i++) {
            letrasAdivinadas[i] = '_';

        }

        while (!palabrasAdivinadas && intentos < intentosMaximos) {
            System.out.println("Palabras a adivinar: " + String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra por favor: ");
            char letra = Character.toLowerCase(sc.next().charAt(0));


            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto te quedan " + (intentosMaximos - intentos) + " intentos.");

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabrasAdivinadas = true;
                System.out.println("Felicidades, has adivinado la palabra secreta " + palabraSecreta);
            }
        }

        if (!palabrasAdivinadas) {
            System.out.println(" que lastima te has quedado sin intentos! GAME OVER.");

        }
        sc.close();
    }
}
