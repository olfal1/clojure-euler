(ns clojure-euler.sodominic.problem-003
  (require
    [clojure-euler.math-helper :as math]))

(defn- factors
  "Sodominic draft : finds the factors of a number"
  [number]
  (reduce (fn [factors current-number]
            (if (math/multiple? number current-number)
              (into factors (set [current-number (/ number current-number)])) factors))
          []
          (range 1 (long (Math/sqrt number)))))

(defn- prime?
  "Returns true if the number is a prime number"
  [number]
  (= 2 (count (factors number))))

(defn solution-003
  "Returns the highest prime factor of a number"
  []
  (->> (factors 600851475143)
       (filter #(prime? %))
       (apply max)))