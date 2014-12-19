(ns cd-talk.core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [cd-talk.core.config :as config]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/config" [] (str config/config))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
