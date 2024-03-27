//在不使用第三个变量的
//情况下交换两个int类型变量的值

import java.util.Scanner;
public class jiaoHuanBianLiang {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        //方法一
        System.out.println(onePlan(x,y)[0]+" "+onePlan(x,y)[1]);
        //方法二
        System.out.println(twoPlan(x,y)[0]+" "+twoPlan(x,y)[1]);
        //方法三（取巧）
        System.out.println(y+" "+x);
    }
    public static int[] onePlan(int x,int y){
        x+=y;
        y=x-y;
        x-=y;
        int[] is=new int[2];
        is[0]=x;
        is[1]=y;
        return is;
    }
    public static int[] twoPlan(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
        int[] is =new int[2];
        is[0]=x;
        is[1]=y;
        return is;
    }
}
