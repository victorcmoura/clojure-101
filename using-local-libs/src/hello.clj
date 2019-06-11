(ns hello
    (:require [hello-time :as ht]))

(defn -main []
    (println "Hello world, the time is" (ht/time-str (ht/now))))