package Exercícios07;

public class ex01 {

    public static void main(String[] args) {
        int par = 0;
        int impar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é par");
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " par");
                par = par + i;
            } else {
                System.out.println(i + " impar");
                impar = impar + i;
            }
        }
        System.out.println("OS valores pares são: "+ par);
        System.out.println( "Os valores impares são:"+impar);
        
        if(par > impar){
            System.out.println("Os números pares são maiores");
        } else {
            System.out.println("Os números impares são maiores");
    }

}
}