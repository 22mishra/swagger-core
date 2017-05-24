/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.oas.annotations.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 
 *
 * 
 **/


@Target({ ElementType.METHOD,
        ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SecurityScheme {
  /**
   * Required. The type of the security scheme. Valid values are "apiKey", "http", "oauth2", "openIdConnect".
   **/
  String type();

  /**
   * A short description for security scheme. CommonMark syntax can be used for rich text representation.
   **/
  String description() default "";

  /**
   * Required. The name of the header or query parameter to be used.
   **/
  String name();

  /**
   * Required. The location of the API key. Valid values are "query" or "header".
   **/
  String in() default "";

  /**
   * Required. The name of the HTTP Authorization scheme to be used in the Authorization header as defined in RFC 7235.
   **/
  String scheme() default "";

  /**
   * A hint to the client to identify how the bearer token is formatted. Bearer tokens are usually generated by an
   * authorization server, so this information is primarily for documentation purposes.
   **/
  String bearerFormat() default "";

  /**
   * Required. An object containing configuration information for the flow types supported.
   **/
  OAuthFlows flows() default @OAuthFlows();

  /**
   * Required. OpenId Connect URL to discover OAuth2 configuration values. This MUST be in the form of a URL.
   **/
  String openIdConnectUrl() default "";

}
