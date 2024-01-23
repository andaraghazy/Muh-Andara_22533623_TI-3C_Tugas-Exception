import java.util.Scanner;

public class ExampleNullPointerException  {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan string: ");
            String str = scanner.nextLine();

            if (str != null) {
                int length = str.length();
                System.out.println("Panjang string: " + length);
            } else {
                System.out.println("Kesalahan: String tidak boleh null.");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
