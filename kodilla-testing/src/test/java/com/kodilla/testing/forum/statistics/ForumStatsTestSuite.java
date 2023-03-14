package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatsTestSuite {

    @Mock
    private Statistics statsMock;

    public List<String> usersGenerator (int usersNumber) {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < usersNumber; i++) {
            users.add("User_" + i);
        }
        return users;

    }

    @Nested
    @DisplayName("post tests")
    class postTests {

        @DisplayName("0 posts")
        @Test
        void testCalculateAdvStatistics0Posts() {
            //Given
            Data data = new Data();
            List<String> users = usersGenerator(10);
            when(statsMock.postsCount()).thenReturn(0);
            when(statsMock.usersNames()).thenReturn(users);
            when(statsMock.commentsCount()).thenReturn(15);
            data.calculateAdvStatistics(statsMock);

            //When
            double resultPostsPerUser = data.getPostsPerUser();
            double resultCommentsPerUser = data.getCommentsPerUser();
            double resultCommentsPerPost = data.getCommentsPerPost();

            //Then
            Assertions.assertEquals(0, resultPostsPerUser);
            Assertions.assertEquals(1.5, resultCommentsPerUser);
            Assertions.assertEquals(Double.POSITIVE_INFINITY, resultCommentsPerPost);
        }

        @DisplayName("1000 posts")
        @Test
        void testCalculateAdvStatistics1000Posts() {
            //Given
            Data data = new Data();
            List<String> users = usersGenerator(10);
            when(statsMock.postsCount()).thenReturn(1000);
            when(statsMock.usersNames()).thenReturn(users);
            when(statsMock.commentsCount()).thenReturn(20);
            data.calculateAdvStatistics(statsMock);

            //When
            double resultPostsPerUser = data.getPostsPerUser();
            double resultCommentsPerUser = data.getCommentsPerUser();
            double resultCommentsPerPost = data.getCommentsPerPost();

            //Then
            Assertions.assertEquals(100, resultPostsPerUser);
            Assertions.assertEquals(2, resultCommentsPerUser);
            Assertions.assertEquals(0.02, resultCommentsPerPost);
        }

    }

    @DisplayName("0 comments")
    @Test
    void testCalculateAdvStatistics0Comments() {
        //Given
        Data data = new Data();
        List<String> users = usersGenerator(10);
        when(statsMock.postsCount()).thenReturn(100);
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.commentsCount()).thenReturn(0);
        data.calculateAdvStatistics(statsMock);

        //When
        double resultPostsPerUser = data.getPostsPerUser();
        double resultCommentsPerUser = data.getCommentsPerUser();
        double resultCommentsPerPost = data.getCommentsPerPost();

        //Then
        Assertions.assertEquals(10, resultPostsPerUser);
        Assertions.assertEquals(0, resultCommentsPerUser);
        Assertions.assertEquals(0, resultCommentsPerPost);
    }

    @DisplayName("comments < posts")
    @Test
    void testCalculateAdvStatisticsPostsGreaterThanComments() {
        //Given
        Data data = new Data();
        List<String> users = usersGenerator(10);
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.commentsCount()).thenReturn(400);
        data.calculateAdvStatistics(statsMock);

        //When
        double resultPostsPerUser = data.getPostsPerUser();
        double resultCommentsPerUser = data.getCommentsPerUser();
        double resultCommentsPerPost = data.getCommentsPerPost();

        //Then
        Assertions.assertEquals(100, resultPostsPerUser);
        Assertions.assertEquals(40, resultCommentsPerUser);
        Assertions.assertEquals(0.4, resultCommentsPerPost);
    }

    @DisplayName("comments > posts")
    @Test
    void testCalculateAdvStatisticsCommentsGreaterThanPosts() {
        //Given
        Data data = new Data();
        List<String> users = usersGenerator(10);
        when(statsMock.postsCount()).thenReturn(100);
        when(statsMock.usersNames()).thenReturn(users);
        when(statsMock.commentsCount()).thenReturn(400);
        data.calculateAdvStatistics(statsMock);

        //When
        double resultPostsPerUser = data.getPostsPerUser();
        double resultCommentsPerUser = data.getCommentsPerUser();
        double resultCommentsPerPost = data.getCommentsPerPost();

        //Then
        Assertions.assertEquals(10, resultPostsPerUser);
        Assertions.assertEquals(40, resultCommentsPerUser);
        Assertions.assertEquals(4, resultCommentsPerPost);
    }

    @Nested
    @DisplayName("user tests")
    class userTests {

        @DisplayName("0 users")
        @Test
        void testCalculateAdvStatistics0Users() {
            //Given
            Data data = new Data();
            List<String> users = new ArrayList<>();
            when(statsMock.postsCount()).thenReturn(100);
            when(statsMock.usersNames()).thenReturn(users);
            when(statsMock.commentsCount()).thenReturn(400);
            data.calculateAdvStatistics(statsMock);

            //When
            double resultPostsPerUser = data.getPostsPerUser();
            double resultCommentsPerUser = data.getCommentsPerUser();
            double resultCommentsPerPost = data.getCommentsPerPost();

            //Then
            Assertions.assertEquals(Double.POSITIVE_INFINITY, resultPostsPerUser);
            Assertions.assertEquals(Double.POSITIVE_INFINITY, resultCommentsPerUser);
            Assertions.assertEquals(4, resultCommentsPerPost);
        }

        @DisplayName("100 users")
        @Test
        void testCalculateAdvStatistics100Users() {
            //Given
            Data data = new Data();
            List<String> users = usersGenerator(100);
            when(statsMock.postsCount()).thenReturn(100);
            when(statsMock.usersNames()).thenReturn(users);
            when(statsMock.commentsCount()).thenReturn(400);
            data.calculateAdvStatistics(statsMock);

            //When
            double resultPostsPerUser = data.getPostsPerUser();
            double resultCommentsPerUser = data.getCommentsPerUser();
            double resultCommentsPerPost = data.getCommentsPerPost();

            //Then
            Assertions.assertEquals(1, resultPostsPerUser);
            Assertions.assertEquals(4, resultCommentsPerUser);
            Assertions.assertEquals(4, resultCommentsPerPost);
        }

    }

}
