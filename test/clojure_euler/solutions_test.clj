(ns clojure-euler.solutions-test
  (:require [clojure.test :refer :all]
            [clojure-euler.problem-001 :refer :all]
            [clojure-euler.problem-002 :refer :all]
            [clojure-euler.problem-003 :refer :all]
            [clojure-euler.solutions :refer :all]))

(deftest problem-001-test
  (testing "Solution 001"
    (is (= (get-solution "problem-001") (solution-001)))))

(deftest problem-002-test
  (testing "Solution 002"
    (is (= (get-solution "problem-002") (solution-002)))))

(deftest problem-003-test
  (testing "Solution 003"
    (is (= (get-solution "problem-003") (solution-003)))))
