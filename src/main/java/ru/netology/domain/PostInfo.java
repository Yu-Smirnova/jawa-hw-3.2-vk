package ru.netology.domain;

public class PostInfo {
    private int postId;
    private int ownerId;
    private int fromId;
    private  int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo = new CommentsInfo();
    private CopyrightInfo copyrightInfo = new CopyrightInfo();
    private LikesInfo likesInfo = new LikesInfo();
    private RepostsInfo repostsInfo = new RepostsInfo();
    private ViewsInfo viewsInfo = new ViewsInfo();
    private String postType;
    private PostSourceInfo postSourceInfo = new PostSourceInfo();
    private GeoInfo geoInfo = new GeoInfo();
    private int singerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private  DonutInfo donutInfo = new DonutInfo();
    private int postponedId;

    //+ getters / setters
}
