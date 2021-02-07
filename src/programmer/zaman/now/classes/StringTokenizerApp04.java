package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp04 {
    public static void main(String[] args) {
        /*string tokenizer berfungsi untuk memotong string. bedanya dengan split adalah dia akan
        memotong kata perkata sesuai delimitier sedangkan split akan meload dulu semua stringnya
        baru dia akan memotong. jadi StringTokenizer lebih hemat menggunakan memori*/

        String name = "Andi Saputra Lubis";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        //tokenizer.hasMoreTokens() akan mengembalikan nilai true jika string selanjutnya masih ada
        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
/*
CATATAN STRINGTOKENIZER CLASS
# StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil
# Kita bisa memotong String dengan delimiter yang kita mau
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringTokenizer.html*/


