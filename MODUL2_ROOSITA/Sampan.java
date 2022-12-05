package praktikum.MODUL2_ROOSITA;

public class Sampan {
    protected int jumlahKursi, biaya, layar; // attribute
    
    // constructor
    public Sampan(int jumlahKursi, int biaya, int layar){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        this.layar = layar;
    }

    // method void informasi
     public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar" + biaya);
    }

    // method void berlayar
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan" + layar);
    }
    
    // method void berlabuh
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    // method void berlabuh2 
    public int berlabuh2(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan" + jangkar);
    }
}
