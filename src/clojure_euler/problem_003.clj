(ns clojure-euler.problem-003
  (require [clojure.math.numeric-tower :as math-tower]
           [clojure-euler.math-helper :as math-helper]))

(defn factors
  "Find the factors of a number"
  [number]
  (reduce (fn [factors current-number]
            (if (math-helper/multiple? number current-number)
              (into factors (set [current-number (/ number current-number)]))
              factors))
          []
          (range 1 (math-tower/sqrt number))))

(defn is-prime
  "Returns true if the number is a prime number"
  [number]
  (= 2 (count (factors number))))

(defn solution-003
  "Highest prime factor of a number"
  []
  (apply max (filter #(is-prime %) (factors 600851475143))))
