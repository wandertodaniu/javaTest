//计算一个数的位数，不大于零则直接输出

import java.util.Scanner;
public class xunHuan_jiShu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        sc.close();
        int num=0;

        //方法一
        if (d>1)
            for(int i=10;;i=i*10){
                if((d-d%i)%i==0&&i<=d*10)    //可以用n/10;感觉被搏杀了
                    num++;
                else break;
            }
        else System.out.println(d);
        if(num>0) System.out.println(num);

        //方法二
        num=0;
        int i=10;
        if(d>1)
            while(true){
                if((d-d%i)%i==0&&i<=d*10)
                    num++;
                else break;
                i*=10;
            }
        else System.out.println(d);
        if(num>0) System.out.println(num);


        //方法三；转为字符串
        if(d<1)
            System.out.println(d);
        else System.out.println(String.valueOf(d).length());

    }


}
