(ns clojure-euler.math-helper)

(defn multiple?
  [number divisor]
  (zero? (rem number divisor)))
