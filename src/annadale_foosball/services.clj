(ns annadale-foosball.services
  (:use [compojure.core :only (defroutes GET POST)]
        [clojure.string :only (join split)])
  (:require [clojure.data.json :as json]
            [clojure.tools.logging :as log]
            [clojure.data.json :as json]
            [datomic.api :as d]
            [cheshire.core :refer :all]
            [taoensso.timbre :as timbre
             :refer (trace debug info warn error fatal spy)])
  )

(defn post-to-map [s]
  (->> (split s #"&")
    (map #(split % #"="))
    (map (fn [[k v]] [(keyword k) v]))
    (into {})))

(defroutes routes
  (POST "/decrypt" {body :body}
    ;(database/decrypt-data (slurp body))
    )
  (POST "/makeAdmin" {body :body}
   ; (login/make-admin (post-to-map (slurp body)))
   )
  (POST "/loginAdmin" {body :body}
    ;(login/login-admin (post-to-map (slurp body)))
    )
  (GET "/retrieveDatabase" [response]
    ;(database/display-all-results)
    ))