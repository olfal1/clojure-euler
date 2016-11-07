(ns clojure-euler.problem-001
  (:require
    [clojure.core]))

(defn multiple?
  [divisor number]
  (zero? (rem number divisor)))

(defn solution-function
  "Sum all numbers smaller than 1000 and multiple of 3 or 5"
  []
  (->> (range 1000)
       (filter #(or (multiple? 3 %) (multiple? 5 %)))
       (reduce +)))
