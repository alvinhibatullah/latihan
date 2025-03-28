import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        // Define the array
        int[] array = {5, 10, 15, 20, 25};
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user input
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int target = scanner.nextInt();
        
        // Check if the target exists in the array
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Nilai " + target + " ditemukan pada indeks: " + i);
                found = true;
                break;
            }
        }
        
        // If not found, show message
        if (!found) {
            System.out.println("Nilai " + target + " tidak ditemukan dalam array.");
        }

        // Ask for NIM input
        System.out.print("\nMasukkan NIM Anda: ");
        int nim = scanner.nextInt();
        
        // Check if the NIM is even
        if (nim % 2 == 0) {
            System.out.println("Untuk NIM Genap > Tampilkan nilai dalam array yang tidak habis dibagi dengan 0.");
            for (int i = 0; i < array.length; i++) {
                // Check if the value is not divisible by zero (we just check if the number isn't zero)
                if (array[i] != 0) {
                    System.out.println("Indeks: " + i + ", Nilai: " + array[i]);
                }
            }
        }

        scanner.close();
    }
}
