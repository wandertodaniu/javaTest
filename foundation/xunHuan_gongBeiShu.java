//求两个数的最小公倍数

import java.util.Scanner;
public class xunHuan_gongBeiShu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = m > n ? m : n, q = m < n ? m : n;
        int c = m > n ? m : n;

        //方法一
        for (int i=1;p%q!=0;i++) {
            p = c * i;
        }
        System.out.println(p);

        //方法二
        p = m > n ? m : n;
        q = m < n ? m : n;
        int i=1;
        while (true){
            if(p%q==0) break;
            p=c*i;
            i++;
        }
        System.out.println(p);

        //方法三
        System.out.println(getGbs(m,n));

    }
    public static int getGbs(int m,int n){   //利用gdc的递归算出最大公约数，再用m*n除以最大公约数得到m，n的最小公倍数。
        return m*n/gdc(m,n);
    }
    public static int gdc(int m,int n){     //求余法找出最大公约数
        if(n==0) return m;
        return gdc(n,m%n);
    }
}
