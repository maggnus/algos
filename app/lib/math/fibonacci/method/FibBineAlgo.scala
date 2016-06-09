package lib.math.fibonacci.method

/**
 * Calculate Fibonacci numbers with Bine formula
 */
object FibBineAlgo {

  /** Constructor for single Fibonacci number **/
  def apply(n: Int) = fib(n)

  /** Constructor for calculate array of Fibonacci numbers **/
  def apply(n1: Int, n2: Int) = fib(n1, n2)


  /**
   * Calculate array of Fibonacci numbers up to n(th) number
   * @param n - sequence number
   * @return
   */
  def fib(n: Int): Long = {
    n < 1 match {
      case true => throw new Exception("Input format error. Value must be positive: " + n)
      case false =>
        n < 3 match {
          case true => n - 1
          case false =>
            val s = math.sqrt(5)
            val f = (1 + s) / 2
            val w = 1 / f
            ((math.pow(f, n - 1) - math.pow(w, n - 1)) / s).round
        }
    }
  }

  /**
   * Calculate array of Fibonacci numbers
   * @param n1 - first sequence number
   * @param n2 - last sequence number
   * @return - array of Fibonacci numbers
   */
  def fib(n1: Int, n2: Int): List[Long] = {
    n2 < n1 || n1 < 1 || n2 < 1 match {
      case true => throw new Exception("Input format error. Interval values must be positive and in ascending order.")
      case false =>
        val m = new Array[Long](n2 - n1 + 1)
        for (i <- 0 to (n2 - n1)) {
          m(i) = fib(n1 + i)
        }
        m.toList
    }
  }

}
