package com.liang.bean.impl;

import com.liang.bean.User;

import java.util.Date;

/**
 * @author maliang
 * @create 2020-04-08 15:15
 */
public class UserImpl extends User {
    // 头像
    private String photo;
    // 关注id
    private String gid;
    // 关注时间
    private Date attentionTime;
    // 粉丝统计
    private int fansCount;
    // 文章总数
    private int articleSum;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Date getAttentionTime() {
        return attentionTime;
    }

    public void setAttentionTime(Date attentionTime) {
        this.attentionTime = attentionTime;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }

    public int getArticleSum() {
        return articleSum;
    }

    public void setArticleSum(int articleSum) {
        this.articleSum = articleSum;
    }

    @Override
    public String toString() {
        return "UserImpl{" +
                "photo='" + photo + '\'' +
                ", gid='" + gid + '\'' +
                ", attentionTime=" + attentionTime +
                ", fansCount=" + fansCount +
                ", articleSum=" + articleSum +
                '}';
    }
}
