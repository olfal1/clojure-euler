(ns clojure-euler.problem-007
  (:require
    [clojure-euler.helpers.math-helper :as math]))

(defn solution-007
  "Finds the 10 001st prime number."
  []
  (->> (range)
       (filter math/prime?)
       (take 10001)
       (last)))