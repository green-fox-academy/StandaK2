package com.greenfox.standak2.reddit.unit;


import com.greenfox.standak2.reddit.models.RedditPost;
import com.greenfox.standak2.reddit.repository.RedditRepo;
import com.greenfox.standak2.reddit.services.RedditService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.ArgumentMatchers.any;

public class RedditServiceTest {

    @Test
    public void addVoteGetVotesIncreasedByOne() {

        // Arrange
        RedditRepo mockRepository = Mockito.mock(RedditRepo.class);

        Mockito.when(mockRepository.findFirstById(any()))
                .thenReturn(new RedditPost("title1", "url1"));

        RedditService redditService = new RedditService(mockRepository);

        // Act
        redditService.addVote(1L);


        // Assert
        Assert.assertEquals(1L, mockRepository.findFirstById(1L).getVotes());
    }

    @Test
    public void takeVoteGetVotesDecreasedByOne() {

        // Arrange
        RedditRepo mockRepository = Mockito.mock(RedditRepo.class);

        Mockito.when(mockRepository.findFirstById(any()))
                .thenReturn(new RedditPost("title1", "url1"));

        RedditService redditService = new RedditService(mockRepository);

        // Act
        redditService.takeVote(1L);

        // Assert
        Assert.assertEquals(-1L, mockRepository.findFirstById(-1L).getVotes());
    }
}
