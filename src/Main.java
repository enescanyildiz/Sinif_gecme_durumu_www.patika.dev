import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int mat,turkce,fizik,kimya,muzik,toplam=0,ders_sayisi=0;
        double ort;
        System.out.print("Matematik Notu: ");
        mat=input.nextInt();
        if((mat>=0) && (mat<=100))
        {
            toplam+=mat;
            ders_sayisi++;
        }
        System.out.print("Türkçe Notu: ");
        turkce=input.nextInt();
        if((turkce>=0) && (turkce<=100))
        {
            toplam+=turkce;
            ders_sayisi++;
        }
        System.out.print("Fizik Notu: ");
        fizik=input.nextInt();
        if((fizik>=0) && (fizik<=100))
        {
            toplam+=fizik;
            ders_sayisi++;
        }
        System.out.print("Kimya Notu: ");
        kimya=input.nextInt();
        if((kimya>=0) && (kimya<=100))
        {
            toplam+=kimya;
            ders_sayisi++;
        }
        System.out.print("Müzik Notu: ");
        muzik=input.nextInt();
        if((muzik>=0) && (muzik<=100))
        {
            toplam+=muzik;
            ders_sayisi++;
        }
        ort= toplam/ders_sayisi;
        System.out.println("---------------------------------");
        System.out.println("Ortalamanız= "+ort);
        System.out.println("---------------------------------");
        if(ort<55)
        {
            System.out.println("Kaldınız.");
        }
        else
        {
            System.out.println("Geçtiniz.");
        }
    }
}