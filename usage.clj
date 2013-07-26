(ns mapply-usage
  (:require (org.tobereplaced (mapply :refer [mapply]))))

(defn release-sharks
  [n & {:keys [laser-beams]}]
  (when laser-beams
    (println "OMG THEY HAVE LASER BEAMS!!!"))
  n)

(release-sharks 1)
;;; 1

(release-sharks 2 :laser-beams true)
;;; OMG THEY HAVE LASER BEAMS!!!
;;; 2

(mapply release-sharks 3 {:laser-beams true})
;;; OMG THEY HAVE LASER BEAMS!!!
;;; 3
