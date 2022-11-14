import java.util.Random;
import java.util.Scanner;

public class pmb {

    int jumProdi = 3; // Informatika,Dkv,Komputer
    static int totalJumlahMahasiswaBaru = 1050;
    public static String[] Informatika = new String[500];
    public static String[] Dkv = new String[300];
    public static String[] Komputer = new String[250];

    public static void PrintInfoMahasiswaBaru(){
        int jumlahInformatika=0;
        int jumlahSisa = 0;
        for(int index=0;index<Informatika.length;index++){
            if(Informatika[index]  !=null){
                jumlahInformatika++;
            }
        }
        int jumlahDkv=0;
        for(int index=0;index< Dkv.length;index++){
            if(Dkv[index]  !=null){
                jumlahDkv++;
            }
        }
        int jumlahKomputer=0;
        for(int index=0;index< Dkv.length;index++){
            if(Dkv[index]  !=null){
                jumlahDkv++;
            }
        }
        jumlahSisa= totalJumlahMahasiswaBaru - jumlahInformatika - jumlahDkv - jumlahKomputer;
        System.out.println("jumlah maba Informatika" + jumlahInformatika + " | jumlah Maba Dkv: " + jumlahDkv + " | jumlah Maba Komputer: INFORT" + jumlahKomputer);
        System.out.println("jumlah prodi : "+ totalJumlahMahasiswaBaru + " | jumlah sisa: " + jumlahSisa);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String mahasiswabaru){
        int indexNow = 0;
        for (int index=0; index<myArray.length;index++){
            if(myArray[index]  !=null){
                indexNow = index+1;
            }
        }

        if(indexNow < myArray.length){
            myArray[indexNow] = mahasiswabaru;
        }
    }
    public static void simpanMahasiswa(int angkaRandom, String mahasiswabaru){
        switch (angkaRandom){
            case 1:
                CheckIndexArray(Informatika,mahasiswabaru);
                System.out.println("Amda mendapatkan NIK + TI22" + angkaRandom);
                PrintInfoMahasiswaBaru();
                break;
            case 2:
                CheckIndexArray(Dkv,mahasiswabaru);
                System.out.println("Anda mendapatkan NIK + DK22" + angkaRandom);
                PrintInfoMahasiswaBaru();
                break;
            case 3:
                CheckIndexArray(Komputer,mahasiswabaru);
                System.out.println("Anda mendapatkan NIK + TK22" + angkaRandom);
                PrintInfoMahasiswaBaru();
                break;

        }
    }
    public static void inputMahasiswabaru(){
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.println("mahasiswa baru = ");
            String namaMahasiswabaru = inputData.nextLine();
            if(namaMahasiswabaru.isEmpty()){
                System.out.println("mahasiswa baru wajib diisi ");
                inputMahasiswabaru();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanMahasiswa(JenisRandom,namaMahasiswabaru);
            }
        }
    }
    public static void main(String[] args) {
        inputMahasiswabaru();
        //
    }
}