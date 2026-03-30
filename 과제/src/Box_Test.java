import java.util.Scanner;

class Box {
    int width, length, height;

    double getVolume() {
        return (double) width * length * height;
    }
}

public class Box_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box myBox = new Box();

        System.out.print("가로 입력: ");
        myBox.width = sc.nextInt();
        System.out.print("세로 입력: ");
        myBox.length = sc.nextInt();
        System.out.print("높이 입력: ");
        myBox.height = sc.nextInt();

        System.out.println("상자의 가로,세로,높이는 " + myBox.width + "," + myBox.length + "," + myBox.height + "입니다.");
        System.out.println("상자의 부피는 " + myBox.getVolume() + "입니다.");
        
        sc.close();
    }
}