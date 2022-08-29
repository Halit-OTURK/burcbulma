
//Koç Burcu : 21 Mart0 - 20 Nisan0
//
//Boğa Burcu : 21 Nisan0 - 21 Mayıs0
//
//İkizler Burcu : 22 Mayıs0 - 22 Haziran0
//
//Yengeç Burcu : 23 Haziran0 - 22 Temmuz0
//
//Aslan Burcu : 23 Temmuz0 - 22 Ağustos0
//
//Başak Burcu : 23 Ağustos0 - 22 Eylül0
//
//Terazi Burcu : 23 Eylül0 - 22 Ekim0
//
//Akrep Burcu : 23 Ekim0 - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak0
//
//Kova Burcu : 22 Ocak0 - 19 Şubat0
//
//Balık Burcu : 20 Şubat0 - 20 Mart0
import java.util.Scanner;

public class burcbulma {
    public static void main(String[] args){
    int month,day;
    Scanner input= new Scanner(System.in);
        System.out.print("DOĞDUĞUNUZ AY:");
        month= input.nextInt();
        System.out.print("DOĞDUĞUNUZ GÜN:");
        day= input.nextInt();
    if(month==1){
        if(day>=1&&day<=31){
            if(day<=21){System.out.println("Oğlak Burcu");}
            if(day>22){System.out.println("Kova Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

    if(month==2){
        if(day>=1&&day<=28){
            if(day<=19){System.out.println("Kova Burcu");}
            if(day>19){System.out.println("Balık Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==3){
            if(day>=1&&day<=31){
            if(day<=20){System.out.println("Balık Burcu");}
            if(day>20){System.out.println("Koç Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==4){
            if(day>=1&&day<=30){
            if(day<=20){System.out.println("Koç Burcu");}
            if(day>21){System.out.println("Boğa Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==5){
            if(day>=1&&day<=31){
            if(day<=21){System.out.println("Boğa Burcu");}
            if (day>22){System.out.println("İkizler Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==6){
            if(day>=1&&day<=30){
            if(day<=22){System.out.println("İkizler Burcu");}
            if(day>23){System.out.println("Yengeç Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==7){
            if(day>=1&&day<=31){
            if(day<=22){System.out.println("Yengeç Burcu");}
            if(day>23){System.out.println("Aslan Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==8){
            if(day>=1&&day<=31){
            if(day<=22){System.out.println("Aslan Burcu");}
            if(day>23){System.out.println("Başak Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==9){
            if(day>=1&&day<=30){
            if(day<=22){System.out.println("Başak Burcu");}
            if(day>23){System.out.println("Terazi Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==10){
            if(day>=1&&day<=31){
            if(day<=22){System.out.println("Terazi Burcu");}
            if(day>23){System.out.println("Akrep Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==11){
            if(day>=1&&day<=30){
            if(day<=21){System.out.println("Akrep Burcu");}
            if(day>22){System.out.println("Yay Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}

        if(month==12){
            if(day>=1&&day<=31){
            if(day<=21){System.out.println("Yay Burcu");}
            if(day>22){System.out.println("Oğlak Burcu");}}
            else {System.out.println("Yanlış giriş Yaptınız!");}}
        else {System.out.println("İYİ GÜNLER DİLERİZ");
        }





    }
}
