package _01_蓝桥杯java本科B组2013年;


import java.math.BigDecimal;
import java.math.BigInteger;

/*标题:黄金连分数
黄金分副数061803.是个无理数，这个常数十分重要，在许多工程问题中会出现。有时需要把这个数字求得很精确。

对于某些精密工程，常数的精度很重要。也许你听说过哈勃太空望远镜，它首次升空后就发现了一处人工加工错误，对那样一个庞然大物，其实只是镜面加工时有比头发丝还细许多倍的一处错误而已，却使它成了“近视眼”!!

言归正传，我们如何求得黄金知到数的尽可能精确的值呢?有许多方法。
比较简单的一种是用连分数:
			1
	----------------
		1+      1
			--------
				1+  1
				   ----
				    1+。。。。。。。

黄金数 =


这个连分数计算的“层数”越多，它的值越接近黄金分割数
请你利用这一特性，求出黄金分割数的足够精确值，要求四舍五入到小数点后100位，

小数点后3位的值为:0.618
小数点后4位的值为:0.6180
小数点后4位的值为:0.6180
小数点后5位的值为:0.61803
小数点后7位的值为:0.6180340

38	你的任务是:写出精确到小数点后100位精度的黄金分剧值。
注意:尾数的四舍五入 尾数是0也要保留!
42	显然答案是一个小数，其小数点后有100位数字，请通过浏览器直接提交该数字
注意:不要提交解答过程，或其它辅助说明类的内容。



1.化为数学问题 1/2 2/3 5/8  8/13
2.化为斐波那契数列相邻两项，到多少项？越多越精确 n/n+1项 n再往上增加。这个比值的小数点后101位是稳定的是，也就是不变的
这个数列从第3项开始，每一项都等于前两项之和。
3.double无法表示100位小数，BigInteger和BigDecimal
0.61803398874989484820458683436563811772030917980576286213544862270526046281890244969233401224637257135 200项
0.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748 300项
0.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748 400项
当循环400项时稳定，注意此时为103项 从0开始数的 102(包括前面的0) 求小数点所以是102去掉后面的8四舍五入 4变成5 正确答案为
0.6180339887498948482045868343656381177203091798057628621354486227052604628189024497072072041893911375


*/
public class _04黄金分割数 {

    public static void main(String[] args) {
        BigInteger a =BigInteger.ONE;
        BigInteger b =BigInteger.ONE;
        for(int i=3;i<400;i++) {
            BigInteger t =b;
            b=a.add(b);
            a=t;


        }
        BigDecimal divide = new BigDecimal(a,110).divide(new BigDecimal(b,110),BigDecimal.ROUND_HALF_DOWN);
        System.out.println(divide.toPlainString().substring(0,103));
        System.out.println((divide.toPlainString().substring(0,103)).length());








    }





}

