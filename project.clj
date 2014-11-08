(defproject devsites-directory "0.1.0-SNAPSHOT"
  :description "Parses dev sites from folder and prints links to them."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [me.raynes/fs "1.4.4"]]
  :main ^:skip-aot devsites-directory.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
