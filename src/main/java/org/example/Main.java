package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int Cand_1 = 0, Internet_1 = 0, Radio_1 = 0, Television_1 = 0;
        int Cand_2 = 0, Internet_2 = 0, Radio_2 = 0, Television_2 = 0;
        int Cand_3 = 0, Internet_3 = 0, Radio_3 = 0, Television_3 = 0;

        // Variables para cálculos
        int totalVotos = 0;
        boolean devolver = true;

        while (devolver) {

            System.out.println("Urna de votos PREMIER ");
            System.out.println("Seleccione el candidato.  ");
            System.out.println("1. Cand1");
            System.out.println("2. Cand2");
            System.out.println("3. Cand3");
            int votos = teclado.nextInt();

            switch (votos) {

                case 1:
                    System.out.println("Primer Candidato");
                    System.out.println("1. Registrar voto");
                    System.out.println("2. Calcular el costo de campaña");
                    System.out.println("3. Vaciar todas las urnas");
                    System.out.println("4. Número total de votos");
                    System.out.println("5. Porcentaje de votos obtenidos");
                    System.out.println("6. Costo promedio de campaña");
                    System.out.println("7. Volver al menú");
                    int opcion_1 = teclado.nextInt();
                    switch (opcion_1) {
                        case 1:
                            Cand_1++;
                            totalVotos++;
                            System.out.println("Voto registrado para el Cand1");
                            System.out.println("Seleccione el medio de publicidad:");
                            System.out.println("1. Internet");
                            System.out.println("2. Radio");
                            System.out.println("3. Television");
                            int metodo = teclado.nextInt();
                            if (metodo == 1) {
                                Internet_1 += 700000;
                            } else if (metodo == 2) {
                                Radio_1 += 200000;
                            } else if (metodo == 3) {
                                Television_1 += 600000;
                            }
                            break;
                        case 2:
                            System.out.println("Costo de campaña del Candidato 1");
                            System.out.println("Internet: " + Internet_1);
                            System.out.println("Radio: " + Radio_1);
                            System.out.println("Televisión: " + Television_1);
                            break;
                        case 3:
                            System.out.println("Vaciar todas las urnas de la votacion.");
                            Cand_1 = 0;
                            Internet_1 = 0;
                            Radio_1 = 0;
                            Television_1 = 0;
                            System.out.println("Se borraron todos los votos.");
                            break;
                        case 4:
                            System.out.println("Número total de votos para el Candidato 1: " + Cand_1);
                            break;
                        case 5:
                            double porcentaje_1 = ((double) Cand_1 / totalVotos) * 100;
                            System.out.println("Porcentaje de votos para el Candidato 1: " + porcentaje_1 + "%");
                            break;
                        case 6:
                            int totalCosto_1 = Internet_1 + Radio_1 + Television_1;
                            int promedio_1 = totalCosto_1 / (Cand_1 == 0 ? 1 : Cand_1);
                            System.out.println("Costo promedio de campaña del Candidato 1: " + promedio_1);
                            break;
                        case 7:
                            // Volver al menú
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Segundo Candidato");
                    System.out.println("1. Registrar voto");
                    System.out.println("2. Calcular el costo de campaña");
                    System.out.println("3. Vaciar todas las urnas");
                    System.out.println("4. Número total de votos");
                    System.out.println("5. Porcentaje de votos obtenidos");
                    System.out.println("6. Costo promedio de campaña");
                    System.out.println("7. Volver al menú");
                    int opcion_2 = teclado.nextInt();
                    switch (opcion_2) {
                        case 1:
                            Cand_2++;
                            totalVotos++;
                            System.out.println("Voto registrado para el Candidato 2");
                            System.out.println("Seleccione el medio de publicidad:");
                            System.out.println("1. Internet");
                            System.out.println("2. Radio");
                            System.out.println("3. Televisión");
                            int metodo_2 = teclado.nextInt();
                            if (metodo_2 == 1) {
                                Internet_2 += 700000;
                            } else if (metodo_2 == 2) {
                                Radio_2 += 200000;
                            } else if (metodo_2 == 3) {
                                Television_2 += 600000;
                            }
                            break;
                        case 2:
                            System.out.println("Costo de campaña del Candidato 2");
                            System.out.println("Internet: " + Internet_2);
                            System.out.println("Radio: " + Radio_2);
                            System.out.println("Televisión: " + Television_2);
                            break;
                        case 3:
                            System.out.println("Vaciar todas las urnas de la votacion.");
                            Cand_2 = 0;
                            Internet_2 = 0;
                            Radio_2 = 0;
                            Television_2 = 0;
                            System.out.println("Se borraron todos los votos.");
                            break;
                        case 4:
                            System.out.println("Número total de votos para el Candidato 2: " + Cand_2);
                            break;
                        case 5:
                            double porcentaje_2 = ((double) Cand_2 / totalVotos) * 100;
                            System.out.println("Porcentaje de votos para el Candidato 2: " + porcentaje_2 + "%");
                            break;
                        case 6:
                            int totalCosto_2 = Internet_2 + Radio_2 + Television_2;
                            int promedio_2 = totalCosto_2 / (Cand_2 == 0 ? 1 : Cand_2);
                            System.out.println("Costo promedio de campaña del Candidato 2: " + promedio_2);
                            break;
                        case 7:
                            // Volver al menú
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Tercer Candidato");
                    System.out.println("1. Registrar voto");
                    System.out.println("2. Calcular el costo de campaña");
                    System.out.println("3. Vaciar todas las urnas");
                    System.out.println("4. Número total de votos");
                    System.out.println("5. Porcentaje de votos obtenidos");
                    System.out.println("6. Costo promedio de campaña");
                    System.out.println("7. Volver al menú");
                    int opcion_3 = teclado.nextInt();
                    switch (opcion_3) {
                        case 1:
                            Cand_3++;
                            totalVotos++;
                            System.out.println("Voto registrado para el Candidato 3");
                            System.out.println("Seleccione el medio de publicidad:");
                            System.out.println("1. Internet");
                            System.out.println("2. Radio");
                            System.out.println("3. Televisión");
                            int metodo_3 = teclado.nextInt();
                            if (metodo_3 == 1) {
                                Internet_3 += 700000;
                            } else if (metodo_3 == 2) {
                                Radio_3 += 200000;
                            } else if (metodo_3 == 3) {
                                Television_3 += 600000;
                            }
                            break;
                        case 2:
                            System.out.println("Costo de campaña del Candidato 3");
                            System.out.println("Internet: " + Internet_3);
                            System.out.println("Radio: " + Radio_3);
                            System.out.println("Televisión: " + Television_3);
                            break;
                        case 3:
                            System.out.println("Vaciar todas las urnas de la votacion.");
                            Cand_3 = 0;
                            Internet_3 = 0;
                            Radio_3 = 0;
                            Television_3 = 0;
                            System.out.println("Se borraron todos los votos.");
                            break;
                        case 4:
                            System.out.println("Numero total de votos para el Candidato 3: " + Cand_3);
                            break;
                        case 5:
                            double porcentaje_3 = ((double) Cand_3 / totalVotos) * 100;
                            System.out.println("Porcentaje de votos para el Cand3: " + porcentaje_3 + "");
                            break;
                        case 6:
                            int totalCosto_3 = Internet_3 + Radio_3 + Television_3;
                            int promedio_3 = totalCosto_3 / (Cand_3 == 0 ? 1 : Cand_3);
                            System.out.println("Costo promedio de campaña del Cand3: " + promedio_3);
                            break;
                        case 7:
                            // Volver al menú
                            break;
                    }
                    break;

                default:
                    System.out.println("opcion no valida");
            }
        }
    }
}