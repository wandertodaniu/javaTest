//简单运算，输入两个正整数a，b，哪一个大哪一个就在前面
//例如a>b,则使用a+b

import java.util.Scanner;
public class shizheyunshuan {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(a<b)
        {
            int c=a;
            a=b;
            b=c;
        }
        System.out.println((a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));
        System.out.printf("%d %d %d %d %d",a+b,a-b,a*b,a/b,a%b);
    }
}
