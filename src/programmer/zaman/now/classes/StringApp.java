package programmer.zaman.now.classes;

public class StringApp {
    public static void main(String[] args) {

        //berikut adalah beberapa method dari class String yang ada di java
        String name = "Andi Saputra";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();


        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.startsWith("Andi"));
        System.out.println(name.endsWith("putra"));
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());// true karena spasi tidak di anggap
        System.out.println(" ".isEmpty());// false karena ada spasi didalam string
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

        for (var value : chars) {
            System.out.println(value);
        }
    }
}
