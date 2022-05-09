publishTo := {
  val nexus = "http://121.78.233.182:9091/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "content/repositories/releases")
}

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

//publishMavenStyle := false

//pomIncludeRepository := { _ => false }
