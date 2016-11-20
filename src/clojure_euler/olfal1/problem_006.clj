(ns clojure-euler.olfal1.problem-006)

(defn- sum-first-n-integers
  "Returns the sum of the first n integers."
  [n]
  (/ (* n (inc n)) 2))

(defn- sum-square-first-n-integers
  "Returns the sum of the square of the first n integers"
  [n]
  (/ (* n (inc n) (inc (* n 2))) 6))

(defn solution-006
  "Finds the difference between the sum of the squares of the first one hundred
   natural numbers and the square of the sum."
  []
  (let [sum-100-first (sum-first-n-integers 100)]
    (- (* sum-100-first sum-100-first) (sum-square-first-n-integers 100))))