package projectClass;
public class clsLingkaran {
    // atribute
    public int jari;
    private double phi = 3.14;
    private double luas;
    private double keliling;

    // method
    public double getLuas() {
        luas = phi * jari * jari;
        return luas;
    }
    public double getKeliling() {
        keliling = 2 * phi * jari;
        return keliling;
    }
}
