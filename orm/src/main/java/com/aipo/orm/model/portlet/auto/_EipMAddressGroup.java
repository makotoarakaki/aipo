package com.aipo.orm.model.portlet.auto;

import java.util.List;

/** Class _EipMAddressGroup was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipMAddressGroup extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String GROUP_NAME_PROPERTY = "groupName";
    public static final String OWNER_ID_PROPERTY = "ownerId";
    public static final String PUBLIC_FLAG_PROPERTY = "publicFlag";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TADDRESSBOOK_GROUP_MAP_PROPERTY = "eipTAddressbookGroupMap";

    public static final String GROUP_ID_PK_COLUMN = "GROUP_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setGroupName(String groupName) {
        writeProperty("groupName", groupName);
    }
    public String getGroupName() {
        return (String)readProperty("groupName");
    }
    
    
    public void setOwnerId(Integer ownerId) {
        writeProperty("ownerId", ownerId);
    }
    public Integer getOwnerId() {
        return (Integer)readProperty("ownerId");
    }
    
    
    public void setPublicFlag(String publicFlag) {
        writeProperty("publicFlag", publicFlag);
    }
    public String getPublicFlag() {
        return (String)readProperty("publicFlag");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void addToEipTAddressbookGroupMap(com.aipo.orm.model.portlet.EipTAddressbookGroupMap obj) {
        addToManyTarget("eipTAddressbookGroupMap", obj, true);
    }
    public void removeFromEipTAddressbookGroupMap(com.aipo.orm.model.portlet.EipTAddressbookGroupMap obj) {
        removeToManyTarget("eipTAddressbookGroupMap", obj, true);
    }
    public List getEipTAddressbookGroupMap() {
        return (List)readProperty("eipTAddressbookGroupMap");
    }
    
    
}
