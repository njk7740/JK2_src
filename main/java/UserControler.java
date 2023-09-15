import java.util.HashMap;

public class UserControler {
    UserList userList = new UserList();
    UserIO io = new UserIO();

    public void signup() {
        System.out.println("=== 회원가입을 진행합니다 ===");
        HashMap<String, String> map = io.inputAccount();
        if (userList.exist(map.get("아이디"))) {
            System.out.println("해당 ID가 존재합니다.");
        } else {
            String Name = io.inputName();
            userList.add(map.get("아이디"), map.get("비밀번호"), Name);
            System.out.println("=== 회원가입이 완료되었습니다 ===");
        }
    }

    public User login() {
        System.out.println("=== 로그인 ===");
        HashMap<String, String> map = io.inputAccount();
        User userInfo = null;
        for (User user : userList.users) {
            userInfo = user.match(map.get("아이디"), map.get("비밀번호"));
            if(userInfo != null) break;
        }
        if(userInfo == null) System.out.println("회원정보가 맞지 않습니다.");
        else System.out.println(userInfo.getName() + "님 환영합니다.");
        return userInfo;
    }
}
