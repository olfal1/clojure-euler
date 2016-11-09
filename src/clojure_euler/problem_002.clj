(ns clojure-euler.problem-002
  (:require
    [clojure.core]))

(defn fibonacci-seq
  "Lazy seq of infinite fibonacci terms"
  ([]
   (fibonacci-seq 1 2))
  ([a b]
   (lazy-seq (cons a (fibonacci-seq b (+ a b))))))

(defn solution002
  "Sums all even-valued terms of the Fibonacci sequence under 4 million"
  []
  (as-> (take-while #(< % 4000000) (fibonacci-seq)) terms
        (filter #(even? %) terms)
        (reduce + terms)))
