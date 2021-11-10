(ns mental-health-app.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [mental-health-app.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[mental-health-app started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[mental-health-app has shut down successfully]=-"))
   :middleware wrap-dev})
