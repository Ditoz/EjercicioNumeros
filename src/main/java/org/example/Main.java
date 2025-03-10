package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int m20 = 0, m50 = 0, m100 = 0, m200 = 0, m500 = 0;
        boolean ciclo = true;

        while (ciclo) {
            mostrarMenu();
            int optDenomina = teclado.nextInt(); //teclado

            switch (optDenomina) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    mostrarSub();
                    while (true) {
                        int options = teclado.nextInt();

                        switch (options) {
                            case 1: 
                                if (optDenomina == 1) m20++;
                                else if (optDenomina == 2) m50++;
                                else if (optDenomina == 3) m100++;
                                else if (optDenomina == 4) m200++;
                                else if (optDenomina == 5) m500++;
                                System.out.println("Se agrego moneda");
                                break;

                            case 2:
                                System.out.println("Cantidad de monedas  20: " + m20);
                                System.out.println("Cantidad de monedas  50: " + m50);
                                System.out.println("Cantidad de monedas  100: " + m100);
                                System.out.println("Cantidad de monedas  200: " + m200);
                                System.out.println("Cantidad de monedas  500: " + m500);
                                break;

                            case 3: 
                                int totalAhorrado = (m20 * 20) + (m50 * 50) + (m100 * 100) +
                                        (m200 * 200) + (m500 * 500);
                                System.out.println("total ahorrado : " + totalAhorrado);
                                break;

                            case 4: 
                                m20 = 0;
                                m50 = 0;
                                m100 = 0;
                                m200 = 0;
                                m500 = 0;
                                System.out.println("La alcancia se ha vaciado");
                                break;

                            case 5:
                                System.out.println("Regresando al menu principal");
                                break;

                            default:
                                System.out.println("Opcion no valida, intente de nuevo.");
                        }

                        if (options == 5) {
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
        teclado.close();
    }

    public static void mostrarMenu() {
        System.out.println("Selecciona la denominacion de moneda que desea agregar");
        System.out.println("1.20");
        System.out.println("2.50");
        System.out.println("3.100");
        System.out.println("4.200");
        System.out.println("5.500");
    }

    public static void mostrarSub() {
        System.out.println("Selecciona una accion");
        System.out.println("1.Agregar moneda");
        System.out.println("2.Contar monedas");
        System.out.println("3.Calcular total ahorrado");
        System.out.println("4.Vaciar contenido");
        System.out.println("5.Regresar al menu");
    }
}
