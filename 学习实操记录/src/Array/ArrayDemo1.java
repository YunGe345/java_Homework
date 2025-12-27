package Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个数组。静态初始化数组
        int[] arr = {10, 20, 30, 40, 50};
        //随机获取一个索引值
        int index = (int)(Math.random() * arr.length);
        //根据索引值，获取数组中的元素
        System.out.println(arr[index]);
    }
}
