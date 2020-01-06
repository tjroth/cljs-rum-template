(ns hello.cruel-world
  (:require [rum.core :as rum]))

(defn what-kind? []
  "Not so Lovely anymore")

(js/console.log (what-kind?))


(rum/defc repeat-label [n text]
  [:div (vec (repeat n [:.label text]))])


;;(rum/mount (repeat-label 5 "Todd Roth, the clojure guy!") js/document.body)

(rum/defc timer []
  [:div (.toISOString (js/Date.))])

;;(rum/mount (timer) js/document.body)



(rum/defc labelandt []
  [:div
   [:p "hello"]
   [:div (timer)]
   [:p]
   [:div (repeat-label 10 "Awesome CLJS!!!")]])
  ;; [:div timer]])

(js/setInterval
      #(rum/mount (labelandt) js/document.body)
      1000)

;;(rum/mount (labelandt) js/document.body)
