(ns mental-health-app.app
  (:require [mental-health-app.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
