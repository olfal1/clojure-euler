(ns clojure-euler.solutions-test
  (:require [clojure.test :refer :all]
            [clojure-euler.problem-001 :refer :all]
            [clojure-euler.problem-002 :refer :all]
            [clojure-euler.problem-003 :refer :all]
            [clojure-euler.problem-004 :refer :all]
            [clojure-euler.problem-005 :refer :all]
            [clojure-euler.problem-006 :refer :all]
            [clojure-euler.problem-007 :refer :all]
            [clojure-euler.problem-008 :refer :all]
            [clojure-euler.problem-009 :refer :all]
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

(deftest problem-004-test
  (testing "Solution 004"
    (is (= (get-solution "problem-004") (solution-004)))))

(deftest problem-005-test
  (testing "Solution 005"
    (is (= (get-solution "problem-005") (solution-005)))))

(deftest problem-006-test
  (testing "Solution 006"
    (is (= (get-solution "problem-006") (solution-006)))))

(deftest problem-007-test
  (testing "Solution 007"
    (is (= (get-solution "problem-007") (solution-007)))))

(deftest problem-008-test
  (testing "Solution 008"
    (is (= (get-solution "problem-008") (solution-008)))))

(deftest problem-009-test
  (testing "Solution 009"
    (is (= (get-solution "problem-009") (solution-009)))))