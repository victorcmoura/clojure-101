(ns ex2)

(defn read-float[]
    (let [readnumber (Double/parseDouble (read-line))] readnumber))

(defn -main[]
    (println "Insert three numbers")
    (println (/ (+ (read-float) (+ (read-float) (read-float))) 3.0)))