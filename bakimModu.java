import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    //tum oyuncularin isimleri
    String[] oyuncular = {"samet" , "mehmet" , "ahmet" , "TeenRabbit" , "merve" , "kadir" , "yildiray" , "rasit"};
     
     String[] izinliOyuncular = {"samet" , "TeenRabbit" , "kadir"};
     
     int izinliSayisi = 3;
     int redSayisi = 4;
    
    for(int i = 0; i < oyuncular.length; i++) {
        Boolean izinlimi = false;
    }
        for(int j = 0; j < izinliOyuncular.length; j++) {
            if(oyuncular[i].equals(izinliOyuncular[j])) {
        boolean izinlimi = true;
    }
    if (izinlimi) {
        System.out.println("Giris Basarili");
    } else {
        System.out.println("Giris Basarisiz");
    }
    }
    }
}
