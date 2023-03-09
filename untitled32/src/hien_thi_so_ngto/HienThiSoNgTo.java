package hien_thi_so_ngto;

import java.util.Scanner;

public class HienThiSoNgTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số đầu tiên : ");
        int soLuong = input.nextInt();
        int count = 0;
        int n = 2;
        while (true) {
            if (KiemTraSoNT(n)) {
                System.out.println(n);
                count++;
            }
            n++;
            if (count == soLuong) {
                break;
            }
        }

    }

    public static boolean KiemTraSoNT(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
