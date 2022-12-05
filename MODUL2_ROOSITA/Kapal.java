package praktikum.MODUL2_ROOSITA;
public class Kapal {
    protected String jumlahKursi, biaya, mesin; // attribute

    // constructor
    public Kapal(int jumlahKursi, int biaya, int mesin){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        this.mesin = mesin;
    }

    // method void informasi
     public void informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar" + biaya);
    }

    // method void berlayar
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakanmesin Diesel dengan kecepatan yang tidak stabil");
    }
    
    // method void berlayar2
    public int berlayar2(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakanmesin Diesel dengan kecepatan yang stabil di kisaran" + mesin);
    }

    // method void berlabuh 
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }
}
