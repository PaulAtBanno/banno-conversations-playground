name := "banno-conversations"

organization := "banno.com"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-deprecation",           
  "-encoding", "UTF-8",       // yes, this is 2 args
  "-feature",                
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",       
  "-Xlint",
  "-Yno-adapted-args",       
  "-Ywarn-dead-code",        // N.B. doesn't work well with the ??? hole
  "-Ywarn-numeric-widen",   
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ywarn-unused-import"     // 2.11 only
)

// These have transitive dependencies on scalaz, scalaz-stream, & Shapeless that need to line up.
val http4sVersion   = "0.15.7a"
val doobieVersion   = "0.4.1"

resolvers += Resolver.bintrayRepo("oncue", "releases")

libraryDependencies ++= Seq(
  "org.tpolecat"                %% "doobie-postgres"              % doobieVersion,
  "org.tpolecat"                %% "doobie-hikari"                % doobieVersion,
  "org.http4s"                  %% "http4s-blaze-server"          % http4sVersion,
  "org.http4s"                  %% "http4s-blaze-client"          % http4sVersion,
  "org.http4s"                  %% "http4s-dsl"                   % http4sVersion,
  "com.nimbusds"                 % "oauth2-oidc-sdk"              % "5.24",
  "org.keycloak"                 % "keycloak-authz-client"        % "2.5.4.Final",
  "oncue.knobs"                 %% "core"                         % "3.9.16aa",
  "io.verizon.journal"          %% "core"                         % "3.0.18",
  "org.scalatest"               %% "scalatest"                    % "3.0.1"       % "test",
  "org.scalacheck"              %% "scalacheck"                   % "1.13.4"      % "test",
  "com.lihaoyi"                  % "ammonite"                     % "0.8.2"       % "test" cross CrossVersion.full
)

initialCommands in (Test, console) := """ammonite.Main().run()"""

wartremoverErrors ++= Warts.allBut(Wart.Throw)
