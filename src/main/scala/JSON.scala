package com.banno.playground.keycloak

object json {
  import argonaut._, Argonaut._
  import org.http4s.argonaut._

  case class RealmRepresentation(
    accessCodeLifespan: Option[Int],
    accessCodeLifespanLogin: Option[Int],
    accessCodeLifespanUserAction: Option[Int],
    accessTokenLifespan: Option[Int],
    accessTokenLifespanForImplicitFlow: Option[Int],
    accountTheme: Option[String],
    adminEventsDetailsEnabled: Option[Boolean],
    adminEventsEnabled: Option[Boolean],
    adminTheme: Option[String],
    attributes: Option[Map[String, String]],
    authenticationFlows: Vector[AuthenticationFlowRepresentation],
    authenticatorConfig < AuthenticatorConfigRepresentation > array
    browserFlow string
    browserSecurityHeaders Map
    bruteForceProtected boolean
    clientAuthenticationFlow string
    clientScopeMappings Map
    clientTemplates < ClientTemplateRepresentation > array
    clients < ClientRepresentation > array
    components MultivaluedHashMap
    defaultGroups < string > array
    defaultLocale string
    defaultRoles < string > array
    directGrantFlow string
    displayName string
    displayNameHtml string
    duplicateEmailsAllowed boolean
    editUsernameAllowed boolean
    emailTheme string
    enabled boolean
    enabledEventTypes < string > array
    eventsEnabled boolean
    eventsExpiration integer(int64)
    eventsListeners < string > array
    failureFactor integer(int32)
    federatedUsers < UserRepresentation > array
    groups < GroupRepresentation > array
    id string
    identityProviderMappers < IdentityProviderMapperRepresentation > array
    identityProviders < IdentityProviderRepresentation > array
    internationalizationEnabled boolean
    keycloakVersion string
    loginTheme string
    loginWithEmailAllowed boolean
    maxDeltaTimeSeconds integer(int32)
    maxFailureWaitSeconds integer(int32)
    minimumQuickLoginWaitSeconds integer(int32)
    notBefore integer(int32)
    offlineSessionIdleTimeout integer(int32)
    otpPolicyAlgorithm string
    otpPolicyDigits integer(int32)
    otpPolicyInitialCounter integer(int32)
    otpPolicyLookAheadWindow integer(int32)
    otpPolicyPeriod integer(int32)
    otpPolicyType string
    passwordPolicy string
    protocolMappers < ProtocolMapperRepresentation > array
    quickLoginCheckMilliSeconds integer(int64)
    realm string
    registrationAllowed boolean
    registrationEmailAsUsername boolean
    registrationFlow string
    rememberMe boolean
    requiredActions < RequiredActionProviderRepresentation > array
    resetCredentialsFlow string
    resetPasswordAllowed boolean
    revokeRefreshToken boolean
    roles RolesRepresentation
    scopeMappings < ScopeMappingRepresentation > array
    smtpServer Map
    sslRequired string
    ssoSessionIdleTimeout integer(int32)
    ssoSessionMaxLifespan integer(int32)
    supportedLocales < string > array
    userFederationMappers < UserFederationMapperRepresentation > array
    userFederationProviders < UserFederationProviderRepresentation > array
    users < UserRepresentation > array
    verifyEmail boolean
    waitIncrementSeconds integer(int32)  )
}