package apidoc;

/**
 * 文档注释，可以在类上，方法上，常量上使用。是功能级注释。
 * 文档注释可以使用javadoc命令生成文档手册
 * 在类上使用时用于说明当前类的整体功能和设计
 * @author 徐辉
 * @version 1.0
 * @see java.lang.String
 * @since JDK1.0
 */
public class ApiDocDemo {
    /**
     * 问候语
     */
    public static final String INFO = "hello";

    /**
     * 输出问候语
     * @param name 问候的人名
     * @return 问候语字符串
     */
    public String sayHello(String name) {
        System.out.println("hello: " + name);
        return "hello" + name;
    }
}
