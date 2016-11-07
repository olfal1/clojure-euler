(ns clojure-euler.problem-001
  (:require
    [clojure-euler.solution-validator :as validator]))

(defn multiple?
  [divisor number]
  (zero? (rem number divisor)))

(defn solution1
  []
  (->> (range 1000)
       (filter #(or (multiple? 3 %) (multiple? 5 %)))
       (reduce +)))


(defn -main
  [& args]
  (validator/validate "problem-001", solution1))