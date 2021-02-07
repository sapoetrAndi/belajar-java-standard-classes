package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp17 {
    public static void main(String[] args) {

        int[] numbers = {
                1,3,4,1,423,52,1233,0,3,3,2,32,67,7,5
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //binarySearch() harus di sorting dulu sebelum di panggil
        System.out.println(Arrays.binarySearch(numbers,  7));
        System.out.println(Arrays.binarySearch(numbers,  0));
        System.out.println(Arrays.binarySearch(numbers,  100));//jika data tidak ada maka akan return angka negatif

        int[] result = Arrays.copyOf(numbers, 5);//menyalin isi array sebanyak 5 data
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
/*
Catatan Arrays Class
# Arrays class adalah class yang berisikan static method yang bisa kita gunakan untuk memanipulasi data array, seperti pencarian dan pengurutan
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html
*/
