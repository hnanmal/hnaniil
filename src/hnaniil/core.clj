(ns hnaniil.core
  (:gen-class))

(defn tripple [n]
  (if (> n 50)
    100
    (* 3 n)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  
  
  (println (tripple 51))
  )
(def x 1)

(cond (= x 0) "영이다."
      (= x 1) "일이다."
      :else "다른거다.")

(let [rnd (rand-int 10)
      guess (Integer/parseInt (read-line))]
  (cond
    (= rnd guess) (println "You got my guess right!")
    :else (println "Sorry... guess again!")))

(defn test-x [x]
  (cond
    (< x 10) "less than"
    (> x 20) "greater than"
    :else "between"))
(test-x 15)
;; (require '[clojure.tools.logging :as log])

;; (log/info "Hello World")

;; (log/error (RuntimeException. "Exception for test") "Hello World?")
;; (println "Hello~")
;; (require '[puppetlabs.structured-logging.core :refer [maplog]])

;; (maplog :warn {:user-service "https://..."
;;                :status 503
;;                :elapsed 27}
;;         #(format "Failed to query user-service %s. Response: status %d"
;;                  (:user-service %) (:status %)))