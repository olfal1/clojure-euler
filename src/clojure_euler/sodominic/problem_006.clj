(ns clojure-euler.sodominic.problem-006
  (:require [clojure-euler.math-helper :as math]))

(defn- sum-square-100-natural-numbers
  "Returns the sum of the square of the first 100 natural numbers"
  []
  (reduce + (map #(math/exp % 2) (range 1 101))))

(defn- square-sum-100-natural-numbers
  "Returns the square of the sum of the first 100 natural numbers"
  []
  (math/exp (reduce + (range 1 101) ) 2))

(defn solution-006
  "difference between the sum of the squares of the first 100 natural numbers and the square of the sum."
  []
  (- (square-sum-100-natural-numbers) (sum-square-100-natural-numbers)))
