package programmer.zaman.now.classes;

public class RuntimeApp11 {
    public static void main(String[] args) {

        //cara membuat runtime
        Runtime runtime = Runtime.getRuntime();

        //method method dibawah menampilkan informasi memory yang ada di JVM bukan di laptop(hardware)
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());

    }
}
/*
Catatan Runtime Class
# Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan
# Informasi itu terdapat di class Runtime.
# Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses  object  tersebut menggunakan static method getRuntime() milik class Runtime
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/Runtime.html
*/
