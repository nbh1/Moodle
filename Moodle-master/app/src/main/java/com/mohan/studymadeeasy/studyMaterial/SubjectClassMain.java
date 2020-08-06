package com.mohan.studymadeeasy.studyMaterial;

import java.util.ArrayList;

public class SubjectClassMain {
    String subjectName;
    boolean isOpened;
    ArrayList<SubjectTopicSubClass> itemList;

    public SubjectClassMain(String subjectName, ArrayList<SubjectTopicSubClass> itemList,boolean isOpened) {
        this.subjectName = subjectName;
        this.itemList = itemList;
        this.isOpened = isOpened;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ArrayList<SubjectTopicSubClass> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<SubjectTopicSubClass> itemList) {
        this.itemList = itemList;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
