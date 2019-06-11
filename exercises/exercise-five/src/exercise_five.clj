(ns exercise-five)

(defn read-float[]
    (let [readvalue (Float/parseFloat (read-line))] readvalue))

(defn calculate-volume[radius, height]
    (let [result (* 3.1416 (* radius (* radius height)))] result))

(defn -main[]
    (println "Insert the height")
    (def height (read-float))
    (println "Insert the radius")
    (def radius (read-float))
    (println (calculate-volume radius height)))