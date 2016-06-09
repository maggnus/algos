package fibonacci

import lib.math.fibonacci.method.FibRecursionAlgo
import org.scalatestplus.play._

class FibRecursionTest extends PlaySpec {

  val fibN = 13
  val fibM = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)

  "Test Recursion method" must {
    "be equal " + fibN in {
      FibRecursionAlgo(8) mustBe fibN
    }
    "be equal " + fibM in {
      FibRecursionAlgo(1, 15) mustBe fibM
    }
  }
}