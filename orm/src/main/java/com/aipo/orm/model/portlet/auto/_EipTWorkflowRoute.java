package com.aipo.orm.model.portlet.auto;

import java.util.List;

/** Class _EipTWorkflowRoute was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTWorkflowRoute extends org.apache.cayenne.CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String NOTE_PROPERTY = "note";
    public static final String ROUTE_PROPERTY = "route";
    public static final String ROUTE_NAME_PROPERTY = "routeName";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TWORKFLOW_CATEGORY_PROPERTY = "eipTWorkflowCategory";
    public static final String EIP_TWORKFLOW_REQUEST_PROPERTY = "eipTWorkflowRequest";

    public static final String ROUTE_ID_PK_COLUMN = "ROUTE_ID";

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
    
    
    public void setRoute(String route) {
        writeProperty("route", route);
    }
    public String getRoute() {
        return (String)readProperty("route");
    }
    
    
    public void setRouteName(String routeName) {
        writeProperty("routeName", routeName);
    }
    public String getRouteName() {
        return (String)readProperty("routeName");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void addToEipTWorkflowCategory(com.aipo.orm.model.portlet.EipTWorkflowCategory obj) {
        addToManyTarget("eipTWorkflowCategory", obj, true);
    }
    public void removeFromEipTWorkflowCategory(com.aipo.orm.model.portlet.EipTWorkflowCategory obj) {
        removeToManyTarget("eipTWorkflowCategory", obj, true);
    }
    public List getEipTWorkflowCategory() {
        return (List)readProperty("eipTWorkflowCategory");
    }
    
    
    public void addToEipTWorkflowRequest(com.aipo.orm.model.portlet.EipTWorkflowRequest obj) {
        addToManyTarget("eipTWorkflowRequest", obj, true);
    }
    public void removeFromEipTWorkflowRequest(com.aipo.orm.model.portlet.EipTWorkflowRequest obj) {
        removeToManyTarget("eipTWorkflowRequest", obj, true);
    }
    public List getEipTWorkflowRequest() {
        return (List)readProperty("eipTWorkflowRequest");
    }
    
    
}
