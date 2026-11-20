import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] oyuncular = {"mehmet", "TeenRabbit", "asli43", "ZombiAvcisi"};

        for (int i = 0; i < oyuncular.length; i++) {
            if (oyuncular[i].equals("TeenRabbit")) {
                System.out.println("Ozel Yetkili Giris Yapti " + oyuncular[i]);
            } else {
                System.out.println("Hosgeldin " + oyuncular[i]);
            }
        }
    }
}
