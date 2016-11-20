(ns clojure-euler.olfal1.problem-004
  (:require
    [clojure-euler.helpers.string-helper :as string]
    [clojure-euler.helpers.math-helper :as math]))


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
       (filter #(string/palindrome? %))
       (filter #(three-digit-factors? %))
       (first)))
