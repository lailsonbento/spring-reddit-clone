package bento.lailson.springredditclone.repository;

import bento.lailson.springredditclone.model.Post;
import bento.lailson.springredditclone.model.Subreddit;
import bento.lailson.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
