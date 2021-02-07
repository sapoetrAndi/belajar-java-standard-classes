package programmer.zaman.now.classes;

public class SystemApp10 {
    public static void main(String[] args) {

        System.out.println("Millisecond saat ini "+System.currentTimeMillis());
        System.out.println("Nanosecond saat ini "+System.nanoTime());

        //Untuk mencetak env
        System.out.println("mencetak environment Home "+System.getenv("HOME"));

        //exit code 0 jika program berhenti dengan baik dan 1 jika program berhenti karena ada masalah
        System.exit(1);

    }
}
