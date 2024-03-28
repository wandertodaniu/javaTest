//判断质数

import java.util.Scanner;
public class xunHuan_zhiShu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int cont = z;

        //
        for(;;){
            cont--;
            if(z%cont==0) break;
        }
        System.out.println(p(cont));

        //
        cont=z-1;
        while(true){
            if(z%cont==0) break;
            cont--;
        }
        System.out.println(p(cont));

        //
        System.out.println(p(d(z,z)));

    }
    public static boolean p(int i){
        return i==1;
    }

    public static int d(int i,int j){
        i--;
        return j%i==0?i:d(i,j);
    }
}
