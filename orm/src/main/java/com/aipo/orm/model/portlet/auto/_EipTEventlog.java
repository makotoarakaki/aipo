package com.aipo.orm.model.portlet.auto;

/** Class _EipTEventlog was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTEventlog extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String ENTITY_ID_PROPERTY = "entityId";
    public static final String EVENT_DATE_PROPERTY = "eventDate";
    public static final String EVENT_TYPE_PROPERTY = "eventType";
    public static final String IP_ADDR_PROPERTY = "ipAddr";
    public static final String NOTE_PROPERTY = "note";
    public static final String PORTLET_TYPE_PROPERTY = "portletType";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String TURBINE_USER_PROPERTY = "turbineUser";

    public static final String EVENTLOG_ID_PK_COLUMN = "EVENTLOG_ID";

    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setEntityId(Integer entityId) {
        writeProperty("entityId", entityId);
    }
    public Integer getEntityId() {
        return (Integer)readProperty("entityId");
    }
    
    
    public void setEventDate(java.util.Date eventDate) {
        writeProperty("eventDate", eventDate);
    }
    public java.util.Date getEventDate() {
        return (java.util.Date)readProperty("eventDate");
    }
    
    
    public void setEventType(Integer eventType) {
        writeProperty("eventType", eventType);
    }
    public Integer getEventType() {
        return (Integer)readProperty("eventType");
    }
    
    
    public void setIpAddr(String ipAddr) {
        writeProperty("ipAddr", ipAddr);
    }
    public String getIpAddr() {
        return (String)readProperty("ipAddr");
    }
    
    
    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setPortletType(Integer portletType) {
        writeProperty("portletType", portletType);
    }
    public Integer getPortletType() {
        return (Integer)readProperty("portletType");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setTurbineUser(com.aipo.orm.model.security.TurbineUser turbineUser) {
        setToOneTarget("turbineUser", turbineUser, true);
    }

    public com.aipo.orm.model.security.TurbineUser getTurbineUser() {
        return (com.aipo.orm.model.security.TurbineUser)readProperty("turbineUser");
    } 
    
    
}
