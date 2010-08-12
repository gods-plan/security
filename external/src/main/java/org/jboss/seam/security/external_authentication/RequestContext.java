/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.seam.security.external_authentication;

import org.jboss.seam.security.external_authentication.configuration.SamlIdentityProvider;

/**
 * Context of an authentication request.
 * 
 */
public class RequestContext
{
   private String id;

   private SamlIdentityProvider identityProvider;

   private String urlToRedirectToAfterLogin;

   public RequestContext(String id, SamlIdentityProvider identityProvider, String urlToRedirectToAfterLogin)
   {
      super();
      this.id = id;
      this.identityProvider = identityProvider;
      this.urlToRedirectToAfterLogin = urlToRedirectToAfterLogin;
   }

   public String getId()
   {
      return id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public SamlIdentityProvider getIdentityProvider()
   {
      return identityProvider;
   }

   public void setIdentityProvider(SamlIdentityProvider identityProvider)
   {
      this.identityProvider = identityProvider;
   }

   public String getUrlToRedirectToAfterLogin()
   {
      return urlToRedirectToAfterLogin;
   }

   public void setUrlToRedirectToAfterLogin(String urlToRedirectToAfterLogin)
   {
      this.urlToRedirectToAfterLogin = urlToRedirectToAfterLogin;
   }
}