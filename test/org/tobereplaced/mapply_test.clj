(ns org.tobereplaced.mapply-test
  (:require (clojure (test :refer [deftest is]))
            (org.tobereplaced (mapply :refer [mapply])))
  (:import (clojure.lang ArityException)))

(deftest mapply-test
  (letfn [(foo [bar & {:keys [baz]}] [bar baz])]
    (is (= (mapply foo 0 {}) [0 nil])
        "should handle an empty map")
    (is (= (mapply foo 0 {:baz 1}) [0 1])
        "should handle a map with a used key")
    (is (= (mapply foo 0 {:spam 1}) [0 nil])
        "should handle a map with an unused key")
    (is (= (mapply foo 0 nil) [0 nil])
        "should handle nil")
    (is (thrown? ArityException (mapply foo {}))
        "should not accept an incomplete argument list")
    (is (thrown? IllegalArgumentException (mapply foo 0))
        "should not accept a non-seq as its final argument")))
