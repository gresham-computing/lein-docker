(defproject com.greshamtech/lein-docker "1.2.0-SNAPSHOT"
  :description "A leiningen plugin to build docker images and deploy them."
  :url "https://github.com/gresham-computing/lein-docker"

  :license {:name "ISC License"
            :url "http://opensource.org/licenses/ISC"}

  :min-lein-version "2.5.0"
  :eval-in-leiningen true

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [leiningen-core "2.5.0"]]

  :deploy-repositories [["releases" :clojars]])
