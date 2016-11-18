(ns clojure-euler.sodominic.problem-009
  (:require [clojure-euler.helpers.math-helper :as math]))

(defn solution-009
  "Returns the product of the 3 elements of the Pythagorean triplet for which a + b + c = 1000"
  []
  (loop [m 1]
    (let [n (/ (- 1000 (* 2 (math/exp m 2))) (* 2 m))
          a (- (math/exp m 2) (math/exp n 2))
          b (* 2 m n)
          c (+ (math/exp m 2) (math/exp n 2))]
      (if (and (= (+ (math/exp a 2) (math/exp b 2)) (math/exp c 2)) (> m n) (not (ratio? n)))
        (* a b c)
        (recur (inc m))))))
