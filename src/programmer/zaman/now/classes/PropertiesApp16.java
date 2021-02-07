package programmer.zaman.now.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp16 {
    public static void main(String[] args) {


        try{
            Properties properties = new Properties();

            properties.load(new FileInputStream("application.properties"));//untuk load file

            String host = properties.getProperty("database.host");//untuk mengambil data dari file yang kita load
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        }catch (FileNotFoundException e){
            System.out.println("File not Found!");
        }catch (IOException e){
            System.out.println("Gagal load data dari file!");
        }

        try{
            //cara menulisakan konigurasi di file
            Properties properties = new Properties();
            properties.put("name.first", "andi");
            properties.put("name.middle",  "saputra");
            properties.put("name.last", "lubis");

            //menyimpan / memasukan properties ke dalama file
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi nama");
        }catch (FileNotFoundException e) {
            System.out.println("File not Found!");
        } catch (IOException exception) {
            System.out.println("Error menyimpan properties");
        }
    }
}

/*

Catatan Properties Class
# Properties Class adalah class yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html


Properties File
# simpan properties file di root folder dari project
# Kebanyakan aplikasi Java akan menyimpan konfigurasi file dalam bentuk properties file
# Properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=)
# Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita

*/

