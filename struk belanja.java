import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        
        // Data Member
        int total_belanja = 0;

        // membuat scanner menerima input dari keyboard
        Scanner scan = new Scanner(System.in);

        // mengambil input dari kaeboard    
        System.out.print("Masukkan total belanja : ");
        total_belanja = scan.nextInt();
        // cek total belanja
        if (total_belanja > 50000) {
            System.out.println("Anda Mendapatkan Mouse");  
        } else {
             System.out.println("Belanja anda kurang dari RP. 50000");
    }
        
            System.out.println("Terima kasih sudah belanja di toko kami"); 
    }
}
