import java.util.Scanner;

public class UcapanTerimaKasih_23 {
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static  String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static String UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything");
        return nama;
    }
    public static void main(String[] args) {
        String nama = UcapanTerimakasih();
        String ucapan = "Terimakasih "+nama+" Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}
