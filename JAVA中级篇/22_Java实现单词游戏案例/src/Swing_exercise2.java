

import java.awt.*;			//导包
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class Swing_exercise2 extends JFrame {    //继承JFrame顶层框架

    //定义面板
    JPanel jp1;
    JPanel jp2;
    JPanel jp3;

    //定义拆分窗格
    JSplitPane jsp;
    JSplitPane jsp1;

    //定义文本域
    JTextArea jta1;
    TextField jta2;
    JTextArea jta3;

    //定义滚动窗格
    JScrollPane jspane1;
    JScrollPane jspane2;
    JScrollPane jspane3;


    //定义按钮
    JButton jb2;

    //定义显示区域
    JLabel jla1;

    //定义随机函数
    Random ran;
    private int sw;  //屏幕宽度和高度
    private int sh;  //屏幕宽度和高度
    private String ch;//随机单词
    private int  Fen;//记录分数
    private int  z;//记录正确题数
    private int  x;//记录错误题数
    private int  sun;//记录总题数

    public static void main(String[] args) {
        Swing_exercise2 a = new Swing_exercise2();    //显示界面
    }

    public Swing_exercise2()        //构造函数
    {
        //字体初始化 Times new roman：罗马字样 加粗
        Font font = new Font("Times new roman", Font.BOLD, 30);
        Font font1 = new Font("宋体", Font.BOLD, 20);

        //创建随机函数
        ran = new Random();

        //创建面板
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        //创建多行文本框
        jta1 = new JTextArea();
        jta3 = new JTextArea();

        //创建单行文本框
        jta2 = new TextField(10);

        //设置多行文本框自动换行
        jta1.setLineWrap(true);
        jta3.setLineWrap(true);


        //创建滚动窗格
        jspane1 = new JScrollPane(jta1);
        jspane2 = new JScrollPane(jta2);
        jspane3 = new JScrollPane(jta3);

        //设置字体样式
        jta3.setFont(font1);
        jta2.setFont(font);
        jta1.setFont(font);


        //创建拆分窗格
        jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jspane1, jspane2);
        jsp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jspane3, jsp);

        //分频器布局
        jsp.setDividerLocation(700);        //设置拆分窗格分频器初始位置
        jsp.setDividerSize(10);             //设置分频器大小
        jsp1.setDividerLocation(0.5);       //设置拆分窗格分频器初始位置
        jsp1.setDividerSize(10);            //设置分频器大小

        //设置调整单词显示区
        jla1 = new JLabel();
        jla1.setFont(font);

        //初始化显示页面
        ch = RandomWords();
        jla1.setText(ch);
        jla1.setSize(sw, sh);
        jla1.setSize(500, 500);
        jla1.setLocation(ran.nextInt(300), ran.nextInt(200));


        //创建按钮
        jb2 = new JButton("确定");


        //设置布局管理
        jp1.setLayout(new BorderLayout());    //设置面板布局
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp3.setLayout(new BorderLayout());


        //添加组件
        jp1.add(jsp);
        jp2.add(jb2);
        jp3.add(jsp1);
        jta1.add(jla1);

        //初始化得分数据
        Fen=0;
        z=0;
        x=0;
        sun=0;


        //布置整体面板布局
        this.add(jp1, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);
        this.add(jp3, BorderLayout.WEST);

        //设置窗体属性
        this.setTitle("单词游戏");                                    //设置界面标题
        this.setExtendedState(MAXIMIZED_BOTH);                      //窗口最大化
        this.setLocation(1000, 200);                           //设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //设置虚拟机和界面一同关闭
        this.setVisible(true);                                     //设置界面可视化

        //事件监听
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jta2.getText().equals(ch)) {
                    z=z+1;
                    Fen=Fen+5;
                    sun=x+z;
                    jta3.setText("回答正确    " +
                            "     得分+5         "+"  作答情况"+""+"正确："+z+" "+"错误："
                            +x+" 总答题:"+sun+"         总得分为  "+Fen+"        " +
                            "              不要骄傲");
                    ch = RandomWords();
                    jla1.setText(ch);
                    jla1.setLocation(ran.nextInt(500), ran.nextInt(500));
                }else {
                    Fen=Fen-2;
                    x+=1;
                    sun=x+z;
                    jta3.setText("回答错误    " +
                            "     得分-2         "+"  作答情况"+""+"正确："+z+" "+"错误："
                            +x+" 总答题:"+sun+"         总得分为  "+Fen+"        " +
                            "              再接再厉");
                }
            }
        });
    }

    //随机产生单词
    private String RandomWords() {//产生随机单词
        String[] s = {"good", "cheer", "strive", "optimistic", "hello", "word", "tercher", "student",
                "book", "genius", "handsome", "beautiful", "health", "happy", "exercice", "computer",
                "english", "jspanese", "eat", "me"};
        int b = ran.nextInt(21);//定义随机数区间[0,20]
        return s[b];
    }

    //获取用户屏幕大小
    private void SimpleFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        sw = dim.width;
        sh = dim.height;
    }
}