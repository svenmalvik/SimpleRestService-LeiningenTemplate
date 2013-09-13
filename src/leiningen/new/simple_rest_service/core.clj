(ns {{name}}.core
  (:gen-class :main true)
  (:use compojure.core
        ring.middleware.json
        ring.util.response
        ring.adapter.jetty)
  (:require [compojure.route :as route]
            [{{name}}.service :as service]))

(defroutes my_routes
  (GET "/" [] (response service/service))
  (route/resources "/"))

(def app (wrap-json-response my_routes))

(defn -main [& args] (run-jetty app {:port 9001}))