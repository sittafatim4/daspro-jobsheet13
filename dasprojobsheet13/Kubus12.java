import java.util.Scanner;
public class Kubus12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Masukkan sisi : ");
        int sisi = sc12.nextInt();
        int volume = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + volume);
    }
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }    
}