package lib.math.fibonacci.method

/**
 * Calculate Fibonacci numbers with dynamic programming method
 */
object FibDynamicAlgo {

  /** Constructor for single Fibonacci number **/
  def apply(n: Int) = fib(n)

  /** Constructor for calculate array of Fibonacci numbers **/
  def apply(n1: Int, n2: Int) = fib(n1, n2)

  /**
   * Calculate array of Fibonacci numbers up to n(th) number
   * @param n - sequence number
   * @param m - init array with 0 and 1 numbers
   * @return
   */
  def fibSequence(n: Int, m: Vector[Long] = Vector(0, 1)): List[Long] = {
    val t = m.size
    n < t match {
      case true => m.take(n).toList
      case false => fibSequence(n, m :+ (m(t - 1) + m(t - 2)))
    }
  }

  /**
   * Calculate single Fibonacci number
   * @param n - sequence number
   * @return - n(th) Fibonacci number
   */
  def fib(n: Int): Long =
    n < 1 match {
      case true => throw new Exception("Input format error. Value must be positive.")
      case false => fibSequence(n).last
    }

  /**
   * Calculate array of Fibonacci numbers
   * @param n1 - first sequence number
   * @param n2 - last sequence number
   * @return - array of Fibonacci numbers
   */
  def fib(n1: Int, n2: Int): List[Long] =
    n2 < n1 || n1 < 1 || n2 < 1 match {
      case true => throw new Exception("Input format error. Interval values must be positive and in ascending order.")
      case false => fibSequence(n2).drop(n1 - 1)
    }
}
