(ns clojure-euler.helpers.string-helper
  (:require
    [clojure.string :as string]))

(defn palindrome? [string]
  (= (string/reverse string) string))