package week15d03;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPosts(String user){

        return posts.stream()
                .filter(post -> post.getPublishedAt().isBefore(LocalDate.now())
                        || (post.getPublishedAt().isAfter(LocalDate.now()) && post.getOwner().equals(user)))
                .filter(post -> !post.getTitle().isEmpty() && !post.getContent().isEmpty())
                .filter(post -> post.getDeletedAt() == null || post.getDeletedAt().isAfter(LocalDate.now()))
                .collect(Collectors.toList());
    }


}
