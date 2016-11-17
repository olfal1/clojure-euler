(ns clojure-euler.olfal1.problem-003
  (:require
    [clojure.core]
    [clojure-euler.helpers.math-helper :as math]))

; Eratosthene's Sieve (too slow for large numbers)
(defn- find-primes-in-range
  "Returns all prime numbers of the given collection"
  ([range]
   (loop [primes []
          remaining-numbers range]
     (if (empty? remaining-numbers)
       primes
       (let [primes (cons (first remaining-numbers) primes)
             remaining-numbers (filter #(not (math/multiple? % (first remaining-numbers))) remaining-numbers)]
         (recur (into [] primes) (into [] remaining-numbers)))))))

; faster solution
(defn- factors
  "Returns a list of the factors of the given number"
  [number]
  (loop [current-number 2
         factors-list []]
    (if (> current-number (long (Math/sqrt number)))
      factors-list
      (if (math/multiple? number current-number)
        (recur (inc current-number) (concat factors-list (set [current-number (/ number current-number)])))
        (recur (inc current-number) factors-list)))))

(defn- prime?
  "Returns whether a number is a prime number"
  [number]
  (empty? (factors number)))

(defn solution-003
  "Finds the largest prime factor of 600851475143"
  []
  (->> (factors 600851475143)
       (filter #(prime? %))
       (apply max)))
