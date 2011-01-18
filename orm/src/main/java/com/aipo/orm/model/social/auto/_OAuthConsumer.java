package com.aipo.orm.model.social.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import com.aipo.orm.model.social.Application;

/**
 * Class _OAuthConsumer was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OAuthConsumer extends CayenneDataObject {

    public static final String CONSUMER_KEY_PROPERTY = "consumerKey";
    public static final String CONSUMER_SECRET_PROPERTY = "consumerSecret";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String NAME_PROPERTY = "name";
    public static final String TYPE_PROPERTY = "type";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String APPLICATION_PROPERTY = "application";

    public static final String ID_PK_COLUMN = "ID";

    public void setConsumerKey(String consumerKey) {
        writeProperty("consumerKey", consumerKey);
    }
    public String getConsumerKey() {
        return (String)readProperty("consumerKey");
    }

    public void setConsumerSecret(String consumerSecret) {
        writeProperty("consumerSecret", consumerSecret);
    }
    public String getConsumerSecret() {
        return (String)readProperty("consumerSecret");
    }

    public void setCreateDate(Date createDate) {
        writeProperty("createDate", createDate);
    }
    public Date getCreateDate() {
        return (Date)readProperty("createDate");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setType(String type) {
        writeProperty("type", type);
    }
    public String getType() {
        return (String)readProperty("type");
    }

    public void setUpdateDate(Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public Date getUpdateDate() {
        return (Date)readProperty("updateDate");
    }

    public void setApplication(Application application) {
        setToOneTarget("application", application, true);
    }

    public Application getApplication() {
        return (Application)readProperty("application");
    }


}