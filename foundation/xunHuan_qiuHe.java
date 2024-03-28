//在一个循环中生成该数列并求和

public class xunHuan_qiuHe {
    public static void main(String[] args){
        long rerult=0;
        long[] is=new long[10];
        for(long i=0,num=9;i<10;i++){
            is[(int) i]=num;
            rerult+=num;
            num=num*10+9;
        }
        for (int i=0;i<is.length;i++){
            System.out.printf("%d ",is[i]);
        }
        System.out.println();
        System.out.println(rerult);
    }
}
