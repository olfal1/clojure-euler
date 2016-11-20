(ns clojure-euler.helpers.string-helper
  (:require
    [clojure.string :as string]))

(defn palindrome?
  "Returns whether a string with even number of characters is a palindrome."
  [string]
  (let [number-size (count string)]
    (if (even? number-size)
      (let [first-half (subs string 0 (/ number-size 2))
            second-half (subs string (/ number-size 2))]
        (= first-half (string/reverse second-half)))
      false)))
