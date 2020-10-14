import java.util.Scanner; // 1. 导包
public class Scanner的使用步骤 {



    /*
    Scanner类的功能：可以实现键盘输入数据，到程序当中。

    引用类型的一般使用步骤：

    1. 导包
    import 包路径.类名称;
    如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
    只有java.lang包下的内容不需要导包，其他的包都需要import语句。

    2. 创建
    类名称 对象名 = new 类名称();

    3. 使用
    对象名.成员方法名()

    获取键盘输入的一个int数字：int num = sc.nextInt();
    获取键盘输入的一个字符串：String str = sc.next();
     */
    public static void main(String[] args) {
//2.0创建
        //System.in 代表从键盘输入
        Scanner sc = new Scanner(System.in);
        //获取键盘的输入
        int num=sc.nextInt();
        String str =sc.next();
        System.out.println("数字是+"+num);
        System.out.println("字符是+"+str);


    }



}

