# lein-assoc

A higher-order Leiningen task to run tasks with ad-hoc project keys.

Deprecated by the addition of the `update` task in Leiningen 2.1.0.

## Usage

Put `lein-assoc` `"0.1.0"` into `:plugins` in your `:user` profile or
if you are on Leiningen 1.x do `lein plugin install lein-assoc 0.1.0`.

    $ lein assoc :warn-on-reflection true compile

## License

Copyright © 2012 Phil Hagelberg

Distributed under the Eclipse Public License, the same as Clojure.
