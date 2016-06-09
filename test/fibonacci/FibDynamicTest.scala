package fibonacci

import lib.math.fibonacci.method.{FibDynamicAlgo, FibBineAlgo}
import org.scalatestplus.play._

class FibDynamicTest extends PlaySpec {

  val fibN = 13
  val fibM = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)

  "Test Dynamic method" must {
    "be equal " + fibN in {
      FibDynamicAlgo(8) mustBe fibN
    }
    "be equal " + fibM in {
      FibDynamicAlgo(1, 15) mustBe fibM
    }
  }
}