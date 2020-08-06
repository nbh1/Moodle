package com.mohan.studymadeeasy.studyMaterial;

public class SubjectTopicSubClass {
    String topicName;
    String videoLink;
    String notesLink;
    boolean completed;

    public SubjectTopicSubClass(String topicName, String videoLink, String notesLink, boolean completed) {
        this.topicName = topicName;
        this.videoLink = videoLink;
        this.notesLink = notesLink;
        this.completed = completed;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getNotesLink() {
        return notesLink;
    }

    public void setNotesLink(String notesLink) {
        this.notesLink = notesLink;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
