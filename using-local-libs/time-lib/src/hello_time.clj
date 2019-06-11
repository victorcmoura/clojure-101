(ns hello-time
    (:require
        [clj-time.core :as t]
        [clj-time.format :as f]))

(defn now
    "returns current datetime"
    []
    (t/now))

(defn time-str
    "returns a string representation of a datetime"
    [dt]
    (f/unparse
        (f/with-zone
            (f/formatter "hh:mm aa")
            (t/default-time-zone))
        dt))