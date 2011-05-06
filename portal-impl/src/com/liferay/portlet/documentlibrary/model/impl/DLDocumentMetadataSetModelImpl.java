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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet;
import com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSetModel;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the DLDocumentMetadataSet service. Represents a row in the &quot;DLDocumentMetadataSet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSetModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DLDocumentMetadataSetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLDocumentMetadataSetImpl
 * @see com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet
 * @see com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSetModel
 * @generated
 */
public class DLDocumentMetadataSetModelImpl extends BaseModelImpl<DLDocumentMetadataSet>
	implements DLDocumentMetadataSetModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d l document metadata set model instance should use the {@link com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet} interface instead.
	 */
	public static final String TABLE_NAME = "DLDocumentMetadataSet";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "metadataSetId", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT },
			{ "documentTypeId", Types.BIGINT },
			{ "DDMStructureId", Types.BIGINT },
			{ "fileVersionId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table DLDocumentMetadataSet (uuid_ VARCHAR(75) null,metadataSetId LONG not null primary key,classNameId LONG,classPK LONG,documentTypeId LONG,DDMStructureId LONG,fileVersionId LONG)";
	public static final String TABLE_SQL_DROP = "drop table DLDocumentMetadataSet";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet"),
			true);

	public Class<?> getModelClass() {
		return DLDocumentMetadataSet.class;
	}

	public String getModelClassName() {
		return DLDocumentMetadataSet.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet"));

	public DLDocumentMetadataSetModelImpl() {
	}

	public long getPrimaryKey() {
		return _metadataSetId;
	}

	public void setPrimaryKey(long pk) {
		setMetadataSetId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_metadataSetId);
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getMetadataSetId() {
		return _metadataSetId;
	}

	public void setMetadataSetId(long metadataSetId) {
		_metadataSetId = metadataSetId;
	}

	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public long getDocumentTypeId() {
		return _documentTypeId;
	}

	public void setDocumentTypeId(long documentTypeId) {
		_documentTypeId = documentTypeId;
	}

	public long getDDMStructureId() {
		return _DDMStructureId;
	}

	public void setDDMStructureId(long DDMStructureId) {
		if (!_setOriginalDDMStructureId) {
			_setOriginalDDMStructureId = true;

			_originalDDMStructureId = _DDMStructureId;
		}

		_DDMStructureId = DDMStructureId;
	}

	public long getOriginalDDMStructureId() {
		return _originalDDMStructureId;
	}

	public long getFileVersionId() {
		return _fileVersionId;
	}

	public void setFileVersionId(long fileVersionId) {
		if (!_setOriginalFileVersionId) {
			_setOriginalFileVersionId = true;

			_originalFileVersionId = _fileVersionId;
		}

		_fileVersionId = fileVersionId;
	}

	public long getOriginalFileVersionId() {
		return _originalFileVersionId;
	}

	public DLDocumentMetadataSet toEscapedModel() {
		if (isEscapedModel()) {
			return (DLDocumentMetadataSet)this;
		}
		else {
			return (DLDocumentMetadataSet)Proxy.newProxyInstance(DLDocumentMetadataSet.class.getClassLoader(),
				new Class[] { DLDocumentMetadataSet.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					DLDocumentMetadataSet.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		DLDocumentMetadataSetImpl dlDocumentMetadataSetImpl = new DLDocumentMetadataSetImpl();

		dlDocumentMetadataSetImpl.setUuid(getUuid());
		dlDocumentMetadataSetImpl.setMetadataSetId(getMetadataSetId());
		dlDocumentMetadataSetImpl.setClassNameId(getClassNameId());
		dlDocumentMetadataSetImpl.setClassPK(getClassPK());
		dlDocumentMetadataSetImpl.setDocumentTypeId(getDocumentTypeId());
		dlDocumentMetadataSetImpl.setDDMStructureId(getDDMStructureId());
		dlDocumentMetadataSetImpl.setFileVersionId(getFileVersionId());

		dlDocumentMetadataSetImpl.resetOriginalValues();

		return dlDocumentMetadataSetImpl;
	}

	public int compareTo(DLDocumentMetadataSet dlDocumentMetadataSet) {
		long pk = dlDocumentMetadataSet.getPrimaryKey();

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

		DLDocumentMetadataSet dlDocumentMetadataSet = null;

		try {
			dlDocumentMetadataSet = (DLDocumentMetadataSet)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = dlDocumentMetadataSet.getPrimaryKey();

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
		DLDocumentMetadataSetModelImpl dlDocumentMetadataSetModelImpl = this;

		dlDocumentMetadataSetModelImpl._originalDDMStructureId = dlDocumentMetadataSetModelImpl._DDMStructureId;

		dlDocumentMetadataSetModelImpl._setOriginalDDMStructureId = false;

		dlDocumentMetadataSetModelImpl._originalFileVersionId = dlDocumentMetadataSetModelImpl._fileVersionId;

		dlDocumentMetadataSetModelImpl._setOriginalFileVersionId = false;
	}

	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", metadataSetId=");
		sb.append(getMetadataSetId());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", documentTypeId=");
		sb.append(getDocumentTypeId());
		sb.append(", DDMStructureId=");
		sb.append(getDDMStructureId());
		sb.append(", fileVersionId=");
		sb.append(getFileVersionId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>metadataSetId</column-name><column-value><![CDATA[");
		sb.append(getMetadataSetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeId</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DDMStructureId</column-name><column-value><![CDATA[");
		sb.append(getDDMStructureId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileVersionId</column-name><column-value><![CDATA[");
		sb.append(getFileVersionId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _metadataSetId;
	private long _classNameId;
	private long _classPK;
	private long _documentTypeId;
	private long _DDMStructureId;
	private long _originalDDMStructureId;
	private boolean _setOriginalDDMStructureId;
	private long _fileVersionId;
	private long _originalFileVersionId;
	private boolean _setOriginalFileVersionId;
	private transient ExpandoBridge _expandoBridge;
}