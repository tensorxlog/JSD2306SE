package homework.day01.answer;

import java.util.Scanner;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //1获取用户输入的用户名
        System.out.println("请输入用户名:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine().trim();
        int len = username.length();
        if(len>=1&&len<=20){
            System.out.println("验证通过!");
        }else{
            System.out.println("验证失败!");
        }
    }
}
