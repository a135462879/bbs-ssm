package com.liang.bean.impl;

import com.liang.bean.Article;

import java.util.Date;

public class ArticleImpl extends Article {
    // 用户名
    private String name;
    // 评论数
    private Integer commentCount;
    // 收藏时间
    private Date collectTime;
    // 收藏ID
    private String sid;
    // 点赞ID
    private String eid;
    // 关注ID
    private String gid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "ArticleImpl{" +
                "name='" + name + '\'' +
                ", commentCount=" + commentCount +
                ", collectTime=" + collectTime +
                ", sid='" + sid + '\'' +
                ", eid='" + eid + '\'' +
                ", gid='" + gid + '\'' +
                '}';
    }
}
