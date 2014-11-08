(ns devsites-directory.core
  (:require [me.raynes.fs :as fs])
  (:gen-class))

(defn -main [& args]
  (println "Reading sites...")
  (when-not (first args)
    (binding [*out* *err*] (println "missing directory argument"))
    (System/exit 1))
  (let [dir? (complement fs/file?)
        create-site-link #(format "<a href=\"http://%s\">%s</a>" % %)
        dirs (->> (first args)
                  fs/list-dir
                  (filter dir?)
                  (map create-site-link))]
    (doseq [dir dirs]
      (println dir))))

