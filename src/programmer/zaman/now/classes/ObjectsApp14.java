package programmer.zaman.now.classes;

import java.util.Objects;

public class ObjectsApp14 {

    public static class  Data{
        private String data;

        public Data(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;

            return data != null ? data.equals(data1.data) : data1.data == null;
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        execute(new Data("andi"));

    }

    public static void execute(Data data){

        //kita harus menggunakan pengecekan agar tidak terjadi NullPointerException
        /*if(data != null){
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }*/

        //dengan menggunakan class objects kita tidak perlu melakukan pengecekan
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}


/*
Catatan Objects Class
# Awas jangan tertukar, ini class Objects, bukan Object
# Objects adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk operasi object atau melakukan pengecekan sebelum operasi nya dilakukan
# https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Objects.html
*/
