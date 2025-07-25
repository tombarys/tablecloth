(defproject scicloj/tablecloth "7.059"
  :description "Dataset manipulation library built on the top of tech.ml.dataset."
  :url "https://github.com/scicloj/tablecloth"
  :license {:name "The MIT Licence"
            :url "https://opensource.org/licenses/MIT"}
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]}
  :profiles {:dev {:cloverage    {:runner :midje}
                   :dependencies [[midje "1.10.10"]
                                  [org.scicloj/clay "2-beta42"]]
                   :plugins      [[lein-midje "3.2.1"]
                                  [lein-cloverage "1.2.4"]]}})
