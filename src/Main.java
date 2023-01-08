public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Bài 2: Cho sẵn 1 mảng số nguyên gồm 10 phần tử.
                Viết chương trình tính tổng các phần tử trong mảng
                Viết chương trình tìm phần tử lớn nhất của mảng.
                """);

        int[] arr = {4, 3, 6, 7, 5, 4, 6, 9, 1, 15};

        System.out.println("Tổng giá trị các phần tử trong mảng là: " + "" + arrSum(arr));

        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElements(arr));
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int maxElements(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}

