public class FacebookPost implements SocialMediaPost{
    private String content;

    public FacebookPost(String content) {
        this.content = content;
    }

    @Override
    public void createPost() {
        System.out.println("Creating a Facebook post: " + content);
    }
}
