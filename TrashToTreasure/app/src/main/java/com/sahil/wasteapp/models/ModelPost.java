package com.sahil.wasteapp.models;

public class ModelPost {

    String pId, pTitle, pRequirements, pLikes, pImage, pTime, uid, uEmail, uDp, uName, pProcedure;

    public ModelPost() {
    }

    public ModelPost(String pId, String pTitle, String pRequirements, String pLikes, String pImage, String pTime, String uid, String uEmail, String uDp, String uName, String pProcedure) {
        this.pId = pId;
        this.pTitle = pTitle;
        this.pRequirements = pRequirements;
        this.pLikes = pLikes;
        this.pImage = pImage;
        this.pTime = pTime;
        this.uid = uid;
        this.uEmail = uEmail;
        this.uDp = uDp;
        this.uName = uName;
        this.pProcedure = pProcedure;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpRequirements() {
        return pRequirements;
    }

    public void setpRequirements(String pRequirements) {
        this.pRequirements = pRequirements;
    }

    public String getpLikes() {
        return pLikes;
    }

    public void setpLikes(String pLikes) {
        this.pLikes = pLikes;
    }

    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuDp() {
        return uDp;
    }

    public void setuDp(String uDp) {
        this.uDp = uDp;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getpProcedure() {
        return pProcedure;
    }

    public void setpProcedure(String pProcedure) {
        this.pProcedure = pProcedure;
    }
}