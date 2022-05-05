package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1,2

        int[] massif = new int[]{1, 2, 3};
        for (int i = 0; i < massif.length - 1; i++) {
            System.out.print(massif[i] + ",");
        }
        System.out.println(massif[massif.length - 1]);
        System.out.println();
        double[] massifOne = new double[]{1.57, 7.654, 9.986};
        for (int v = 0; v < massifOne.length - 1; v++) {
            System.out.print(massifOne [v] + ",");
        }
        System.out.println(massifOne[massifOne.length - 1]);
        System.out.println();

        int[] massifProizvol = new int[]{2, 6, 15, 23, 46};
        for (int n = 0; n < massifProizvol.length - 1; n++) {
            System.out.print(massifProizvol[n] + ",");
        }
        System.out.println(massifProizvol[massifProizvol.length - 1]);
        System.out.println();
        // Задание 3

        int[] i = {1, 2, 3};
        System.out.println("Элементы в обратном порялдке!");
        for (int i1 = i.length - 1; i1 >= 0; i1--) {
            if (i1 == i.length - 0)
                System.out.println(i[i1]);
            else
                System.out.print(i[i1] + " ");
        }

        int[] a = {2, 6, 15, 23, 46};
        System.out.println();
        for (int a2 = a.length - 1; a2 >= 0; a2--) {
            if (a2 == a.length - 0)
                System.out.println(a[a2]);
            else
                System.out.print(a[a2] + " ");
        }
        System.out.println();
        // Задача 4

        int[] y = new int[] {1, 2, 3};
        for (int g = 0; g < y.length; g++) {
            if (y[g] % 2 != 0) {
                y[g] = y[g] + 1;
            } else if (y[g] % 2 == 0) {
            }
            System.out.print(y[g] + ",");

            }
        }

        }


