package lib.math.fibonacci.method

/**
 * Calculate Fibonacci numbers with recursive method
 */
object FibRecursionAlgo {

  /** Constructor for single Fibonacci number **/
  def apply(n: Int) = fib(n)

  /** Constructor for calculate array of Fibonacci numbers **/
  def apply(n1: Int, n2: Int) = fib(n1, n2)

  /**
   * Calculate single Fibonacci number
   * @param n - sequence number
   * @return - n(th) Fibonacci number
   */
  def fib(n: Int): Long = {
    n < 1 match {
      case true => throw new Exception("Input format error. Value must be positive.")
      case false =>
        n < 3 match {
          case true => n - 1
          case false => fib(n - 1) + fib(n - 2)
        }
    }
  }

  /**
   * Calculate array of Fibonacci numbers
   * @param n1 - first sequence number
   * @param n2 - last sequence number
   * @param m - temp array
   * @return - array of Fibonacci numbers
   */
  def fib(n1: Int, n2: Int, m: List[Long] = List.empty): List[Long] = {
    n2 < n1 || n1 < 1 || n2 < 1 match {
      case true => throw new Exception("Input format error. Interval values must be positive and in ascending order.")
      case false =>
        n1 == n2 match {
          case true => (m :+ fib(n2))
          case false => fib(n1 + 1, n2, m :+ fib(n1))
        }
    }
  }

}
