/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.documentlibrary.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.documentlibrary.model.DLDocumentType;
import com.liferay.portlet.documentlibrary.model.DLDocumentTypeModel;
import com.liferay.portlet.documentlibrary.model.DLDocumentTypeSoap;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the DLDocumentType service. Represents a row in the &quot;DLDocumentType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.documentlibrary.model.DLDocumentTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DLDocumentTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLDocumentTypeImpl
 * @see com.liferay.portlet.documentlibrary.model.DLDocumentType
 * @see com.liferay.portlet.documentlibrary.model.DLDocumentTypeModel
 * @generated
 */
public class DLDocumentTypeModelImpl extends BaseModelImpl<DLDocumentType>
	implements DLDocumentTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d l document type model instance should use the {@link com.liferay.portlet.documentlibrary.model.DLDocumentType} interface instead.
	 */
	public static final String TABLE_NAME = "DLDocumentType";
	public static final Object[][] TABLE_COLUMNS = {
			{ "documentTypeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DLDocumentType (documentTypeId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,description STRING null)";
	public static final String TABLE_SQL_DROP = "drop table DLDocumentType";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.documentlibrary.model.DLDocumentType"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.documentlibrary.model.DLDocumentType"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DLDocumentType toModel(DLDocumentTypeSoap soapModel) {
		DLDocumentType model = new DLDocumentTypeImpl();

		model.setDocumentTypeId(soapModel.getDocumentTypeId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DLDocumentType> toModels(DLDocumentTypeSoap[] soapModels) {
		List<DLDocumentType> models = new ArrayList<DLDocumentType>(soapModels.length);

		for (DLDocumentTypeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public Class<?> getModelClass() {
		return DLDocumentType.class;
	}

	public String getModelClassName() {
		return DLDocumentType.class.getName();
	}

	public static final String MAPPING_TABLE_DLDOCUMENTTYPE_DDMSTRUCTURE_NAME = "DLDocumentType_DDMStructure";
	public static final Object[][] MAPPING_TABLE_DLDOCUMENTTYPE_DDMSTRUCTURE_COLUMNS =
		{
			{ "documentTypeId", Types.BIGINT },
			{ "structureId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_DLDOCUMENTTYPE_DDMSTRUCTURE_SQL_CREATE =
		"create table DLDocumentType_DDMStructure (documentTypeId LONG not null,structureId LONG not null,primary key (documentTypeId, structureId))";
	public static final boolean FINDER_CACHE_ENABLED_DLDOCUMENTTYPE_DDMSTRUCTURE =
		GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.DLDocumentType_DDMStructure"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.documentlibrary.model.DLDocumentType"));

	public DLDocumentTypeModelImpl() {
	}

	public long getPrimaryKey() {
		return _documentTypeId;
	}

	public void setPrimaryKey(long pk) {
		setDocumentTypeId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_documentTypeId);
	}

	public long getDocumentTypeId() {
		return _documentTypeId;
	}

	public void setDocumentTypeId(long documentTypeId) {
		_documentTypeId = documentTypeId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public DLDocumentType toEscapedModel() {
		if (isEscapedModel()) {
			return (DLDocumentType)this;
		}
		else {
			return (DLDocumentType)Proxy.newProxyInstance(DLDocumentType.class.getClassLoader(),
				new Class[] { DLDocumentType.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					DLDocumentType.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		DLDocumentTypeImpl dlDocumentTypeImpl = new DLDocumentTypeImpl();

		dlDocumentTypeImpl.setDocumentTypeId(getDocumentTypeId());
		dlDocumentTypeImpl.setGroupId(getGroupId());
		dlDocumentTypeImpl.setCompanyId(getCompanyId());
		dlDocumentTypeImpl.setUserId(getUserId());
		dlDocumentTypeImpl.setUserName(getUserName());
		dlDocumentTypeImpl.setCreateDate(getCreateDate());
		dlDocumentTypeImpl.setModifiedDate(getModifiedDate());
		dlDocumentTypeImpl.setName(getName());
		dlDocumentTypeImpl.setDescription(getDescription());

		dlDocumentTypeImpl.resetOriginalValues();

		return dlDocumentTypeImpl;
	}

	public int compareTo(DLDocumentType dlDocumentType) {
		long pk = dlDocumentType.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DLDocumentType dlDocumentType = null;

		try {
			dlDocumentType = (DLDocumentType)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = dlDocumentType.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public void resetOriginalValues() {
	}

	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{documentTypeId=");
		sb.append(getDocumentTypeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.documentlibrary.model.DLDocumentType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>documentTypeId</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _documentTypeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private transient ExpandoBridge _expandoBridge;
}