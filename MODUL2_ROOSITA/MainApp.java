package praktikum.MODUL2_ROOSITA;

public class MainApp {
    // main class
    public static void MainApp(String[] args) throws Exception {
        System.out.println("Class TransportasiAir");
        TransportasiAir trans = new TransportasiAir(3, "", "transportasiair")
        trans.informasi();
        trans.berlayar();
        trans.berlabuh();

        System.out.println("Class Kapal");
        Kapal kapal1 = new Kapal(1, "");
        kapal1.informasi(); // pemanggilan method informasi ke objek mobil
        kapal1.berlayar();
        kapal1.berlabuh();
        kapal1.berlabuh2();
        System.out.println("");

        System.out.println("Class Sampan");
        Sampan sampan1 = new Sampan(2);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh2();
        System.out.println("");

    }
    
}
