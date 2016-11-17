(ns clojure-euler.sodominic.problem-004
  (:require [clojure-euler.helpers.math-helper :as math]
            [clojure.string :as string]))

(defn- palindrome?
  "Returns true if the number is a palindrome"
  [number]
  (let [number-string (str number)
        number-size (count number-string)]
    (if (even? number-size)
      (let [first-half (subs number-string 0 (/ number-size 2))
            second-half (subs number-string (/ number-size 2))]
        (= first-half (string/reverse second-half)))
      false)))

(defn- product-of-two-3-digit?
  "Returns true if the number is the product of two 3-digit numbers"
  [number]
  (loop [current-number 100]
    (if (or (> current-number 999) (> current-number (long (Math/sqrt number))))
      false
      (if (and (math/multiple? number current-number) (<= (/ number current-number) 999) (>= (/ number current-number) 100))
        true
        (recur (inc current-number))))))

(defn solution-004
  "Returns the highest palindrome made from the product of two 3-digit numbers"
  []
  (loop [current-product 998001]
    (if (and (palindrome? current-product) (product-of-two-3-digit? current-product))
      current-product
      (recur (dec current-product)))))
