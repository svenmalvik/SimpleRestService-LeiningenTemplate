(ns leiningen.new.simple_rest_service
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "simple_rest_service"))

(defn simple_rest_service
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
      ["src/{{sanitized}}/service.clj" (render "service.clj" data)])))
