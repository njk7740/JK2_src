import java.util.HashMap;
import java.util.Scanner;

public class UserIO {
    Scanner scanner = new Scanner(System.in);

    public HashMap<String, String> inputAccount() {
        HashMap<String, String> map = new HashMap<>();
        System.out.print("아이디를 입력해주세요 : ");
        map.put("아이디", scanner.nextLine());
        System.out.print("비밀번호를 입력해주세요 : ");
        map.put("비밀번호", scanner.nextLine());
        return map;
    }

    public String inputName() {
        System.out.print("사용하실 닉네임을 입력해주세요 : ");
        return scanner.nextLine();
    }

}
