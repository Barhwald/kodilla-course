package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    private SnapchatPublisher snapchatPublisher = new SnapchatPublisher();
    private FacebookPublisher facebookPublisher = new FacebookPublisher();
    private TwitterPublisher twitterPublisher = new TwitterPublisher();

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User user1 = new Millenials("Jan2134", snapchatPublisher);
        User user2 = new YGeneration("Amarena21", facebookPublisher);
        User user3 = new ZGeneration("xoxoxo", twitterPublisher);

        //When
        String user1Shares = user1.sharePost();
        String user2Shares = user2.sharePost();
        String user3Shares = user3.sharePost();

        //Then
        assertEquals("Publishing via Snapchat", user1Shares);
        assertEquals("Publishing via Facebook", user2Shares);
        assertEquals("Publishing via Twitter", user3Shares);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User user1 = new Millenials("Jan2134", snapchatPublisher);

        //When
        user1.setSocialPublisher(facebookPublisher);
        String user1Share = user1.sharePost();

        //Then
        assertEquals("Publishing via Facebook", user1Share);
    }
}
