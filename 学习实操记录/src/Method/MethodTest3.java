package Method;

public class MethodTest3 {
    public static void main(String[] args) {
        //要求打印输出遍历一个数组
        int arr[] = {10, 30, 50, 70};
        printArray(arr);
    }

    // 将方法定义移入类内部
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}



