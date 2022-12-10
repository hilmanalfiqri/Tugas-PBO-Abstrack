public class Main {
    public void CekMainTiket (TiketClass tTiket){
        tTiket.pembelian();
        tTiket.tiket();
    }

    public static void main(String[] args) {
        Main tTiket = new Main();
        System.out.println("          List Harga Tiket ");
        tTiket.CekMainTiket(new Regular("35000"));

        System.out.println("-----------------------------------------");
        tTiket.CekMainTiket(new PremiumHD ("50000"));

        System.out.println("-----------------------------------------");
        tTiket.CekMainTiket(new PremiereHD ("75000"));

    }
}