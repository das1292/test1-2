import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class main {
    public static void main(String[] args) {
//        zadanie1

//        int n;
//        Scanner scn=new Scanner(System.in);
//        System.out.print("Wypisz n: ");
//        n=scn.nextInt();
//        int tab[]=new int[n];
//            for(int i=0;i<n;i++){
//                System.out.print("Wpisz "+(i+1)+" liczbę: ");
//                tab[i]=scn.nextInt();
//            }
//        showPrimes(tab);

//        zadanie2

//    Scanner scn=new Scanner(System.in);
//    int n=0;
//    n=scn.nextInt();
//    maks(n);

//        zadanie3

        System.out.print(modify("made"));


    }
    public static void showPrimes(int[] list)
    {
        int sum=0;
        for(int i=0;i<list.length;i++){
            for(int j=1;j<=list[i];j++){
                if(list[i]%j==0) sum++;
            }
            if(list[i]==1) System.out.print(list[i]);
            if(sum==2) System.out.print(list[i]);
            sum=0;
        }
    }
    public static void maks(int n){
        Random rand=new Random();
        int maks=50-rand.nextInt(100);
        int tab[]=new int[n-1];
        int ile=1;
        for(int i=1;i<n-1;i++){
            tab[i]=50-rand.nextInt(100);
            if(tab[i]==maks) ile++;
            if(tab[i]>maks){
                maks=tab[i];
                ile=1;
            }
        }
        System.out.print("Największa liczba to: "+maks+" i występuje "+ile+" razy");
    }
    public static String modify(String str){
        StringBuffer SB=new StringBuffer();
        StringBuffer CH=new StringBuffer();
        SB.append(str);
        for(int i=0;i<SB.length();i++){
            if(SB.length()%2==0) {
                if (i == SB.length() / 2 - 1 || i == SB.length() / 2)
                    if (Character.isLowerCase(SB.charAt(i)))
                        CH.append(Character.toUpperCase(SB.charAt(i)));
                    else
                        CH.append(SB.charAt(i));
            }
        }
        return CH.toString();
    }
}
