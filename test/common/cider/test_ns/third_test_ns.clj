(ns cider.test-ns.third-test-ns)

(defn same-name-testing-function
  "Multiple vars with the same name in different ns's. Used to test ns-list-vars-by-name."
  []
  true)
