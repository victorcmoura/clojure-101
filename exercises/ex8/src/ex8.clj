(ns ex8)

(defn read-integer[]
    (let [readvalue (Integer/parseInt (read-line))] readvalue))

(defn read-float[]
    (let [readnumber (Double/parseDouble (read-line))] readnumber))

(defn rec-create-list[n, l]
    (if (not= n 1)
        (rec-create-list (dec n) (list* (read-float) l))
        (list* (read-float) l)))

(defn create-list[n]
    (rec-create-list n []))

(defn -main[]
    (println "Insert n: ")
    (def n (read-integer))
    (println "Insert" n "numbers: ")
    (println (/ (float (reduce + (create-list n))) (float n))))