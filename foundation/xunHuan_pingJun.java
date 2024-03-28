//键盘输入任意小于10000的正整数，
// 负数代表结束，求出他们的平均数

import java.util.Scanner;
public record xunHuan_pingJun() {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sum=0;
        int cont = 0;

        //方法一
        for(;;){
            int i=sc.nextInt();
            if(i<0) break;
            else {sum+=i; cont++;}
        }
        sum/=cont;
        System.out.println(sum+" "+cont);

        //方法二
        sum=0;
        cont=0;
        while(true){
            int i=sc.nextInt();
            if(i<0) break;
            else {
                sum+=i;
                cont++;
            }
        }
        sum/=cont;
        System.out.println(sum+" "+cont);
    }
}
