public class Regular extends TiketClass {
    private String harga1;

    public Regular(String Harga) {
        this.harga1 = harga1;
    }

    public void pembelian() {
        System.out.println("Bioskop Class Regular : Rp 35.000");
    }
}