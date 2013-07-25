(defproject com.stuartsierra/clojure.walk2 "0.1.0-SNAPSHOT"
  :description "Reimplementation of clojure.walk"
  :url "https://github.com/stuartsierra/clojure.walk2"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.4"]
                                  [org.clojure/data.generators "0.1.2"]]
                   :source-paths ["dev"]}}
  :global-vars {*warn-on-reflection* true})
