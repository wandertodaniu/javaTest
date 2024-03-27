//定义一个int型变量i，i由
// 浮点数变量d四舍五入后的整数类型，请将转换后的i进行输出

import java.util.Scanner;
public class shiSheWuRu {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        double d=scanner.nextDouble();
        //方法一
        System.out.println((int)(d<0?d-0.5:d+0.5));
        //方法二
        long i=Math.round(d);//double返回long；float返回int
        System.out.println(i);
        //方法三
        int x=0;
        x=(int)d;
        if(d-x>=0.5) i+=1;
        System.out.println(x);
    }
}
