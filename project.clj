(defproject io.bytebeam/schema-contrib "0.2.0"
  :description "Additional validators for Prismatic's Schema."
  :url "https://github.com/sfx/schema-contrib"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[instaparse "1.4.10"]
                 [org.clojure/clojure "1.10.3"]
                 [org.clojure/test.check "1.1.0"]
                 [prismatic/schema "1.1.12"]]
  :pom-addition [:developers [:developer
                               [:id "fullstackdetective"] 
                               [:name "Sindhu S"] 
                               [:url  "https://github.com/fullstackdetective"]
                               [:roles [:role "developer"]]]]
  :resource-paths ["resources"]
  :deploy-repositories [["releases" {:url "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                                     :creds :gpg}
                         "snapshots" {:url "https://s01.oss.sonatype.org/content/repositories/snapshots"
                                      :creds :gpg}]]
  :scm {:connection "scm:git:ssh://git@github.com:bytebeamio/schema-contrib.git"
        :developerConnection "scm:git:ssh://git@github.com:bytebeamio/schema-contrib.git"
        :url "https://github.com/bytebeamio/schema-contrib"})
