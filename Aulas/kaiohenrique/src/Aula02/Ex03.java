/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Ex03 {

        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);

            System.out.println("Digite o valor de A: ");
            Double a = x.nextDouble();
            System.out.println("Digite o valor de B: ");
            Double b = x.nextDouble();
            Double divisao = a / b;
            System.out.println("O valor da divisão é: " + divisao);

        }
    }

