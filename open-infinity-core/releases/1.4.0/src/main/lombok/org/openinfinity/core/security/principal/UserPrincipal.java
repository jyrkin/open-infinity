/*
 * Copyright (c) 2011-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openinfinity.core.security.principal;

import java.io.Serializable;
import java.security.Principal;

/**
 * Class for maintaining the state of the federated identity user principal.
 * 
 * @author Ilkka Leinonen
 * @version 1.0.0
 * @since 1.4.0
 */
public class UserPrincipal implements Principal, Serializable {

	/**
	 * Represents the user's name.
	 */
	private String username;
	
	public UserPrincipal(String username) {
		this.username = username;
	}
	
	/**
	 * Getter for the name.
	 */
	public String getName() {
		return username;
	}
	
	/**
	 * Clears the name of the UserPrincipal.
	 */
	protected void clear() {
		this.username = null;
	}

	@Override
	public String toString() {
		return "UserPrincipal [username=" + username + "]";
	}
	
}