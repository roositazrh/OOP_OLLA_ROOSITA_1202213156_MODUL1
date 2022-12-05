package praktikum.MODUL2_ROOSITA;

public class TransportasiAir {
    protected int jumlahKursi, biaya; //atribute

    // constructor
    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    // method void informasi
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah" + "ditetapkan dengan biaya sebesar" + biaya);
    }

    // method void berlayar
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }

    // method void berlabuh 
    public void berlabuh(){
        System.out.println("Transportasi dengan jenis yang tidak diketahui berlabuh di pantai");
    }
}
