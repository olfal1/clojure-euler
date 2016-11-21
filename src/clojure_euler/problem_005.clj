(ns clojure-euler.problem-005)

(defn- greatest-common-divisor
  "Returns the greatest common divisor of two numbers."
  [first-number second-number]
  (if (zero? second-number)
    first-number
    (recur second-number (mod first-number second-number))))

(defn- least-common-multiple
  "Returns the least common multiple of two numbers."
  [first-number second-number]
  (/ (* first-number second-number) (greatest-common-divisor first-number second-number)))

(defn solution-005
  "Returns the smallest positive number that is evenly divisible by all of the numbers from 1 to 20"
  []
  (reduce least-common-multiple (range 1 21)))