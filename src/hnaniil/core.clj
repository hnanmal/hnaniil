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
(def x 0)
(+ x 2)
(cond (= x 0) "영이다."
      (= x 1) "일이다."
      :else "다른거다.")

;; (let [rnd (rand-int 10)
;;       guess (Integer/parseInt (read-line))]
;;   (cond
;;     (= rnd guess) (println "You got my guess right!")
;;     :else (println "Sorry... guess again!")))