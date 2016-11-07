(ns clojure-euler.core
  (:require
    [clojure.core]
    [clojure-euler.solution-validator :as validator]
    [clojure-euler.problem-001 :as problem-001]))

(defn -main
  [& args]
  (validator/validate "problem-001", problem-001/solution-function))
