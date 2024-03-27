//计算体重指数
//区间均为左闭右开,单位：m，kg

import java.util.Scanner;
public class fenZhi_zhiShu {
    public  static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        double heth = scanner.nextDouble();
        double weight = scanner.nextDouble();
        double bmi = weight/(heth*heth);
        String string = new String();
        //方法一
        if(bmi<18.5) string = "偏瘦";
        else if(bmi<20.9) string= "苗条";
        else if(bmi<24.9) string= "适中";
        else string= "偏胖";
        System.out.println(string);
        //方法二
        string=bmi<18.5?"偏瘦":bmi<20.9?"苗条":bmi<24.9?"适中":"偏胖";
        System.out.println(string);
    }
}
