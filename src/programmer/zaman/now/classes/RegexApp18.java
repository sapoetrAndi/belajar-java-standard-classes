package programmer.zaman.now.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp18 {
    public static void main(String[] args) {

        String name = "andi saputra lubis programmer zaman now";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
/*

Catatan Regular Expression
# Regular Expression atau disingkat regex adalah cara untuk melakukan pola pencarian
# Biasanya dilakukan untuk pencarian dalam data String
# Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di aplikasi word
# Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya, misal kita ingin mencari semua kata yang mengandung diawali huruf a dan diakhiri huruf a, dan lain-lain

* Regex Package
# Java sudah menyediakan package java.util.regex yang berisikan utilitas untuk melakukan proses regular expression
# Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu Pattern class dan Matcher class
# Pattern class adalah representasi hasil kompilasi dari pola regular expression yang kita buat
# Matcher class adalah engine untuk melakukan pencarian dari pattern yang sudah kita buat

* Aturan Regular Expression
# Aturan regular expression sangat kaya, sehingga kemungkinan tidak bisa dibahas dalam satu materi
# Kita bisa lihat detail aturan-aturannya di halaman javadoc class Pattern
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/regex/Pattern.html
*/



