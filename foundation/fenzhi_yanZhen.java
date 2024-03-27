//判定邮箱格式是否合法

import java.util.Scanner;
public class fenzhi_yanZhen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String emaile = scanner.next();
        //方法一
        String emailMatcher= "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";   //还可以写为"[\\w]+@[\\w]+\\.[\\w]+"
        if(emaile.matches(emailMatcher)) System.out.println("邮箱格式合法");
        else System.out.println("邮箱格式不合法");

    }

}
