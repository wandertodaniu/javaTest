//分级

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class fenZhi_denJi {
    public static  void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String grade = scanner.next();
        String rank =new String();
        //方法一
        switch (grade) {
            case "A":
                rank = "优秀";
                break;
            case "B":
                rank = "良好";
                break;
            case "C":
                rank = "及格";
                break;
            case "D":
                rank = "未及格";
                break;
            default:
                rank = "未知等级";
                break;
        }
        System.out.println(rank);

        //方法二
        if(grade.equals("A")) rank = "优秀";        //注意不要用==来判定，要用字符串地函数来进行比较
        else if(grade.equals("B")) rank = "良好";
        else if(grade.equals("C")) rank = "及格";
        else if(grade.equals("D")) rank = "未及格";
        else rank = "未知等级";
        System.out.println(rank);

        //方法三
        Map<String,String> map = new HashMap<>();
        map.put("A","优秀");
        map.put("B","良好");
        map.put("C","及格");
        map.put("D","不及格");
        if(!map.containsKey(grade)){
            System.out.println("未知等级");
        } else System.out.println(map.get(grade));

        //方法四
        rank=grade.equals("A")?"优秀":grade.equals("B")?"良好":grade.equals("C")?"及格":grade.equals("D")?"不及格":"未知等级";
        System.out.println(rank);

    }
}
