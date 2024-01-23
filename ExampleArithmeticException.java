import java.util.Scanner;

public class ExampleArithmeticException {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka pembilang: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Kesalahan: Masukkan angka yang valid.");
                System.out.print("Masukkan angka pembilang: ");
                scanner.next(); 
            }
            int numerator = scanner.nextInt();

            System.out.print("Masukkan angka penyebut: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Kesalahan: Masukkan angka yang valid.");
                System.out.print("Masukkan angka penyebut: ");
                scanner.next(); 
            }
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan aritmetika: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    private static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Pembagian oleh nol tidak diperbolehkan.");
        }
        return numerator / denominator;
    }
}
