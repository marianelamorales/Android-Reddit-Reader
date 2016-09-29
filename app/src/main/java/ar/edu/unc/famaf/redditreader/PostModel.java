package ar.edu.unc.famaf.redditreader;

import java.util.Date;

/**
 * Created by male on 29/09/16.
 */
public class PostModel {
    private String mSubreddit;
    private Date mDate;
    private int mComments;
    private String mImage;

    public PostModel(String mSubreddit, Date mDate, int mComments, String mImage) {
        this.mSubreddit = mSubreddit;
        this.mDate = mDate;
        this.mComments = mComments;
        this.mImage = mImage;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public int getmComments() {
        return mComments;
    }

    public void setmComments(int mComments) {
        this.mComments = mComments;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public String getmSubreddit() {
        return mSubreddit;
    }

    public void setmSubreddit(String mSubreddit) {
        this.mSubreddit = mSubreddit;
    }

}
