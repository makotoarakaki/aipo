package com.aipo.orm.model.portlet.auto;

import java.util.List;

/** Class _EipTBlogThema was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTBlogThema extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String CREATE_USER_ID_PROPERTY = "createUserId";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String THEMA_NAME_PROPERTY = "themaName";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String UPDATE_USER_ID_PROPERTY = "updateUserId";
    public static final String EIP_TBLOG_ENTRYS_PROPERTY = "eipTBlogEntrys";

    public static final String THEMA_ID_PK_COLUMN = "THEMA_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setCreateUserId(Integer createUserId) {
        writeProperty("createUserId", createUserId);
    }
    public Integer getCreateUserId() {
        return (Integer)readProperty("createUserId");
    }
    
    
    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }
    
    
    public void setThemaName(String themaName) {
        writeProperty("themaName", themaName);
    }
    public String getThemaName() {
        return (String)readProperty("themaName");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUpdateUserId(Integer updateUserId) {
        writeProperty("updateUserId", updateUserId);
    }
    public Integer getUpdateUserId() {
        return (Integer)readProperty("updateUserId");
    }
    
    
    public void addToEipTBlogEntrys(com.aipo.orm.model.portlet.EipTBlogEntry obj) {
        addToManyTarget("eipTBlogEntrys", obj, true);
    }
    public void removeFromEipTBlogEntrys(com.aipo.orm.model.portlet.EipTBlogEntry obj) {
        removeToManyTarget("eipTBlogEntrys", obj, true);
    }
    public List getEipTBlogEntrys() {
        return (List)readProperty("eipTBlogEntrys");
    }
    
    
}
