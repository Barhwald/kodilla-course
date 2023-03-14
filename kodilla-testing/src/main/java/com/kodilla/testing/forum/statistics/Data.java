package com.kodilla.testing.forum.statistics;

public class Data {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    @Override
    public String toString() {
        return "Data{" +
                "usersCount=" + usersCount +
                ", postsCount=" + postsCount +
                ", commentsCount=" + commentsCount +
                ", postsPerUser=" + postsPerUser +
                ", commentsPerUser=" + commentsPerUser +
                ", commentsPerPost=" + commentsPerPost +
                '}';
    }

    public void calculateAdvStatistics(Statistics statistics
    ) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        postsPerUser = (double) postsCount / usersCount;
        commentsPerUser = (double) commentsCount / usersCount;
        commentsPerPost = (double) commentsCount / postsCount;
    }

    public void showStatistics() {
        System.out.println(this);
    }

}
