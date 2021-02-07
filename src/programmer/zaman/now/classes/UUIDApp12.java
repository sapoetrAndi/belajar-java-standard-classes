package programmer.zaman.now.classes;

import java.util.UUID;

public class UUIDApp12 {
    public static void main(String[] args) {

        //UUID adalah untuk generate random character yang tidak akan pernah sama

        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();//konversi UUID ke string

            System.out.println(key);
        }

    }
}

/*
Catatan UUID Class (Universally Unique Identifier)
# Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key misalnya
# Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.
# UUID adalah format standard untuk membuat unique value yang telah terjamin
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/UUID.html
# https://www.ietf.org/rfc/rfc4122.txt -> standard dari UUID
*/
