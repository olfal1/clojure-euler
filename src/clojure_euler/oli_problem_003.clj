(ns clojure-euler.oli-problem-003
  (:require
    [clojure.core]
    [clojure-euler.math-helper :as math]))

; Eratosthene's Sieve (too slow for large numbers)
(defn find-primes-in-range
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
(defn divisors
  "Returns a list of the divisors of the given number"
  [number]
  (loop [current-divisor 2
         divisors-list []]
    (if (> current-divisor (long (Math/sqrt number)))
      divisors-list
      (if (math/multiple? number current-divisor)
        (recur (inc current-divisor) (concat divisors-list (set [current-divisor (/ number current-divisor)])))
        (recur (inc current-divisor) divisors-list)))))

(defn prime?
  "Returns wether a number is a prime number"
  [number]
  (empty? (divisors number)))

(defn solution003
  "Finds the largest prime factor of 600851475143"
  []
  (->> (divisors 600851475143)
       (filter #(prime? %))
       (apply max)))
