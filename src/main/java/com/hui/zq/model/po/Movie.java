package com.hui.zq.model.po;

import javax.persistence.*;
import java.io.Serializable;

public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;

    private String cover;

    private String rate;

    private String casts;

    private String directors;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    /**
     * @return casts
     */
    public String getCasts() {
        return casts;
    }

    /**
     * @param casts
     */
    public void setCasts(String casts) {
        this.casts = casts == null ? null : casts.trim();
    }

    /**
     * @return directors
     */
    public String getDirectors() {
        return directors;
    }

    /**
     * @param directors
     */
    public void setDirectors(String directors) {
        this.directors = directors == null ? null : directors.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", cover=").append(cover);
        sb.append(", rate=").append(rate);
        sb.append(", casts=").append(casts);
        sb.append(", directors=").append(directors);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}