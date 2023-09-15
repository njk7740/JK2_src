import java.util.ArrayList;

public class PostList {
    ArrayList<PostData> posts = new ArrayList<>();
    PostIO postIo = new PostIO();

    public void setComment(int postIdx) {
        System.out.print("댓글");
        String text = postIo.getInputDetail();
        addComments(postIdx, text);
    }

    public void addComments(int postIdx, String text) {
        posts.get(postIdx).setComments(text);
        postIo.printSuccess();
    }


}
