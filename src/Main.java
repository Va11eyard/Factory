public class Main {
    public static void main(String[] args) {
        PostFactory postFactory = new PostFactory();
        SocialMediaPost facebookPost = postFactory.createPost("Facebook", "Mark founded Facebook.");
        SocialMediaPost twitterPost = postFactory.createPost("Twitter", "Elon renamed it as X.");

        facebookPost.createPost();
        twitterPost.createPost();
    }
}