/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portlet;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Brian Wing Shun Chan
 */
public class RenderResponseFactory {

	public static RenderResponseImpl create(
		RenderRequestImpl renderRequestImpl, HttpServletResponse response) {

		RenderResponseImpl renderResponseImpl = new RenderResponseImpl();

		renderResponseImpl.init(renderRequestImpl, response);

		return renderResponseImpl;
	}

	/**
	 * @deprecated As of Judson, replaced by {@link #create(RenderRequestImpl,
	 *             HttpServletResponse)}
	 */
	@Deprecated
	public static RenderResponseImpl create(
			RenderRequestImpl renderRequestImpl, HttpServletResponse response,
			String portletName, long companyId)
		throws Exception {

		return create(renderRequestImpl, response);
	}

	/**
	 * @deprecated As of Judson, replaced by {@link #create(RenderRequestImpl,
	 *             HttpServletResponse)}
	 */
	@Deprecated
	public static RenderResponseImpl create(
			RenderRequestImpl renderRequestImpl, HttpServletResponse response,
			String portletName, long companyId, long plid)
		throws Exception {

		return create(renderRequestImpl, response);
	}

}