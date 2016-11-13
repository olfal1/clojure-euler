(ns clojure-euler.oli-problem-003
  (:require
    [clojure.core]
    [clojure-euler.math-helper :as math]))

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

(defn solution003
  "Finds the largest prime factor of 600851475143"
  []
  (->> (range 3 600851475143 2)
       (find-primes-in-range)
       (filter #(math/multiple? 600851475143 %))
       (apply max)))
