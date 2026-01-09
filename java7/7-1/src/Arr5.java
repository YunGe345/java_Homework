import java.util.Scanner;

public class Arr5 {
        public static void main(String[] args) {
            int[][] warehouse = new int[3][4];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                System.out.println("请分别输入第" + (i+1) + "个仓库中四种商品的库存数：");
                for (int j = 0; j < 4; j++) {
                    warehouse[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) {
                int SUM = 0;
                for (int j = 0; j < 4; j++) {
                    SUM += warehouse[i][j];
                }
                System.out.println("第" + (i+1) + "个仓库的总库存量为：" + SUM + "\n");
            }
        }
    }
