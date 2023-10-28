public class PostFactory {
    public SocialMediaPost createPost(String platform, String content){
        if (platform.equalsIgnoreCase("Facebook")){
            return new FacebookPost(content);
        } else if (platform.equalsIgnoreCase("Twitter")){
            return new TwitterPost(content);
        } else {
            throw new IllegalArgumentException("Unsopported social media platform");
        }
    }
}
