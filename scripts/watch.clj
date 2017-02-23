(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'gracilius.core
   :output-to "out/gracilius.js"
   :output-dir "out"})
