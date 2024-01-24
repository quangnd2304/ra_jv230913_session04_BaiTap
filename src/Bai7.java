import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Nhập số phần tử của mảng n
        System.out.println("Nhập vào số phần tử của mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        //2. Khai báo mảng gồm n phần tử oldArray
        int[] oldArray = new int[n];
        //3. Nhập giá trị các phần tử mảng
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("oldArray[%d]=", i);
            oldArray[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Giá trị các phần tử của mảng trước khi thêm:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", oldArray[i]);
        }
        System.out.printf("\n");
        //4. Nhập chỉ số và giá trị phần tử cần thêm
        System.out.println("Nhập giá trị cần thêm vào mảng:");
        int addValue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chỉ số phần tử cần chèn vào:");
        int addIndex = Integer.parseInt(scanner.nextLine());
        //5. Khai báo mảng gồm n+1 phần tử newArray
        int[] newArray = new int[oldArray.length + 1];
        //6. Copy các phần tử mảng cũ sang mảng mới và chèn phần tử cần thêm mới
        if (addIndex < 0 || addIndex >= oldArray.length) {
            System.err.println("Chỉ số phần tử chèn vào không thích hợp");
        } else {
            //6.1. copy tất cả các phần tử có chỉ số < addIndex sang mảng mới
            //6.2. chèn phần tử cần thêm vào chỉ số addIndex
            //6.3. copy phần tử có chỉ số > addIndex sang mảng mới
            for (int i = 0; i < newArray.length; i++) {
                if (i < addIndex) {
                    newArray[i] = oldArray[i];
                } else if (i == addIndex) {
                    newArray[i] = addValue;
                } else {
                    newArray[i] = oldArray[i - 1];
                }
            }
            System.out.println("Mảng sau khi thực hiện thêm phần tử:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.printf("%d\t", newArray[i]);
            }
            System.out.printf("\n");
        }
        //7. Xóa phần tử trong mảng oldArray
        System.out.println("Nhập vào chỉ số phần tử cần xóa:");
        int deleteIndex = Integer.parseInt(scanner.nextLine());
        int[] deleteArray = new int[oldArray.length - 1];
        if (deleteIndex < 0 || deleteIndex >= oldArray.length) {
            System.err.println("không tồn tại phần tử có chỉ số như vậy");
        } else {
            //Thực hiện xóa
            for (int i = 0; i < deleteArray.length; i++) {
                if (i < deleteIndex) {
                    deleteArray[i] = oldArray[i];
                } else {
                    deleteArray[i] = oldArray[i + 1];
                }
            }
            System.out.println("Mảng sau khi xóa phần tử:");
            for (int i = 0; i < deleteArray.length; i++) {
                System.out.printf("%d\t", deleteArray[i]);
            }
            System.out.printf("\n");
        }
    }
}
