public class A7 {
    public static void main(String[] args) {
        int[] last = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int sum = 0;
        for (int front = 0, rear = last.length - 1; front < 5 && rear >= 5; front++, rear--) {
            sum = sum + last[front] + last[rear];
        }
        System.out.print(sum);
    }
}
