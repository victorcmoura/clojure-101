(ns exercise-three)

(defn read-float[]
    (let [readnumber (Double/parseDouble (read-line))] readnumber))

(defn calculate-increase[salary]
    (let [result (* salary 1.25)] result))

(defn -main[]
    (println "Insert the current salary")
    (println (calculate-increase (read-float))))