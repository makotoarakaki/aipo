package com.aipo.orm.model.portlet.auto;

import java.util.List;

/** Class _EipTBlogEntry was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTBlogEntry extends org.apache.cayenne.CayenneDataObject {

    public static final String ALLOW_COMMENTS_PROPERTY = "allowComments";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String NOTE_PROPERTY = "note";
    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String TITLE_PROPERTY = "title";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TBLOG_PROPERTY = "eipTBlog";
    public static final String EIP_TBLOG_COMMENTS_PROPERTY = "eipTBlogComments";
    public static final String EIP_TBLOG_FILES_PROPERTY = "eipTBlogFiles";
    public static final String EIP_TBLOG_THEMA_PROPERTY = "eipTBlogThema";

    public static final String ENTRY_ID_PK_COLUMN = "ENTRY_ID";

    public void setAllowComments(String allowComments) {
        writeProperty("allowComments", allowComments);
    }
    public String getAllowComments() {
        return (String)readProperty("allowComments");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setOwnerId(Integer ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public Integer getOwnerId() {
        return (Integer)readProperty("ownerId");
    }
    
    
    public void setTitle(String title) {
        writeProperty("title", title);
    }
    public String getTitle() {
        return (String)readProperty("title");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setEipTBlog(com.aipo.orm.model.portlet.EipTBlog eipTBlog) {
        setToOneTarget("eipTBlog", eipTBlog, true);
    }

    public com.aipo.orm.model.portlet.EipTBlog getEipTBlog() {
        return (com.aipo.orm.model.portlet.EipTBlog)readProperty("eipTBlog");
    } 
    
    
    public void addToEipTBlogComments(com.aipo.orm.model.portlet.EipTBlogComment obj) {
        addToManyTarget("eipTBlogComments", obj, true);
    }
    public void removeFromEipTBlogComments(com.aipo.orm.model.portlet.EipTBlogComment obj) {
        removeToManyTarget("eipTBlogComments", obj, true);
    }
    public List getEipTBlogComments() {
        return (List)readProperty("eipTBlogComments");
    }
    
    
    public void addToEipTBlogFiles(com.aipo.orm.model.portlet.EipTBlogFile obj) {
        addToManyTarget("eipTBlogFiles", obj, true);
    }
    public void removeFromEipTBlogFiles(com.aipo.orm.model.portlet.EipTBlogFile obj) {
        removeToManyTarget("eipTBlogFiles", obj, true);
    }
    public List getEipTBlogFiles() {
        return (List)readProperty("eipTBlogFiles");
    }
    
    
    public void setEipTBlogThema(com.aipo.orm.model.portlet.EipTBlogThema eipTBlogThema) {
        setToOneTarget("eipTBlogThema", eipTBlogThema, true);
    }

    public com.aipo.orm.model.portlet.EipTBlogThema getEipTBlogThema() {
        return (com.aipo.orm.model.portlet.EipTBlogThema)readProperty("eipTBlogThema");
    } 
    
    
}
