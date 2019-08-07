import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Cloud_zp
 * @category 字符串操作
 * 题目 ：输入一串数据，删除重复的数据。注意：读取字符串的顺序为从右往左，如果结果为0结束，则删除0；
 *     如果结果为负号‘-’就保留；
 * 例如：输入99876673 输出37689，输入 0542564 输出:4652 输入：-235432 输出：-2345
 *
 *
 *
 */
public class ArithMetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一串字符。。。。。。。。。");
        String str = scan.nextLine();
        //首先将字符串倒叙
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("倒叙后的结果："+sb);
        //将字符串转换成byte数组进行判断操作
        byte[] bt = sb.toString().getBytes();
        for (int i = 0; i < bt.length-1; i++) {
            for (int j = i+1; j < bt.length; j++) {
                //如果出现相同字符串，将字符换为空；
                if(bt[i]==bt[j]){
                    bt[j]=' ';
                }
            }
        }

        str = new String(bt).replace(" ","");
        //如果以0结尾去掉，如果以‘-’结尾将‘-’换到字符串的开头；
        if(str.endsWith("0")){
            str = str.substring(0,str.length()-1);
        }else if(str.endsWith("-")){
            str ="-" + str.substring(0,str.length()-1);
        }
        System.out.println(str);
    }

}
