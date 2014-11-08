(ns devsites-directory.core
  (:require [me.raynes.fs :as fs])
  (:gen-class))

(defn find-sites [site-root]
  (me.raynes.fs/list-dir site-root))

(defn print-site-link [site]
  (println (str "<a href=\"http://" site "\">" site "</a>")))

(defn -main [& args]
  (println "Reading sites...")
  (loop [remaining-sites (find-sites (first args)) final-sites []]
    (if (empty? remaining-sites)
      final-sites
      (let [[site & remaining] remaining-sites
            final-sites (conj final-sites site)]
        (print-site-link site)
        (recur remaining final-sites)))))
