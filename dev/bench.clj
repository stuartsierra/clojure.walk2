(ns bench
  (:require [clojure.walk2 :as w2]
            [clojure.walk :as w1]
            [clojure.data.generators :as dg]))

(defn data
  "Generates a random collection based on an integer seed."
  [seed]
  (binding [dg/*rnd* (java.util.Random. seed)]
    (dg/collection)))

(defn bench
  "Execute a naive benchmark using data generated from an integer seed."
  [seed]
  (let [data (data seed)]
    (println "Old clojure.walk")
    (dotimes [j 7]
      (time
       (dotimes [i 10000]
         (assert (= data (w1/postwalk identity data))))))
    (newline)
    (println "New clojure.walk2")
    (dotimes [j 7]
      (time
       (dotimes [i 10000]
         (assert (= data (w2/postwalk identity data))))))))
