package com.otrodevym.web.oauth2;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistration.Builder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

public enum OAuth2Provider {

	/* kakao 인증에 필요한 부분...
	*/
	
	/*
	 * KAKAO {
	 * 
	 * @Override public ClientRegistration.Builder getBuilder(String registrationId)
	 * { ClientRegistration.Builder builder = getBuilder(registrationId,
	 * ClientAuthenticationMethod.POST, DEFAULT_LOGIN_REDIRECT_URL);
	 * builder.scope("profile");
	 * builder.authorizationUri("https://kauth.kakao.com/oauth/authorize");
	 * builder.tokenUri("https://kauth.kakao.com/oauth/token");
	 * builder.userInfoUri("https://kapi.kakao.com/v1/user/me");
	 * builder.clientName("Kakao"); return builder; }
	 * 
	 * }; private static final String DEFAULT_LOGIN_REDIRECT_URL =
	 * "{baseUrl}/login/oauth2/code/{registrationId}";
	 * 
	 * 
	 * protected final Builder getBuilder(String registrationId,
	 * ClientAuthenticationMethod method, String defaultLoginRedirectUrl) {
	 * ClientRegistration.Builder builder =
	 * ClientRegistration.withRegistrationId(registrationId);
	 * 
	 * builder.clientAuthenticationMethod(method);
	 * builder.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE);
	 * builder.redirectUriTemplate(defaultLoginRedirectUrl); return builder; }
	 * public abstract ClientRegistration.Builder getBuilder(String registrationId);
	 */
}
