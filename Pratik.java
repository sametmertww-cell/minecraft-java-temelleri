public class Main {
    
    public static void main(String[] args) {
        merhaba("masa", true);
            merhaba("berat", true);
                merhaba("mehmet", true);
                    merhaba("samet", true);
    }
    
    public static void merhaba(String isim, boolean vipMi) {
        if(vipMi) {
            System.out.println("Hosgeldin Vip " + isim);
        } else {
            System.out.println("Hosgeldin " + isim);
        }
    }
}
