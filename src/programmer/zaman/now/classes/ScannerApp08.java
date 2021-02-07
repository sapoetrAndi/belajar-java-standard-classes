package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = input.nextLine();

        System.out.println("Hello "+name);


    }
}
/*
Catatan Scanner Class
# Scanner sebenarnya bagian dari Java IO (Input Output), dan ini akan dibahas di materi terpisah
# Namun sekarang kita akan bahas sekilas tentang class Scanner
# Class Scanner hadir sejak Java 5
# Class Scanner adalah class yang bisa digunakan untuk membaca input, entah dari file, console, dan lain-lain
# Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar membuat program Java menggunakan console / terminal
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html
*/
