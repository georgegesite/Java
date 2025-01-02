public class B28 {

    public static void doChange(int[] arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = arr[pos] + 1;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30 };
        doChange(arr);
        for (int x : arr) {
            System.out.print(x + ",");
        }
        doChange(arr[0], arr[1], arr[2]);
        System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}

// https://www.freecram.net/question/Oracle.1z0-803.v2018-04-13.q200/given-exhibit-what-is-the-result-7
