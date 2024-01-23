 import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleFileNotFoundException {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama file: ");
            String fileName = scanner.nextLine();

            try {
                FileReader fileReader = new FileReader(fileName);
                System.out.println("File ditemukan!");
            } catch (FileNotFoundException e) {
                System.out.println("File tidak ditemukan: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
