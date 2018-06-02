package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)

  val s = union(s1, s2)
  println(contains(s, 1))
  println(contains(s, 2))
  println(s)
  println(contains(s, 3))
  printSet(s)
  val d = map(s, (n: Int) => n * 2)
  printSet(d)
}
