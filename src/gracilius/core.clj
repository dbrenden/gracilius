(ns gracilius.core
  (:require [environ.core :refer [env]]))

(defmacro defprop [name kw default]
  `(defn ~name [] ~(or (env kw) default)))
