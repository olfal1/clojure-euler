(ns clojure-euler.sodominic.problem-005)

(defn- divisible-by-1-to-20?
  "Returns true if the number is divisible by all the numbers between 1 and 20"
  [number]
  (loop [factors (range 1 21)]
    (if (empty? factors)
      true
      (let [[current-factor & remaining-factors] factors]
        (if (= 0 (mod number current-factor))
          (recur remaining-factors)
          false)))))

(defn solution-005
  "Returns the smallest number divisible by all the numbers between 1 and 20"
  []
  (loop [current-number 6840]                               ; 6840 is the product of 20 * 19 * 18, for more efficiency
    (if (divisible-by-1-to-20? current-number)
      current-number
      (recur (+ current-number 6840)))))
