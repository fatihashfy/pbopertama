import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            int pil, pil2, pil3, i, j;
            int b, k;
            int[][] x = new int[100][100];
            int[][] y = new int[100][100];
            int[][] jumlah = new int[100][100];
            int[] data = new int[100];
            int n, jum = 0, rata = 0;

            System.out.println("==PROGRAM PERHITUNGAN MATRIKS DAN DATA ==");
            System.out.println("|1. Perhitungan Matriks\t\t\t|");
            System.out.println("|2. Perhitungan Data\t\t\t|");
            System.out.println("=========================================");
            System.out.print("Pilih Program (1/2): ");
            pil = input.nextInt();
            System.out.println();

            switch (pil) {
                case 1:
                    System.out.println("==Operasi yang Tersedia==");
                    System.out.println("|1. Penjumlahan\t\t|");
                    System.out.println("|2. Pengurangan\t\t|");
                    System.out.println("=========================");
                    System.out.print("Pilih Operasi (1/2): ");
                    pil2 = input.nextInt();

                    System.out.print("Input jumlah baris (1-100): ");
                    b = input.nextInt();
                    System.out.print("Input jumlah kolom (1-100): ");
                    k = input.nextInt();
                    System.out.println();

                    System.out.println("Input elemen matriks pertama: ");
                    for (i = 0; i < b; i++) {
                        for (j = 0; j < k; j++) {
                            System.out.print("Masukkan elemen X[" + (i + 1) + "][" + (j + 1) + "]: ");
                            x[i][j] = input.nextInt();
                        }
                    }
                    System.out.println();

                    System.out.println("Input elemen matriks ke-2: ");
                    for (i = 0; i < b; i++) {
                        for (j = 0; j < k; j++) {
                            System.out.print("Masukkan elemen Y[" + (i + 1) + "][" + (j + 1) + "]: ");
                            y[i][j] = input.nextInt();
                        }
                    }

                    if (pil2 == 1) {
                        for (i = 0; i < b; i++) {
                            for (j = 0; j < k; j++) {
                                jumlah[i][j] = x[i][j] + y[i][j];
                            }
                        }

                        System.out.println("\nHasil Penjumlahan dua matriks adalah: ");
                        for (i = 0; i < b; i++) {
                            for (j = 0; j < k; j++) {
                                System.out.print(jumlah[i][j] + "  ");
                                if (j == k - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (pil2 == 2) {
                        for (i = 0; i < b; i++) {
                            for (j = 0; j < k; j++) {
                                jumlah[i][j] = x[i][j] - y[i][j];
                            }
                        }

                        System.out.println("\nHasil Pengurangan dua matriks adalah: ");
                        for (i = 0; i < b; i++) {
                            for (j = 0; j < k; j++) {
                                System.out.print(jumlah[i][j] + "  ");
                                if (j == k - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else {
                        System.out.println("Operasi yang dipilih tidak tersedia");
                    }
                    break;

                case 2:
                    System.out.println("==Operasi yang Tersedia==");
                    System.out.println("|1. Rata-Rata Data\t|");
                    System.out.println("|2. Nilai Min & Max Data|");
                    System.out.println("=========================");
                    System.out.print("Pilih Operasi (1/2): ");
                    pil3 = input.nextInt();

                    System.out.print("Input jumlah data yang akan dihitung (0-100): ");
                    n = input.nextInt();
                    System.out.println("Input " + n + " data:");

                    for (i = 0; i < n; i++) {
                        System.out.print("Data ke-" + (i + 1) + ": ");
                        data[i] = input.nextInt();
                    }

                    int max = data[0];
                    int min = data[0];

                    if (pil3 == 1) {
                        for (i = 0; i < n; i++) {
                            jum += data[i];
                        }
                        rata = jum / n;

                        System.out.println();
                        System.out.println("Nilai Total = " + jum);
                        System.out.println("Nilai Rata-rata = " + rata);
                    } else if (pil3 == 2) {
                        for (i = 1; i < n; i++) {
                            if (data[i] > max) {
                                max = data[i];
                            }
                            if (data[i] < min) {
                                min = data[i];
                            }
                        }
                        System.out.println("Nilai maksimum: " + max);
                        System.out.println("Nilai minimum: " + min);
                    }
                    break;
            }
            System.out.print("Ingin mengulang menu lain (y/n)? ");
            ulang = input.next().charAt(0);
        } while (ulang != 'n');

        System.out.println("Terima kasih");
    }
}
