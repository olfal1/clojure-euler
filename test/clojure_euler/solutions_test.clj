(ns clojure-euler.solutions-test
  (:require [clojure.test :refer :all]
            [clojure-euler.problem-001 :refer :all]
            [clojure-euler.solutions :refer :all]))

(deftest problem-001-test
  (testing "Problem 001"
    (is (= (get-solution "problem-001") (solution1)))))
