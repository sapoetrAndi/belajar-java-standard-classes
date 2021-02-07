package programmer.zaman.now.classes;

public class StringBuilderApp02 {
    public static void main(String[] args) {
        /*jika kita melakukan manipulasi string yang banyak kita tidak direkomndasikan menggunakan
        object String. maka dari itu kita direkomendasikan menggunakan StringBuilder*/

        StringBuilder builder = new StringBuilder();
        builder.append("andi");
        builder.append(" ");
        builder.append("saputra");
        builder.append(" ");
        builder.append("lubis");

        //dengan menggunakan StringBuilder kita akan menghemat memori
        String name = builder.toString();
        System.out.println(name);
    }
}
/*
CATATAN

*Immutable String
# String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string, sebenarnya yang dilakukan di Java adalah membuat String baru.
# Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String,  karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder

*StringBuffer vs StringBuilder
# Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
# Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe
# Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan StringBuffer, namun jika tidak butuh paralel, cukup gunakan StringBuilder
# Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuffer.html
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuilder.html*/


