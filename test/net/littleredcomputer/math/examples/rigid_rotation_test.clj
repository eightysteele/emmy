;
; Copyright (C) 2015 Colin Smith.
; This work is based on the Scmutils system of MIT/GNU Scheme.
;
; This is free software;  you can redistribute it and/or modify
; it under the terms of the GNU General Public License as published by
; the Free Software Foundation; either version 3 of the License, or (at
; your option) any later version.
;
; This software is distributed in the hope that it will be useful, but
; WITHOUT ANY WARRANTY; without even the implied warranty of
; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
; General Public License for more details.
;
; You should have received a copy of the GNU General Public License
; along with this code; if not, see <http://www.gnu.org/licenses/>.
;

(ns net.littleredcomputer.math.examples.rigid-rotation-test
  (:refer-clojure :exclude [+ - * /])
  (:require [net.littleredcomputer.math.examples.rigid-rotation :as rigid]
            [clojure.test :refer :all]))

(deftest smoke
  (is (rigid/evolver 1 0.1 1 1.2 2 0.1 0.1 0.1 1 1 1)))
