(ns serpent-talk.talk
  (:require [camel-snake-kebab.core :as csk]))

(defn serpent-talk [string]
  (str "Serpent! You said: " (csk/->snake_case string)))
