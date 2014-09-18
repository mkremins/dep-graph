(defproject mkremins/dep-graph "0.1.0"
  :description "Dependency graph datastructure for Clojure and ClojureScript"
  :url "https://github.com/mkremins/dep-graph"
  :license {:name "Eclipse Public License 1.0"
            :url "http://opensource.org/licenses/eclipse-1.0.php"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :plugins [[com.keminglabs/cljx "0.4.0"]]
  :cljx {:builds [{:source-paths ["src"]
                   :output-path "target/classes"
                   :rules :clj}
                  {:source-paths ["src"]
                   :output-path "target/classes"
                   :rules :cljs}]}
  :prep-tasks ["cljx" "compile"])
