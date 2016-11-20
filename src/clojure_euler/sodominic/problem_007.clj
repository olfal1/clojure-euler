(ns clojure-euler.sodominic.problem-007
  (:require [clojure-euler.helpers.math-helper :as math]))

(defn solution-007
  "Returns the 10001st prime number."
  []
  (loop [current-number 1
         number-of-primes 0]
    (if (math/prime? current-number)
      (if (= (inc number-of-primes) 10001)
        current-number
        (recur (inc current-number) (inc number-of-primes)))
      (recur (inc current-number) number-of-primes))))
