# mapply

The ubiquitous mapply function.

## Supported Clojure Versions

mapply is tested on Clojure 1.5.1 only.  It may work on other Clojure versions.

## Maturity

This is production ready software.

## Installation

mapply is available as a Maven artifact from [Clojars]:
```clojure
[org.tobereplaced/mapply "1.0.0"]
```
mapply follows [Semantic Versioning].  Please note that this means the public API for this library is considered stable.

## Documentation

See the usage below.  mapply has been a long standing function used by various members of the clojure community.  Try typing `~mapply` on #clojure .  If the initial author of this function would like to stand up and take credit, please do.  This library has been supplied so that no one has to defn it themselves ever again.

## Usage

```clojure
(ns mapply-usage
  (:require (org.tobereplaced (mapply :refer [mapply]))))

(defn release-sharks
  [n & {:keys [laser-beams]}]
  (when laser-beams
    (println "OMG THEY HAVE LASER BEAMS!!!"))
  n)

(release-sharks 1)
;;; 1

(release-sharks 2 :laser-beams true)
;;; OMG THEY HAVE LASER BEAMS!!!
;;; 2

(mapply release-sharks 3 {:laser-beams true})
;;; OMG THEY HAVE LASER BEAMS!!!
;;; 3
```

## Changelog

### v1.0.0

- Initial Release

## Support

Please post any comments, concerns, or issues to the Github issues page.

## License

Copyright © 2013 ToBeReplaced

Distributed under the Eclipse Public License, the same as Clojure.  The license can be found at epl-v10.html in the root of this distribution.

[Clojars]: http://clojars.org/org.tobereplaced/mapply
[Semantic Versioning]: http://semver.org
