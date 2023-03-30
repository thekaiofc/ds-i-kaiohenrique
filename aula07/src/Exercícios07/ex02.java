package Exercícios07;

public class ex02 {

    public static void main(String[] args) {
        int par = 0;
        int impar = 0;
        int i = 0;

        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println("Este número é par: " + i);
            } else {
                System.out.println("Este número é impar: " + i);
            }
            i++;

        }

        if (par > impar) {
            System.out.println("Os números pares são maiores.");
        } else {
            System.out.println("Os números pares são maiores.");
        }
    }
}
