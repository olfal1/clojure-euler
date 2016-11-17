(ns clojure-euler.helpers.math-helper)

(defn multiple?
  "Returns wheter the first number is a multiple of the second number"
  [number divisor]
  (zero? (rem number divisor)))

(defn exp [x n]
  "Returns the result of x exp n"
  (reduce * (repeat n x)))

(defn factors
  "Returns a list of the factors of the given number"
  [number]
  (loop [current-number 1
         factors-list []]
    (if (> current-number (long (Math/sqrt number)))
      factors-list
      (if (multiple? number current-number)
        (recur (inc current-number) (concat factors-list (set [current-number (/ number current-number)])))
        (recur (inc current-number) factors-list)))))

(defn prime?
  "Returns whether a number is a prime number"
  [number]
  (= 2 (count (factors number))))
