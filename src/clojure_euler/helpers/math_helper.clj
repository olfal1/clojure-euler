(ns clojure-euler.helpers.math-helper)

(defn multiple?
  "Returns wheter the first number is a multiple of the second number."
  [number divisor]
  (zero? (rem number divisor)))

(defn exp [x n]
  "Returns the result of x exp n."
  (reduce * (repeat n x)))

(defn divisors
  "Returns a list of the divisors of the given number."
  [number]
  (loop [current-number 1
         divisors []]
    (if (> current-number (long (Math/sqrt number)))
      divisors
      (if (multiple? number current-number)
        (recur (inc current-number) (concat divisors (set [current-number (/ number current-number)])))
        (recur (inc current-number) divisors)))))

(defn prime?
  "Returns whether a number is a prime number."
  [number]
  (= 2 (count (divisors number))))
