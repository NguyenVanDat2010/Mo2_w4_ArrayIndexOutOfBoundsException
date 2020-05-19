import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arrNumbers = new Integer[100];
        System.out.println("Nhập vao phần tử của mảng: ");
        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = random.nextInt(100);
            System.out.print(arrNumbers[i] + " ");
        }
        return arrNumbers;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
