(ns ex7)

(defn read-integer[]
    (let [readvalue (Integer/parseInt (read-line))] readvalue))

(defn rec-create-list[n, l]
    (if (not= n 1)
        (rec-create-list (dec n) (list* (read-integer) l))
        (list* (read-integer) l)))

(defn create-list[n]
    (rec-create-list n []))

(defn -main[]
    (println "Insert the n")
    (def n (read-integer))
    (println "Insert the n numbers")
    (println "Result: " (reduce + (create-list n))))