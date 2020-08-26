package bento.lailson.springredditclone.repository;

import bento.lailson.springredditclone.model.Post;
import bento.lailson.springredditclone.model.User;
import bento.lailson.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
