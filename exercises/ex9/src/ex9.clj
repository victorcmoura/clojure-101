(ns ex9
    (:use [clojure.string :only (join)]))

(defn -main[]
    (println "Insert a string: ")
    (println (join (reverse (read-line)))))