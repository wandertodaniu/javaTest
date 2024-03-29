//将六个数字的最大与最小输出

import java.util.Arrays;
import java.util.Scanner;
public class shuZhu_bianLi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double d[] = new double[6];
        for(int i=0;i<6;i++){
            d[i] = sc.nextDouble();
        }

        //方法一
        for(int i=0;i<d.length-1;i++){
            if(d[i]>d[i+1]){
                d[i]=d[i]+d[i+1];
                d[i+1]=d[i]-d[i+1];
                d[i]=d[i]-d[i+1];
            }
        }
        System.out.println(d[0]+" "+d[d.length-1]);

        //方法二
        double max =d[0];
        double min =d[0];
        for(int i=0;i<d.length;i++){
            if(max<d[i]) max=d[i];
            if(min>d[i]) min=d[i];
        }
        System.out.println(min+" "+max);

        //方法三，还不太理解


    }

}
