public class TextBoard {

    PostList postList = new PostList();
    PostControler postControler = new PostControler();
    PostIO postIo = new PostIO();
    UserControler userControler = new UserControler();
    User user;

    void Run() {
        // test
        {
            postControler.addPost("첫번째 게시물", "테스트용입니다");
            postControler.addPost("두번째 게시물", "테스트용입니다");
            postControler.addPost("세번째 게시물", "테스트용입니다");
        }
        postIo.showStart();

        while (true) {
            if(user != null) System.out.printf("명령어를 입력해주세요 [%s] : ", user.getName());
            else System.out.print("명령어를 입력해주세요 : ");
            String menu = postIo.inputString();

            if (menu.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else if (menu.equals("add")) postControler.addPosts();
            else if (menu.equals("list")) postControler.printPostList();
            else if (menu.equals("update")) postControler.updatePost();
            else if (menu.equals("delete")) postControler.deletePost();
            else if (menu.equals("detail")) postControler.printPostDetail();
            else if (menu.equals("search")) postControler.searchPost();
            else if (menu.equals("signup")) userControler.signup();
            else if (menu.equals("login")) this.user = userControler.login();

        }
    }
}
