(ns exercise-one)

(defn read-integer []
    (let [readvalue (Integer/parseInt (read-line))] readvalue))

(defn -main []
    (println "Insert four integers")
    (println (+ (read-integer) (+ (read-integer) (+ (read-integer) (read-integer))))))