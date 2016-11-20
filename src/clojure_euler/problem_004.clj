(ns clojure-euler.problem-004
  (:require [clojure-euler.helpers.math-helper :as math]
            [clojure-euler.helpers.string-helper :as string]))

(defn- between-100-and-999?
  [number]
  (and (>= number 100) (<= number 999)))

(defn- product-of-two-3-digit?
  "Returns true if the number is the product of two 3-digit numbers."
  [number]
  (loop [current-number 100]
    (if (or (> current-number 999) (> current-number (long (Math/sqrt number))))
      false
      (if (and (math/multiple? number current-number) (between-100-and-999? (/ number current-number)))
        true
        (recur (inc current-number))))))

(defn solution-004
  "Finds the largest palindrome made from the product of two 3-digit numbers."
  []
  (->> (range 998001 100001 -1)
       (filter #(string/palindrome? (str %)))
       (filter product-of-two-3-digit?)
       (first)))