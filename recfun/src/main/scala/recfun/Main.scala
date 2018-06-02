package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else pascal(c, r-1) + pascal(c-1, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanceHelper(chars: List[Char], stack: Int): Boolean = {
        if(chars.isEmpty && stack == 0) true
        else if(chars.isEmpty) false
        else if(stack < 0) false
        else {
          val c: Char = chars.head
          if(c == '(') balanceHelper(chars.tail, stack + 1)
          else if(c == ')') balanceHelper(chars.tail, stack - 1)
          else balanceHelper(chars.tail, stack)
        }
      }

      balanceHelper(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if(money < 0 || coins.isEmpty) 0
      else if(money == 0) 1
      else countChange(money, coins.tail) + countChange(money - coins.head, coins)
    }
  }
