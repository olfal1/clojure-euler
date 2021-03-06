(ns clojure-euler.problem-003
  (:require
    [clojure-euler.helpers.math-helper :as math]))

(defn- get-largest-prime-factor
  "Returns the largest prime factor of a number."
  [initial-number]
  (let [max-value (long (Math/sqrt initial-number))]
    (loop [number initial-number
           current-number 2]
      (if (or (> current-number max-value) (= current-number number))
        number
        (if (math/multiple? number current-number)
          (recur (/ number current-number) current-number)
          (recur number (inc current-number)))))))

(defn solution-003
  "Returns the largest prime factor of 600851475143."
  []
  (get-largest-prime-factor 600851475143))
