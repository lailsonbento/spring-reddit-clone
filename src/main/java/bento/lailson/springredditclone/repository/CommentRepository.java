package bento.lailson.springredditclone.repository;

import bento.lailson.springredditclone.model.Comment;
import bento.lailson.springredditclone.model.Post;
import bento.lailson.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
