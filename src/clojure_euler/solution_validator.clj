(ns clojure-euler.solution-validator
  (:require [clojure.java.io :as io]))

(def solutions-filepath "solutions.csv")

(defn problem#->solution
  [problem#]
  (as-> (io/resource solutions-filepath) csv
        (slurp csv)
        (clojure.string/split csv #"\n")
        (filter #(clojure.string/includes? % problem#) csv)
        (mapcat #(clojure.string/split % #",") csv)
        (Integer/parseInt (second csv))))

(defn validate
  [problem# problem-function]
  (println problem#)
  (let [output (time (problem-function))
        solution (problem#->solution problem#)]
    (if (= solution output)
      (println (str "Success! Answer is " output))
      (println (str "Nope. Answer is not " output)))))
