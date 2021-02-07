package programmer.zaman.now.classes;

public class NumberApp05 {
    public static void main(String[] args) {
        // method seperti longValue() dsb digunakan untuk mengkonversi tipe data number non-primitif (objek)

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();


        /** Konversi String Ke Number
        # Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number
        # parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif
        # valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
        # Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke number*/

        String angkaString = "10000";

        int angkaInt = Integer.parseInt(angkaString);
        System.out.println(angkaInt);
        Integer angkaIntObjek = Integer.valueOf(angkaString);
        System.out.println(angkaIntObjek);
    }
}


/*
Catatan Number Class

# Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
# Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
# Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Number.html

* Konversi String Ke Number
# Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number
# parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif
# valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
# Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke number

*/

