//简单分支
//折扣计算，不足一块抹零
//需要注意是折扣前抹零，还是折扣后抹零，这里我默认折扣后抹零（书写方便）
import java.util.Scanner;
public class fenZhi_zheKou {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double monney = scanner.nextDouble();

        //方法一
        int cost1 =0;

        if(monney<100) cost1=(int)monney;
        else if (monney<500) cost1=(int)(monney*0.9);
        else if (monney<2000) cost1=(int)(monney*0.8);
        else if (monney<5000) cost1=(int)(monney*0.7);
        else cost1=(int)(monney*0.6);

        System.out.println(cost1);

        //方法二
        System.out.println((int)(monney>=5000?monney*0.6:monney>=2000?monney*0.7:
                monney>=500?monney*0.8:monney>=100?monney*0.9:monney));
    }
}
