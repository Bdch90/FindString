import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "fhgr1jgjersghrkgjdfkjlg1fkdgjsgjsl";
        System.out.println("Chuỗi cho trước : " + str);
        int count = 0;
        do {
            System.out.println("Ky tự muốn tìm :");
            String intput = scanner.nextLine();
            char[] arrString = str.toCharArray();
            for ( int i = 0; i < arrString.length; i++)
            {
                String input1 = String.valueOf(arrString[i]);
                boolean check = intput.equals(input1);
                if (check) {
                    count++;
                }
            }
            if (count>0)
            {
                System.out.println("Tổng số lần ký tự xuất hiện : " + count);
            }
            else
            {
                System.out.println("Không tìm thấy.");
            }
        }while (count <= str.length());
    }
}
