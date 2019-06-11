(ns ex6)

(defn read-integer[]
    (let [readvalue (Integer/parseInt (read-line))] readvalue))

(defn rec-pow[x, curr]
    (if (= curr 1)
        x
        (* x (rec-pow x (dec curr)))))

(defn pow[x, y]
    (rec-pow x y))

(defn -main[]
    (println "Insert x")
    (def x (read-integer))
    (println "Insert y")
    (def y (read-integer))
    (println (pow x y)))