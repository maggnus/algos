package lib.math.fibonacci

import lib.math.fibonacci.method.{FibBineAlgo, FibDynamicAlgo, FibRecursionAlgo}

object FibonacciAlgo {

  val RECURSIVE_METHOD = "recursive"
  val DYNAMIC_METHOD = "dynamic"
  val BINE_METHOD = "bine"

  def getMethods = List(RECURSIVE_METHOD, DYNAMIC_METHOD, BINE_METHOD)

  def apply(n: Int, method: String): Long = method match {
    case RECURSIVE_METHOD => FibRecursionAlgo(n)
    case DYNAMIC_METHOD => FibDynamicAlgo(n)
    case BINE_METHOD => FibBineAlgo(n)
    case _ => throw new Exception("Unknown or not implemented calculation method")
  }

  def apply(n1: Int, n2: Int, method: String): List[Long] = method match {
    case RECURSIVE_METHOD => FibRecursionAlgo(n1, n2)
    case DYNAMIC_METHOD => FibDynamicAlgo(n1, n2)
    case BINE_METHOD => FibBineAlgo(n1, n2)
    case _ => throw new Exception("Unknown or not implemented calculation method")
  }
}
