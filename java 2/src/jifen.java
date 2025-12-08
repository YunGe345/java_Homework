import java.util.Scanner;

public class jifen {
    public static void main(String[] args) {
        //1. 定义各个用具变量
        int zongjifen = 20;
        int pencil = 1;
        int rubber = 2;
        int book = 3;
        int box = 4;
        // 注明用具积分
        System.out.println("1.铅笔的积分是：" + pencil);
        System.out.println("2.橡皮的积分是：" + rubber);
        System.out.println("3.图书的积分是：" + book);
        System.out.println("4.盒子的积分是：" + box);
        // 输入商品编号，判定为键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入兑换商品的编号：");
        int ID = sc.nextInt();                    //定义变量ID为用户输入的商品编号
        int shengyu = zongjifen;                  //定义变量shengyu，为其赋值等于总积分zongjifen
        switch (ID) {                             // switch语句
            case 1:
                shengyu = zongjifen - pencil;     // 计算剩余积分：总积分减去用户输入的ID所对应的积分
                System.out.println("恭喜你，兑换成功！");
                break;
            case 2:                               //此代码可以优化为 shengyu -= pencil;
                shengyu = zongjifen - rubber;     //下文类似代码使用优化后的版本，图美观
                System.out.println("恭喜你，兑换成功！");
                break;
            case 3:
                shengyu = zongjifen - book;
                System.out.println("恭喜你，兑换成功！");
                break;
            case 4:
                shengyu = zongjifen - box;
                System.out.println("恭喜你，兑换成功！");
                break;
            default:
                System.out.println("非法输入！");
        }
        System.out.println("剩余积分：" + shengyu);
        //2. 让用户选择是否继续进行兑换
        int f = shengyu;                          //定义变量‘剩余积分’，和上文的shengyu变量进行区分，避免变量冲突
        int g = 0;                                //可兑换个数
        int h = 0;                                //定义新变量，下文要用
        System.out.println("是否继续兑换？如果继续兑换请输入商品编号.否则输入0结束兑换");
        ID = sc.nextInt();
        switch (ID) {
            case 1:
                f -= pencil;
                g = f / pencil;                   //求商，计算积分可以整除情况下兑换的个数
                h = f % pencil;                   //求余数，计算无法整除情况下兑换后还剩余的积分
                System.out.println("恭喜你，兑换成功！");
                break;
            case 2:
                f -= rubber;
                g = f / rubber;
                h = f % rubber;
                System.out.println("恭喜你，兑换成功！");
                break;
            case 3:
                f -= book;
                g = f / book;
                h = f % book;
                System.out.println("恭喜你，兑换成功！");
                break;
            case 4:
                f -= box;
                g = f / box;
                h = f % box;
                System.out.println("恭喜你，兑换成功！");
                break;
            case 0:
                System.out.println("结束兑换");
                break;
            default:
                System.out.println("非法输入！");
        }
        System.out.println("剩余积分：" + f);
        System.out.println("还可继续兑换该商品数量：" + g + "并剩余" + h + "积分");
    }
}
