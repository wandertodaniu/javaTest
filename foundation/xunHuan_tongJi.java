//统计输入正数的个数

import java.util.Scanner;
public class xunHuan_tongJi {
    public static void main(String[] args){
        Scanner sv = new Scanner(System.in);
        int num=0;

        //方法一
        for (int i=1;i>0;i++){
            int c=sv.nextInt();
            if(c<0)
                break;
            num+=1;
        }
        System.out.println(num);

        //方法二
        num=0;
        while(true){
            int c=sv.nextInt();
            if (c<0)
                break;
            num++;
        }
        System.out.println(num);
    }
}
