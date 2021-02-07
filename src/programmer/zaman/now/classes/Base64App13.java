package programmer.zaman.now.classes;

import java.util.Base64;

public class Base64App13 {
    public static void main(String[] args) {

        String original = "andi saputra lubis";

        //cara meng-encoding string
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        //cara men-decode string
        byte[] bytes = Base64.getDecoder().decode(encoded);//karena hasil decode adalah array byte jadi kita harus konversi ke string
        //konversi hasil decoding ke string
        String result = new String(bytes);

        System.out.println(result);

        for (var value: bytes
             ) {
            System.out.println(value);
        }


    }
}


/*
Catatan Base64 Class
# Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64
# Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa digunakan untuk mengubah binary data ke text yang aman
# Aman disini bukan dari sisi security, tapi aman dari kesalahan parsing
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Base64.html
# https://www.ietf.org/rfc/rfc4648.txt -> standard Base64
*/
