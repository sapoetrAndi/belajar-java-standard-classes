package programmer.zaman.now.classes;

import java.math.BigInteger;

public class BigNumberApp07 {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");

        //untuk melakukan operasi pada big number kita menggunakan method method yang tersedia seperti add() untuk tambah. karena big number adalah sebuah objek
        BigInteger c = a.add(b);

        System.out.println(c);

    }

/*Catatan Big Number Class
# Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas Long dan Double, di Java sudah disediakan class untuk handle data besar tersebut
# BigInteger adalah class untuk handle tipe data Integer, dan
# BigDecimal adalah class untuk handle tipe data floating point
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigInteger.html
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/math/BigDecimal.html*/

}