import java.util.Scanner;

public class Percobaan623 {
    static void Luas(int p,int l){
        int luas=p*l;
        System.out.println("Luas persegi panjang adalah "+luas);
    }
    static void Volume(int p,int l, int t){
        int vol = p*l*t;
        System.out.println("Volume balok adalah "+vol);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        int p=sc.nextInt();
        System.out.print("Masukkan lebar : ");
        int l=sc.nextInt();
        System.out.print("Masukkan tinggi : ");
        int t =sc.nextInt();
        Luas(p, l);
        Volume(p, l, t);
    }
}
