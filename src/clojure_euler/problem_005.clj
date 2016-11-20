(ns clojure-euler.problem-005
  (:require
    [clojure-euler.helpers.math-helper :as math]))

(defn- greatest-power-of-prime-under-limit
  "Returns the greatest power of prime smaller than limit.
   For example, if prime is 2 and limit is 10, returns 2^3 because it's the greatest power of 2 below 10."
  [prime limit]
  (loop [max-prime prime]
    (let [higher-prime (* max-prime prime)]
      (if (> higher-prime limit)
        max-prime
        (recur higher-prime)))))

(defn- prime-factors-smaller-than
  "Returns a vector of prime factors smaller than limit.
   For example, prime factors smaller than 10 are 2^3, 3^2, 5 and 7."
  [limit]
  (let [range (range 2 (inc limit))
        primes (vec (filter math/prime? range))]
    (loop [remaining-primes primes
           prime-factors []]
      (let [current-prime (last remaining-primes)]
        (if (empty? remaining-primes)
          prime-factors
          (recur (pop remaining-primes)
                 (conj prime-factors (greatest-power-of-prime-under-limit current-prime limit))))))))

(defn solution-005
  "Finds the smallest positive number evenly divisible by all of the numbers from 1 to 20."
  []
  (->> (prime-factors-smaller-than 20)
       (reduce *)))