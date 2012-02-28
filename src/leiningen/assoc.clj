(ns leiningen.assoc
  (:refer-clojure :exclude [assoc])
  (:require [leiningen.core.main :as main]))

(defn- classify-args [args]
  (loop [acc {:kvs []}
         [arg & args] args]
    (if (.startsWith arg ":")
      (recur (update-in acc [:kvs] conj (read-string arg) (first args))
             (rest args))
      (clojure.core/assoc acc :task arg :args args))))

(defn ^{:help-arglists '[(project key value task & args)]} assoc
  "Run a task with new entries assoc'd into the project map."
  [project & args]
  (let [{:keys [kvs task args]} (classify-args args)]
    (main/apply-task task (apply clojure.core/assoc project kvs) args)))
