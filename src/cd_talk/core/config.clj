(ns cd-talk.core.config
  (:require [clojure.java.io :as io]))

(def ^:private default-config {:key "value"})

(defn get-resource-file []
  (read-string (slurp (io/resource "config.clj"))))

(def config (merge default-config (get-resource-file)))
