import java.util.Scanner;

public class EmailTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String email = scan.nextLine();
        //邮箱正则
        boolean flag = email.matches("^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$");
        if (flag) {
            System.out.println("合法");
        } else {
            System.out.println("不合法");
        }
    }
}
