public class TwitterPost implements SocialMediaPost{
    private String content;

    public TwitterPost(String content) {
        this.content = content;
    }

    @Override
    public void createPost() {
        System.out.println("Creating a Twitter post: " + content);
    }
}
