package Streams_program;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Prathamesh";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}

