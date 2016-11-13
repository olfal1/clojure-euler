(ns clojure-euler.problem-001
  (:require
    [clojure.core]
    [clojure-euler.math-helper :as math]))

(defn solution-001
  "Sum all numbers smaller than 1000 and multiple of 3 or 5"
  []
  (->> (range 1000)
       (filter #(or (math/multiple? % 3) (math/multiple? % 5)))
       (reduce +)))
