(ns annadale-foosball.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [compojure.core :refer [defroutes GET POST]]
            [annadale-foosball.services :as services]))

(defroutes app-routes
;  services/routes
  (GET "/" [] (resp/redirect "/index.html"))
  (route/files "/" {:root "app"})
  (route/not-found "Not Found"))
