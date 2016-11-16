(ns clojure-euler.math-helper)

(defn multiple?
  [number divisor]
  (zero? (rem number divisor)))

(defn exp [x n]
  (reduce * (repeat n x)))
