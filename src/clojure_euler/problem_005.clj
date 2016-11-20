(ns clojure-euler.problem-005)

(defn- greatest-common-divisor
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn- least-common-multiple
  [a b]
  (/ (* a b) (greatest-common-divisor a b)))

(defn solution-005
  []
  (reduce
    #(least-common-multiple %1 %2)
    (range 1 21)))