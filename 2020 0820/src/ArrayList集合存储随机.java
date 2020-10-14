import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1~33之间的随机整数，添加到集合，并遍历集合。

思路：
1. 需要存储6个数字，创建一个集合，<Integer>
2. 产生随机数，需要用到Random
3. 用循环6次，来产生6个随机数字：for循环
4. 循环内调用r.nextInt(int n)，参数是33，0~32，整体+1才是1~33
5. 把数字添加到集合中：add
6. 遍历集合：for、size、get
 */
public class ArrayList集合存储随机 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayA = new ArrayList<>();
        Random B= new Random();

        for (int i = 0; i < 6; i++) {

            arrayA.add(B.nextInt(33)+1);

        }
        for (int i = 0; i < arrayA.size(); i++) {
            System.out.println("获取的随机数为"+arrayA.get(i));

        }

    }
}
