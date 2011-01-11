package com.aipo.orm.model.portlet.auto;

/** Class _EipTBlogComment was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTBlogComment extends org.apache.cayenne.CayenneDataObject {

    public static final String COMMENT_PROPERTY = "comment";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TBLOG_ENTRY_PROPERTY = "eipTBlogEntry";

    public static final String COMMENT_ID_PK_COLUMN = "COMMENT_ID";

    public void setComment(String comment) {
        writeProperty("comment", comment);
    }
    public String getComment() {
        return (String)readProperty("comment");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setOwnerId(Integer ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public Integer getOwnerId() {
        return (Integer)readProperty("ownerId");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setEipTBlogEntry(com.aipo.orm.model.portlet.EipTBlogEntry eipTBlogEntry) {
        setToOneTarget("eipTBlogEntry", eipTBlogEntry, true);
    }

    public com.aipo.orm.model.portlet.EipTBlogEntry getEipTBlogEntry() {
        return (com.aipo.orm.model.portlet.EipTBlogEntry)readProperty("eipTBlogEntry");
    } 
    
    
}
