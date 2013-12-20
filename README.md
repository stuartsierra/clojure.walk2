# clojure.walk2

A reimplementation of the `clojure.walk` namespace.

Submitted as an enhancement to Clojure in [CLJ-1239](http://dev.clojure.org/jira/browse/CLJ-1239).

**This repo is for demonstration only.**
All further development/discussion should happen on
[Clojure's JIRA](http://dev.clojure.org/jira/browse/CLJ-1239)
and [mailing list](https://groups.google.com/forum/#!forum/clojure).

Differences from the original `clojure.walk`:

* Protocol-based dispatch for better performance

* Support for records (also implemented for the old clojure.walk
  in [CLJ-1105](http://dev.clojure.org/jira/browse/CLJ-1105),
  applied in Clojure 1.6)



## Releases and Dependency Information

No binary releases.

Run `lein install` in this directory, then use this dependency in a Leiningen project:

    [com.stuartsierra/clojure.walk2 "0.1.0-SNAPSHOT"]



## Usage

    (require '[clojure.walk2 :as walk])

The public API is identical to that of `clojure.walk`.

See [clojure.walk API documentation](http://clojure.github.io/clojure/clojure.walk-api.html)



## Tests

In this directory, run `lein test`. The test suite is the same as that
for `clojure.walk`, with some added tests for records.



## Benchmarks

In this directory, start a repl with `lein repl` and then:

    (require 'bench)
    (bench/bench 5)

Pass different numbers to `bench/bench` to run the test with different
random seeds. Call `bench/data` with the same random seed to see the
test data.

In my tests, `clojure.walk2` is about 2 times faster than
`clojure.walk`.



## License

Copyright © 2013 Stuart Sierra. All rights reserved.

The use and distribution terms for this software are covered by the
[Eclipse Public License 1.0] which can be found in the file
epl-v10.html at the root of this distribution. By using this software
in any fashion, you are agreeing to be bound by the terms of this
license. You must not remove this notice, or any other, from this
software.

[Eclipse Public License 1.0]: http://opensource.org/licenses/eclipse-1.0.php

