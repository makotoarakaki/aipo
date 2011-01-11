package com.aipo.orm.model.account.auto;

/** Class _EipTAclUserRoleMap was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTAclUserRoleMap extends org.apache.cayenne.CayenneDataObject {

    public static final String ROLE_ID_PROPERTY = "roleId";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TACL_ROLE_PROPERTY = "eipTAclRole";
    public static final String TURBINE_USER_PROPERTY = "turbineUser";

    public static final String ID_PK_COLUMN = "ID";

    public void setRoleId(Integer roleId) {
        writeProperty("roleId", roleId);
    }
    public Integer getRoleId() {
        return (Integer)readProperty("roleId");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setEipTAclRole(com.aipo.orm.model.account.EipTAclRole eipTAclRole) {
        setToOneTarget("eipTAclRole", eipTAclRole, true);
    }

    public com.aipo.orm.model.account.EipTAclRole getEipTAclRole() {
        return (com.aipo.orm.model.account.EipTAclRole)readProperty("eipTAclRole");
    } 
    
    
    public void setTurbineUser(com.aipo.orm.model.security.TurbineUser turbineUser) {
        setToOneTarget("turbineUser", turbineUser, true);
    }

    public com.aipo.orm.model.security.TurbineUser getTurbineUser() {
        return (com.aipo.orm.model.security.TurbineUser)readProperty("turbineUser");
    } 
    
    
}
