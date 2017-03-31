package com.banno.conversations

import org.scalatest._
import prop._
// import org.scalacheck.{ Arbitrary, Gen }

class KeycloakSpec extends PropSpec with GeneratorDrivenPropertyChecks with Matchers {
  import org.http4s._
  import org.http4s.client.Client
  import org.http4s.client.middleware.FollowRedirect
  import org.http4s.client.blaze._

  val client: Client = FollowRedirect(3)(SimpleHttp1Client())
  val kcApi: Uri = Uri.uri("http://keycloak.default.svc.cluster.local/auth")

  property("each institution has their own groups") {
 //   val realms = client.expect[List[Realm]](kcApi).syncValue
    fail
  }

/*
  property("count transducer identifies top 5 hashtags correctly") {
    forAll ("old Stats", "incoming stream") { (stats: Stats, jsons: List[Json]) =>
      val s = Process.emitAll(jsons).toSource
      val r = s |> count
      r.runLast.run.get.hashTags.heavyHitterKeys.toSet should === (Set("neworleans", "boston", "losangeles", "sanfrancisco", "asheville"))
    }
  }
*/
}