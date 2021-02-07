package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoiner03 {
    public static void main(String[] args) {
        //kita bisa merangkai string menggunakan class StringJoiner
        StringJoiner joiner = new StringJoiner(",", "[", "]");

        joiner.add("andi");
        joiner.add("saputra");
        joiner.add("lubis");

        String name = joiner.toString();
        System.out.println(name);
    }
}

/*CATATAN STRINGJOINER CLASS

# StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter
# StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya
# Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau misalnya
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringJoiner.html*/


