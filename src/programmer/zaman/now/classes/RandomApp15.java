package programmer.zaman.now.classes;

import java.util.Random;

public class RandomApp15 {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(1000);//bound adalah batas angka random
            System.out.println(value);
        }
    }
}
/*Catatan Random Class
# Random class adalah class yang bisa kita gunakan untuk men-generate random number
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html*/
