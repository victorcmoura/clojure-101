(ns ex4)

(defn read-float[]
    (let [readnumber (Double/parseDouble (read-line))] readnumber))

(defn calculate-increase[salary, increase]
    (let [result (+ salary (* salary (/ increase 100)))] result))

(defn -main[]
    (println "Insert the current salary")
    (def salary (read-float))
    (println "Insert the increase (percentage value)")
    (def increase (read-float))
    (println (calculate-increase salary increase)))