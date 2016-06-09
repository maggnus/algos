package fibonacci

import lib.math.fibonacci.method.FibBineAlgo
import org.scalatestplus.play._

class FibBineTest extends PlaySpec {

  val fibN = 13
  val fibM = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)

  "Test Bine method" must {
    "be equal " + fibN in {
      FibBineAlgo(8) mustBe fibN
    }
    "be equal " + fibM in {
      FibBineAlgo(1, 15) mustBe fibM
    }
  }
}