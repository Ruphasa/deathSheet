import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    static void InputNilai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("berapa banyak siswa yang ada ? ");
        int banyak=sc.nextInt();
        System.out.println("ada berapa jumlah tugasnya");
        int hari=sc.nextInt();
        String siswa[]=new String[banyak];
        int nilai[][]=new int[banyak][hari];

        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Nama siswa : ");
            siswa[i]=sc.nextLine();
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai pada hari ke-"+(j+1)+" : ");
                nilai[i][j]=sc.nextInt();
            }
            sc.nextLine();
        }
        Tampil(siswa,nilai);
    }
    static void Tampil(String siswa[],int nilai[][]){
        for (int i = 0; i < siswa.length; i++) {
            System.out.println(siswa[i] + Arrays.toString(nilai[i]));
        }
        search(siswa,nilai);
    }
    static void search(String siswa[],int nilai[][]){
        int key=0, day=0, highScore=0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length; j++) {
                if (nilai[i][j]>highScore) {
                    highScore=nilai[i][j];
                    key=i;
                    day=j;
                }
            }
        }
        System.out.println("Hari yang memiliki nilai tertinggi adalah hari ke-"+(day+1));
        smart(siswa,key,day);
    }
    static void smart(String siswa[],int key,int day){
        System.out.println("siswa yang mendapatkan nilai tertinggi adalah : "+siswa[key]+"pada minggu ke-"+day);
    }
    public static void main(String[] args) {
        InputNilai();
    }
}
