package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarApp09 {
    public static void main(String[] args) {

        //Class/objek date sudah tidak direkomendasikan untuk digunakan
        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2010);//set untuk men-set tgl
        calendar.add(Calendar.YEAR, -10);//add untuk melakukan operasi penjumlahan pada tgl
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        //untuk mencetak hasil
        Date result = calendar.getTime();
        System.out.println(result);

    }
}

/*

Catatan date & Calendar class
# Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class Date & Calendar yang bisa kita gunakan sebagai representasi tanggal
# Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yang baru menggunakan Java Date Time API, namun itu akan kita bahas di course terpisah
# Sekarang kita akan fokus menggunakan class Date dan Calendar

*Hubungan Date dan Calendar
# Class Date adalah class representasi tanggal sampai presisi milisecond
# Namun di class Date sudah banyak method-method yang di deprecated, sehingga untuk memanipulasi date tanggal, kita sekarang harus melakukan kombinasi antara class Date dan Calendar
# Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Date.html
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Calendar.html
*/

