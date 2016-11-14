(ns clojure-euler.olfal1.problem-004
  (:require
    [clojure.string :as string]
    [clojure-euler.math-helper :as math]))

(defn- palindrome?
  "Returns whether a number is a palindrome."
  [number]
  (let [number-string (str number)
        number-size (count number-string)]
    (if (even? number-size)
      (let [first-half (subs number-string 0 (/ number-size 2))
            second-half (subs number-string (/ number-size 2))]
        (= first-half (string/reverse second-half)))
      false)))

(defn- between-100-and-999?
  [number]
  (and (>= number 100) (<= number 999)))

(defn- get-three-digit-factors
  "Returns a list of the 3-digit factors of a number."
  [number]
  (loop [current-number 100
         factors-list []]
    (if (> current-number (long (Math/sqrt number)))
      factors-list
      (if (and (math/multiple? number current-number) (between-100-and-999? (/ number current-number)))
        (recur (inc current-number) (concat factors-list (set [current-number (/ number current-number)])))
        (recur (inc current-number) factors-list)))))

(defn- three-digit-factors?
  "Returns whether a number is composed of 3 digit factors."
  [number]
  (not (empty? (get-three-digit-factors number))))

(defn solution-004
  "Finds the largest palindrome made from the product of two 3-digit numbers."
  []
  (->> (range 999999 100001 -1)
       (filter #(palindrome? %))
       (filter #(three-digit-factors? %))
       (first)))
