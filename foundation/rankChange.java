//设计一个方法，将一个在int范围内的double类型的变量
//以截断取整的方法转化为int类型并输出

import java.util.Scanner;
public class rankChange {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double d=scanner.nextDouble();
        System.out.println(rankChange.Change(d));
    }
    public static int Change(double x)
    {
        return (int) x;
        //四舍五入
        //return (int)(x<0?x-0.5:x+0.5);
    }
}
