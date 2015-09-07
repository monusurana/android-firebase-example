package com.example.android.firebaseexample.News;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private String author;
    private String description;
    private String link;
    private String newsid;
    private String pubDate;
    private String title;
    private String thumburl;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The newsid
     */
    public String getNewsid() {
        return newsid;
    }

    /**
     *
     * @param newsid
     * The newsid
     */
    public void setNewsid(String newsid) {
        this.newsid = newsid;
    }

    /**
     *
     * @return
     * The pubDate
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     *
     * @param pubDate
     * The pubDate
     */
    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The thumburl
     */
    public String getThumburl() {
        return thumburl;
    }

    /**
     *
     * @param thumburl
     * The thumburl
     */
    public void setThumburl(String thumburl) {
        this.thumburl = thumburl;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}