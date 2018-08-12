
public class megaByteConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5430987);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingBytes = kiloBytes % 1024;
        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}