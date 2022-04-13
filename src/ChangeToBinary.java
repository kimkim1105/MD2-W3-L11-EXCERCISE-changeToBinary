import java.util.Scanner;
import java.util.Stack;

public class ChangeToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackBinary = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int num = scanner.nextInt();
        while (num>=2){
            stack.push(num%2);
            num=num/2;
//            System.out.println(num);
        }
        stack.push(num);
        System.out.println("Chuyển sang hệ nhị phân");
        while (!stack.isEmpty()){
            System.out.print(stackBinary.push(stack.pop()));
        }
    }
}
