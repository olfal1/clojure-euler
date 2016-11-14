(ns clojure-euler.sodominic.problem-004)

(defn digits [n]
  (->> n str (map (comp read-string str))))

(defn palindrome?
  "Returns true if the number is a palindrome"
  [number]
  (let [digits (digits number)
        digits-count (count digits)]
    (if (> digits-count 1)
      (and (= (first digits) (last digits)) (palindrome? (mod (quot number 10) (math-tower/expt 10 (- digits-count 2)))))
      true)))

(defn solution-004
  "Returns the highest palindrome made from the product of two 3-digit numbers"
  []
  )
