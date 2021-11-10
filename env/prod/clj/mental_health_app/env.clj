(ns mental-health-app.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[mental-health-app started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[mental-health-app has shut down successfully]=-"))
   :middleware identity})
