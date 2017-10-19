(ns game.core
  (use arcadia.core))

(log "hello")

(def cube (create-primitive :cube))

(defn cube-update [go key]
  (.. go transform (Rotate 0 10 0)))

(hook+ cube
       :update
       #'game.core/cube-update)

(defn array-get [dim]
  (->> (repeat dim [])
       (repeat dim)))

(defn array-at [a i j]
  (nth (nth a i) j))

(defn array-set [a i j e]
  (assoc a i (assoc (nth a i) j e)))

(let [array (array-get 4)]
  (array-at array 0 0)
  array
  (array-set array 0 0 1))




