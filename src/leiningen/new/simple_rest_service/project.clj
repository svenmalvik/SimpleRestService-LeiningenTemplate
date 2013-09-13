(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :main {{name}}.core
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler {{name}}.core/app
         :auto-reload? true
         :auto-refresh? false}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring "1.2.0"]
                 [ring/ring-json "0.2.0"]
                 [clj-time "0.6.0"]
                 [compojure "1.2.0-SNAPSHOT"]]))
