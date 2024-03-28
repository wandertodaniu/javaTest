//小球落地，每次弹起一半高
// 求第n次共经过多少路程，第n次弹起多高

import java.util.Scanner;
public class xunHuan_xqLuoD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        int n = sc.nextInt();
        double nh = h;
        double resert = 0;

        //方法一
        for(int i=0;i<n;i++){
            if(i!=0) resert+=nh*2;
            else resert+=nh;
            nh=nh/2;
        }
        System.out.printf("%.3f %.3f",resert,nh);

        //方法二
        resert=0;
        nh=h;
        int j=n;
        while (true){
            if (j==n) resert+=nh;
            else  resert+=nh*2;
            nh/=2;
            j--;
            if(j==0) break;
        }
        System.out.printf("\n%.3f %.3f",resert,nh);
    }

}
