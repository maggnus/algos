ALGOS
=======

Algos it is simple RESTful service which provide calculation of some algorithms:

 * Fibonacci numbers

Installation
---------------

This project is written on Play Framework 2.5 with Scala and required minimum **Java 8 (JDK)** library

    $ java -version
    java version "1.8.0_25"

To compile project:

    $ git clone https://github.com/maggnus/algos

    $ cd ./algos

    $ ./bin/activator run

Open main page in browser with following link:

    http://localhost:9000

API endpoint:

    http://localhost:9000/api/v1

![Main screen]
(https://raw.githubusercontent.com/maggnus/algos/master/public/images/screen2.png)

Testing
---------
    $ ./bin/activator

    [algos] $ test

    [info] FibRecursionTest:
    [info] Test Recursion method
    [info] - must be equal 13
    [info] - must be equal List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)
    [info] FibBineTest:
    [info] Test Bine method
    [info] - must be equal 13
    [info] - must be equal List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)
    [info] FibDynamicTest:
    [info] Test Dynamic method
    [info] - must be equal 13
    [info] - must be equal List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)
    [info] ScalaTest
    [info] Run completed in 1 second, 60 milliseconds.
    [info] Total number of tests run: 6
    [info] Suites: completed 3, aborted 0
    [info] Tests: succeeded 6, failed 0, canceled 0, ignored 0, pending 0
    [info] All tests passed.
    [info] Passed: Total 6, Failed 0, Errors 0, Passed 6
    [success] Total time: 6 s, completed 09.06.2016 15:17:01



API
====

## GET /api/v1/fibonacci/:method/:request

Return single or sequence of Fibonacci numbers which is calculated with one of the available calculation method.

### Resource URL

    http://localhost:9000/api/v1/:method/:request

### Parameters

<table>
  <tr>
    <th>Parameter</th><th>Required</th><th>Description</th><th>Values</th>
  </tr>
  <tr>
    <td>method</td><td>yes</td><td>Fibonacci calculation method</td><td>recursive, dynamic, bine</td>
  </tr>
  <tr>
    <td>request</td><td>yes</td><td>Calculation request</td><td></td>
  </tr>
</table>

### Examples

Get 15th Fibonacci number with **recursive** algorithm

    http://localhost:9000/api/v1/fibonacci/recursive/15

Response:

    [377]


Get Fibonacci numbers start from 6th up to 23th with **Bine** method

    http://localhost:9000/api/v1/fibonacci/bine/6-23

Response:

    [[5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711]]

Complex request with **dynamic** calculation method

    http://localhost:9000/api/v1/fibonacci/bine/3,5,16-29

Response:

    [1,3,[610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811]]


Misc
====

Acknowledgements
----------------

**Algos** is authored and maintained by [mag_gnus][rsc]

[rsc]: http://maggnus.com

