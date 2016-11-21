(ns clojure-euler.sodominic.problem-010
  (:require
    [clojure-euler.helpers.math-helper :as math]))

(defn solution-010
  "Returns the sum of all primes below two million"
  []
  (loop [current-number 1
         sum-of-primes 0]
    (if (> current-number 2000000)
      sum-of-primes
      (if (math/prime? current-number)
        (recur (inc current-number) (+ sum-of-primes current-number))
        (recur (inc current-number) sum-of-primes)))))


(defn solution-010-2
  "Returns the sum of all primes below two million"
  []
  (->> (range 2000000)
       (filter math/prime?)
       (reduce +)))
