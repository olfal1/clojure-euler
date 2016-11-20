(ns clojure-euler.solutions
  (:require
    [clojure.java.io :as io]))

(def solutions-filepath "solutions.csv")

(defn get-solution
  "Takes the problem number (ex. problem-001) and returns the solution."
  [problem#]
  (as-> (io/resource solutions-filepath) csv
        (slurp csv)
        (clojure.string/split csv #"\n")
        (filter #(clojure.string/includes? % problem#) csv)
        (mapcat #(clojure.string/split % #",") csv)
        (read-string (second csv))))
